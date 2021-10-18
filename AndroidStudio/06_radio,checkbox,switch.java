//RadioButton은 RadioGroup으로 묶어서 관리한다
//CheckBox
//Switch

<CheckBox
        android:id="@+id/checkBox"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="시작함"
        android:textColor="#0A3BEF"
        android:textSize="20dp" />
            
<RadioGroup
    android:id="@+id/act7radio"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <RadioButton
        android:id="@+id/act7radio1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="강아지"
        android:textColor="#057809"
        android:textSize="20dp" />
    <RadioButton
        android:id="@+id/act7radio2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="고양이"
        android:textColor="#057809"
        android:textSize="20dp" />
</RadioGroup>

<Switch
    android:id="@+id/act7switch"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:textSize="20dp"
    android:text="시작함" />

// Java Class ===============================================

public class MainActivity7 extends AppCompatActivity {

    Switch aSwitch;
    CheckBox checkBox;
    RadioGroup radio;
    LinearLayout start, pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        aSwitch = findViewById(R.id.act7switch);
        checkBox = findViewById(R.id.checkBox);
        radio = findViewById(R.id.act7radio);
        start = findViewById(R.id.choice1);
        pet = findViewById(R.id.choice2);

        //화면 안보이게 처리
        start.setVisibility(View.INVISIBLE);
        pet.setVisibility(View.INVISIBLE);
        
        //스위치를 조작했을때, 그 결과물에 따라 달라지는 것
        //스위치 setOn펑션의 boolean 값(하기에서는 isChecked)은 true, false로 나온다
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    start.setVisibility(View.VISIBLE);
                } else {
                    start.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        //체크박스 여부에 따른 정보는 CheckBox.isChecked()로 받아온다
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    pet.setVisibility(View.VISIBLE);
                } else {
                    pet.setVisibility(View.INVISIBLE);
                }
            }
        });
        
        //라디오 버튼 클릭 시 이미지 변경
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio.getCheckedRadioButtonId() == R.id.act7radio1) {
                    imageView.setImageResource(R.drawable.dog);
                } else if (radio.getCheckedRadioButtonId() == R.id.act7radio2) {
                    imageView.setImageResource(R.drawable.cat);
                } else {
                    imageView.setImageResource(R.drawable.rabbit);
                }
            }
        });
    }
}
