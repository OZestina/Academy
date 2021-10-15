//SQLite3 이용 시 
//DDL: SQLiteOpenHelper 상속 클래스를 만들어서 이용
//     public class MyDBHelper extends SQLiteOpenHelper
//     myDBHelper = new MyDBHelper(this);

//DML 중 C,UD: SQLiteDatabase 객체 생성 및 sql문 시행
//            SQLiteDatabase sqlDB = myDBHelper.getWritableDatabase();                  //DB는 SQLiteOpenHelper에서 
//            sqlDB.execSQL("insert into groupTBL values ('"+name+"','"+number+"');");  //sql문 전달

//DML 중 select: Cursor 인터페이스 객체를 만들어서 사용
//               Cursor cursor = sqlDB.rawQuery(sql, null);


public class MyDBHelper extends SQLiteOpenHelper {

    public MyDBHelper(@Nullable Context context) {
        //생성자 필요, context값 받아서 DB와 연결
        super(context, "groupDB", null, 1);
        Log.d("sqlite 3 DDL","DB 생성 호출");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //테이블 create SQL문
        db.execSQL("CREATE TABLE groupTBL (gName char(20), gNumber INTEGER);");
        Log.d("sqlite 3 DDL","크리에이트 테이블 DDL호출");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //DB초기화 메서드: drop -> create
        db.execSQL("DROP TABLE IF EXISTS groupTBL");
        Log.d("sqlite 3 DDL","드롭테이블 호출");
        onCreate(db);
    }
}



public class MainActivity extends AppCompatActivity {

    EditText editName, editNumber;
    ListView nameResult, numberResult;
    Button btnInit, btnInsert, btnSelect, btnUpdate, btnDelete;

    MyDBHelper myDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editNumber = findViewById(R.id.editNumber);

        nameResult = findViewById(R.id.listName);
        numberResult = findViewById(R.id.listNumber);

        btnInit = findViewById(R.id.btnInit);
        btnInsert = findViewById(R.id.btnInsert);
        btnSelect = findViewById(R.id.btnSelect);
        btnDelete = findViewById(R.id.btnDelete);
        btnUpdate = findViewById(R.id.btnUpdate);
        
        //SQLiteOpenHelper 생성 시 context 필요해서 onCreate 안에 만듦
        myDBHelper = new MyDBHelper(this);

        btnInit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase sqlDB = myDBHelper.getWritableDatabase();  //DB정보를 SQLiteOpenHelper 객체에서 가져옴
                myDBHelper.onUpgrade(sqlDB, 1, 2);  //의미없는1,2...
                sqlDB.close();                                            //닫아줘야함!
            }
        });
        btnInsert.setOnClickListener(new View.OnClickListener() {         //데이터 입력
            @Override
            public void onClick(View v) {
                SQLiteDatabase sqlDB = myDBHelper.getWritableDatabase();  //DB정보를 SQLiteOpenHelper 객체에서 가져옴
                String name = editName.getText().toString();
                String number = editNumber.getText().toString();
                sqlDB.execSQL("insert into groupTBL values ('"+name+"','"+number+"');");  //sql문 전달
                sqlDB.close();
              
                editName.setText("");
                editNumber.setText("");
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {         //데이터 삭제
            @Override
            public void onClick(View v) {
                SQLiteDatabase sqlDB = myDBHelper.getWritableDatabase();
                String name = editName.getText().toString();
                sqlDB.execSQL("delete from groupTBL where gName = '"+name+"';");
                sqlDB.close();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {         //데이터 수정
            @Override
            public void onClick(View v) {
                SQLiteDatabase sqlDB = myDBHelper.getWritableDatabase();
                String name = editName.getText().toString();
                String number = editNumber.getText().toString();
                sqlDB.execSQL("update groupTBL set gNumber = '" + number + "' where gName = '"+name+"';");
                sqlDB.close();
            }
        });
        btnSelect.setOnClickListener(new View.OnClickListener() {         //데이터 검색
            @Override
            public void onClick(View v) {
                ArrayList<String> names = new ArrayList<>();
                ArrayList<String> numbers = new ArrayList<>();

                SQLiteDatabase sqlDB = myDBHelper.getWritableDatabase();
                String sql = "select * from groupTBL";
                Cursor cursor = sqlDB.rawQuery(sql, null);                //Cursor.rawQuery()에 sql문을 보냄

                while (cursor.moveToNext()){                              //Cursor.moveToNext()로 검색결과 돌리기
                    //cursor.moveToNext() 첫번째 행을 가리키면서 있는지 없는지 체크 => 있으면 true 리턴
                    //각 열에 있는 값들을 index로 꺼내오면 됨 (index는 0부터 시작)
                    names.add(cursor.getString(0));
                    numbers.add(cursor.getString(1));
                }
                cursor.close();                                           //Cursor 객체도 닫아줘야해!
                sqlDB.close();

                //Adapter 객체 생성
                ArrayAdapter<String> adapter =  new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, names);
                ArrayAdapter<String> adapter2 =  new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, numbers);
                //ArrayAdapter<String> adapter3 =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
              
                nameResult.setAdapter(adapter);
                numberResult.setAdapter(adapter2);
            }
        });
    }
}
