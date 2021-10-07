//별도의 xml layout 페이지를 만들어서
//AlertDialog.Builder / toast 화면으로 보여줄 수 있다


public class MainActivity4 extends AppCompatActivity {

    Button button;
    EditText name1, email1;
    TextView name2, email2, textView;

    //인플레이션용 view객체 선언
    View dialogView, toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button = findViewById(R.id.button);
        name2 = findViewById(R.id.name2);
        email2 = findViewById(R.id.email2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //(버튼 클릭 시) dialogView 객체 생성
                dialogView = (View) View.inflate(MainActivity4.this, R.layout.dialog1,null);

                //inflate 안의 값을 바꿀 때에는 [view명].findViewById로 진행
                name1 = dialogView.findViewById(R.id.name1);
                email1 = dialogView.findViewById(R.id.email1);

                //AlertDialog.Builder 만들기
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity4.this);
                dialog.setTitle("사용자 정보 입력");
                dialog.setIcon(R.drawable.ic_launcher_foreground);

                //만든 inflation view를 dialog에 껴줌
                dialog.setView(dialogView);

                //확인 눌렀을 때 OnClickListender
                dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String name = name1.getText().toString();
                        String email = email1.getText().toString();
                        name2.setText(name);
                        email2.setText(email);
                    }
                });
                //취소 눌렀을 때 OnClickListender
                dialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        toastView = (View) View.inflate(MainActivity4.this, R.layout.toast1, null);
                        Toast toast = new Toast(MainActivity4.this);
                        toast.setView(toastView);

                        //inflate 안의 값을 바꿀 때에는 [view명].findViewById로 진행
                        textView = toastView.findViewById(R.id.textView8);
                        textView.setText("취소했습니다");
                        toast.show();
                    }
                });
                dialog.show();
            }
        });

    }
}
