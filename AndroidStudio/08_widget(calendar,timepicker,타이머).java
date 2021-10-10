//메뉴에 없는 widget은 xml code 창에서 추가 가능
//Chronometer: 타이머(초시계)
  <Chronometer
      android:id="@+id/chronometer"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:format=" 예약에 걸린 시간 %s " />
//CalenderView
  <CalendarView
      android:id="@+id/calendarView1"
      android:layout_width="match_parent"
      android:layout_height="wrap_content" />
//TimePicker
  <TimePicker
      android:id="@+id/timePicker1"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:timePickerMode="spinner" /> //두 종류의 모드가 있다
//DatePicker
  <DatePicker
      android:id="@+id/datePicker1"
      android:layout_width="match_parent"
      android:layout_height="match_parent"/>
      
        
//라디오버튼으로 선택 시 Calendar와 TimePicker가 번갈아가면서 노출되도록 하고 싶은 경우,
//Frame 레이아웃을 추가해 그 안에 widget을 넣으면 겹쳐서 들어가게 된다
//라디오버튼은 radioButtonGroup 안에 하면 하나로 묶여서 그 중 하나만 선택 가능하도록 된다 (xml에서 설정)

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
    Button btnStart, btnEnd;
    RadioButton rdoCal, rdoTime;  
    CalendarView calView;
    TimePicker timePicker;
    TextView result;

    //필요한 변수 선언
    String totalDate = "";
    String timeTotal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("날짜, 시간 예약");  //액티비티마다 타이틀을 바꿀 수 있다
      
        chrono = findViewById(R.id.chro1);
        btnEnd = (Button) findViewById(R.id.btnEnd);
        btnStart = findViewById(R.id.btnStart);
        rdoCal = findViewById(R.id.rdoCal);
        rdoTime = findViewById(R.id.rdoTime);
        calView = findViewById(R.id.calendarView1);
        timePicker = findViewById(R.id.timePicker1);
        result = findViewById(R.id.result);

        //일단 둘 다 안보이게 처리
        calView.setVisibility(View.INVISIBLE);
        timePicker.setVisibility(View.INVISIBLE);

        //radio 버튼에 따라 보이는게 다르게 처리
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.INVISIBLE);
                timePicker.setVisibility(View.VISIBLE);
            }
        });
        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calView.setVisibility(View.VISIBLE);
                timePicker.setVisibility(View.INVISIBLE);
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //크로노미터는 버튼을 눌렀을 때를 베이스로 해서 시작하게
                //(근데 이렇게 하면 시작버튼을 누를때마다 0부터 시작함...)
                chrono.setBase(SystemClock.elapsedRealtime());
              //시작!
                chrono.start();
                chrono.setTextColor(Color.BLUE);    //색은 대문자로...
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //멈춰!!!
                chrono.stop();
                chrono.setTextColor(Color.GREEN);
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                timeTotal = hour+"시 "+minute+"분";
                //toast(timeTotal);
                result.setText(totalDate+" "+timeTotal);
            }
        });

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                totalDate = year+"년 "+(month+1)+"월 "+dayOfMonth+"일";
                //toast("입력된 날짜는 "+totalDate);
            }
        });
    } //end of onCreate

    public void toast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
