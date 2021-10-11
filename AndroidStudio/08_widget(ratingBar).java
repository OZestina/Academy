


//java class
public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar1;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar1 = findViewById(R.id.ratingBar1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() { //별점 증가버튼
            @Override
            public void onClick(View v) {
                ratingBar1.setRating(ratingBar1.getRating() + ratingBar1.getStepSize());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { //별점 감소버튼
            @Override
            public void onClick(View v) {
                ratingBar1.setRating(ratingBar1.getRating() - ratingBar1.getStepSize());
            }
        });

    }
}

//layout.xml
<RatingBar
    android:id="@+id/ratingBar1"
    android:layout_width="336dp"
    android:layout_height="wrap_content" />

<RatingBar
    android:id="@+id/ratingBar2"
    style="@style/Widget.AppCompat.RatingBar.Small"     //스타일 지정 가능 (디폴트, Small, Indicator까지 총 3개)
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:numStars="10"                               //총 별 개수 지정 가능 (디폴트는 5개)
    android:stepSize="1" />                             //한 스텝 당 채워지는 별 수

<RatingBar
    android:id="@+id/ratingBar3"
    style="@style/Widget.AppCompat.RatingBar.Indicator"
    android:layout_width="360dp"
    android:layout_height="wrap_content"
    android:rating="1.5" />                             //디폴트 별점
