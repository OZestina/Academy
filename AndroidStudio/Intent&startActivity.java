//휴대폰에 있는 기본 기능과 연결할 때에는 하기 기능을 사용한다
//Intent intent = new Intent("[인텐트 내용]");
//startActivity(intent);

//액티비티간 이동
//Intent intent = new Intent(현재액티비티자바파일명.this, 넘어갈액티비티자바파일명.class);
//startActivity(intent);

//앱 외부로 이동
//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("[액션]"));
//startActivity(intent);
//액션 내용들
//갤러리: "content://media/internal/images/media"
//웹사이트: "http://m.naver.com"
//전화: "tel:/01011112222"


//앱/액티비티 종료는
//finish();


package com.example.mobile01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "메인페이지로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity6.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "갤러리로 가자",
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
            }
        });
        
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "네이버 가즈아",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "너에게 거는 중",
                        Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01011112222"));
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "우리 이제 그만하자",
                        Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
