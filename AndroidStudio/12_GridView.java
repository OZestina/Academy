//테이블과 같은 격자 모양으로 정보를 담을 수 있는 GridView

//xml : GridView
<GridView
    android:id="@+id/gridView1"       //id 지정 필요
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:numColumns="4" />         //한 행에 몇개의 아이템을 표기할거니?
      
      
//Adapter java class
//기본 adapter는 ArrayList, Array의 데이터를 순서대로 넣어주는 기능만 있음
//BaseAdapter를 상속받아 별도의 Adapter 클래스를 정의하면 데이터 하나 하나의 배치 모양을 정해서 어댑팅 가능
public class PerfectAdapter extends BaseAdapter {
    Context context; // 외부에서 받아와야하는 context 값을 위해 변수 선언

    PerfectAdapter(Context c) { // 객체 생성 시 context 값 전달 필수로하는 생성자 선언
        context = c;
    }

    //데이터 id 및 정보 저장한 배열
    int[] posterID = {R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,R.drawable.mov04,
            R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09};
    String[] title = {"그림1", "그림2", "그림3", "그림4", "그림5", "그림6", "그림7", "그림8", "그림9"};

    //추상 클래스인 BaseAdapter를 사용하기 위해 추상메서드 오버라이드 필수
    @Override
    public int getCount() {             //몇 개의 정보를 보여줄거니
        return posterID.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int idx, View view, ViewGroup viewGroup) {  //어떤 정보를 보여줄거니(View)
        // 반복되는 하나의 View객체를 만들어주어야 함
      
        //one.xml에 배열의 정보를 담아서 보여줄거야~
        View one = View.inflate(context, R.layout.one, null);
        TextView top = one.findViewById(R.id.toptext);
        ImageView img = one.findViewById(R.id.img1);

        img.setImageResource(posterID[idx]);
        top.setText(title[idx]);
        //one.xml 설정
        one.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        one.setPadding(5,5,5,5);
        return one;
    }
}
      
      
//activity
public class GridActivity extends AppCompatActivity {

    int[] scores = new int[9];        //점수 취합용 배열 전역변수로 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_background);
        setTitle("그리드부 영화 포스터");

        //activity's xml의 그리드뷰와 연결되는 변수 선언
        GridView gridView = findViewById(R.id.gridView1);

        //GridView와 Adapter 연결
        PerfectAdapter gridAdapter = new PerfectAdapter(this);            //(Context) this = GridActivity
        gridView.setAdapter(gridAdapter);
        
        //GridView의 각 항목 클릭 시 발생 action 설정
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //클릭 시 detail.xml 레이아웃을 띄울거야 - 이 아래 내용은 inflate 
                View detail = View.inflate(GridActivity.this, R.layout.detail, null);
                ImageView detailImg = detail.findViewById(R.id.detailImg);
                detailImg.setImageResource(gridAdapter.posterID[position]);

                Button detailBtn = detail.findViewById(R.id.detailBtn);
                EditText detailText = detail.findViewById(R.id.detailText);

                AlertDialog.Builder dialog = new AlertDialog.Builder(GridActivity.this);
                dialog.setTitle("투표 상세페이지");
                dialog.setIcon(R.drawable.ic_launcher_foreground);
                dialog.setView(detail);
                dialog.setNegativeButton("닫기",null);

                detailBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = Integer.parseInt(detailText.getText().toString());
                        scores[position] += num;
                        Toast.makeText(getApplicationContext(), num+"점 입력됨. 총 "+scores[position]+"점", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }
}
