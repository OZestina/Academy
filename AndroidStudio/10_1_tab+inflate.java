//tab에 들어가는 내용을 별도 xml로 만들어서 각 탭을 누를 때 inflate 시키는 방법

//xml파일 - tab 내용
<LinearLayout
        android:id="@+id/tabSong"
        android:layout_width="match_parent"
        android:layout_height="500dp"
        android:orientation="vertical"
        android:background="@color/teal_200">
        <TextView
            android:id="@+id/text1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="제목을 보여주세요"/>
        <ImageView
            android:id="@+id/image1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:srcCompat="@drawable/mov01" />
        <Button
            android:id="@+id/songBtn"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="이미지 변환"/>
</LinearLayout>

//xml파일 - activity 파일
<TabHost
    android:id="@+id/tabHost"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_gravity="center">
        <TabWidget
            android:id="@android:id/tabs"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
        </TabWidget>
        <FrameLayout
            android:id="@android:id/tabcontent"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <LinearLayout
                android:id="@+id/tabSong"
                android:layout_width="match_parent"
                android:layout_height="500dp"
                android:orientation="vertical"
                android:background="@color/teal_200">
                
            </LinearLayout>
        </FrameLayout>
    </LinearLayout>
</TabHost>


//java class
public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        //분리시켜놓은 layout 파일을 넣을 layout 변수 (탭) 생성
        LinearLayout songLayout = findViewById(R.id.tabSong);

        //inflate할 View 객체 생성
        //분리시켜놓은 xml파일들을 객체화시키자 => inflate
        View songView = View.inflate(TabActivity.this, R.layout.song, null);

        //생성해둔 layout 변수 (탭)에 View 객체 연결(add)
        songLayout.addView(songView);

        //inflate layout 파일 안의 View를 사용하려면 find 앞에 해당 layout의 View 명을 붙여줘야 한다
        Button songBtn = songView.findViewById(R.id.songBtn);
        ImageView imageView = songView.findViewById(R.id.image1);

        songBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.mov03);
            }
        });
        

      
        //기본 탭 설정
        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();    //기초적인 tab 초기화

        //각 tab마다의 설정을 넣음
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");   //indicator에 들어가는게 나타나는 이름
        tabSpecSong.setContent(R.id.tabSong);   //layout을 끼워넣음
        tabHost.addTab(tabSpecSong);            //TabHost에 TabSpec 추가
}
