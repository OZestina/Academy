//많은 양의 데이터를 View에 넣어주는 것을 adapter라고 한다


//XML) ListView는 리스트 항목을 보여주는 위젯
<ListView
        android:id="@+id/listView1"           //Design으로 추가 시 id 자동 설정 안되니 code에서 직접 추가하자!
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
          
          
//JAVA) 
public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        setTitle("리스트뷰 테스트");

        //많은 양의 데이터를 View에 넣어주는 것을 adapter라고 한다.

        //데이터: mid
        ArrayList<String> mid = new ArrayList<>();
        mid.add("히어로즈");
        mid.add("24시");
        mid.add("로스트");
        mid.add("빅뱅이론");

        //view 준비, ListView 객체
        ListView listView = findViewById(R.id.listView1);

        //adapter 객체 생성
        //객체 생성 시 activity (this), 레이아웃(simple_list_item_1), 데이터(mid) 필요
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mid);
            
        //new ArrayAdapter'<>'에 에러가 발생하는 경우, activity가 this로 안잡혔을 가능성이 있다
        //그럴때는 this대신, getApplicationContext() / MainActivity.this 를 사용해보자
//         ArrayAdapter<String> adapter 
//                 =  new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, names);
//         ArrayAdapter<String> adapter2 
//                 =  new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, numbers);
            

        //ListView 객체에 adapter 세팅
        listView.setAdapter(adapter);


        Button button = findViewById(R.id.AdtButton);
        EditText editText = findViewById(R.id.AdtEditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();
                mid.add(data);

                //데이터 추가 후  Adapter 객체 refresh 필요
                adapter.notifyDataSetChanged();
            }
        });

        //listView의 항목을 클릭했을 때 어떤 action을 일어나게 하고 싶다면..!
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int index, long l) {
                //세번째 파라미터 : 클릭된 아이템의 위치(ListView의 첫번째 아이템(가장위쪽)부터 차례대로 0,1,2,3.....)
                //네번재 파리미터 : 클릭된 아이템의 아이디(특별한 설정이 없다면 세번째 파라이터인 position과 같은 값)
                String data = mid.get(index);
                Toast.makeText(getApplicationContext(), index+": "+data+", "+l, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
