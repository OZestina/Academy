//layout.xml에서 ImageView 추가
//ImageView로 변수 선언
//사용할 이미지는 drawable 파일에 저장
//imageView.setImageResource(R.drawable.사진파일명); 로 이미지 바꾸기

public class MainActivity2_1 extends AppCompatActivity {

    ImageView imageView;    //변수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.iV1);       //id 연결

        select("홍길동");                             //함수 사용
        toast("홍길동님 환영합니다. t1 버튼을 눌렀어요.");//함수 사용

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                select(name);
            }
        });

    }//end of onCreate

    public void select(String tourName) {         //중복되는 부분 함수로 별도 추출
        String imgname="";
        if (tourName.equals("홍길동")){
            imgname = "car1.jpg";
            imageView.setImageResource(R.drawable.car1);    //이미지 소스 바꾸기 (이미지 다르게 보이게)
        } else if (tourName.equals("고길동")){
            imgname = "car2.jpg";
            imageView.setImageResource(R.drawable.car2);
        } else {
            imgname = "car3.jpg";
            imageView.setImageResource(R.drawable.car3);
        }
        toast(imgname);
    }

    public void toast(String string){ //중복되는 Toast 별도 메서드로 빼서 사용
        Toast.makeText(getApplicationContext(), "확인값>> "+string, Toast.LENGTH_SHORT).show();
    }

}
