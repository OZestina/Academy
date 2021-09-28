//xml파일에서 디자인한 view들을 java파일에서 인식 및 처리해줘야 액션이 가능하다.

// 1) 각 액티비티에서 사용할 view의 이름을 선언
//      > 인풋이 있는 텍스트의 경우 EditText로 선언
// 2) onCreate 메서드 안에 선언된 view의 이름과 xml view id를 연결
// 3) 사용
//      > 값 가져오기 --> getText()
//        String text = text1.getText().toString(); //텍스트는 toString() 한 번 더 해줘야한다
//      > 값 설정하기 --> setText()
//        text1.setText("결과는 "+sum);

//Toast(토스트)는 액션 시 하단에 작게 뜨는 알림창이다
//Toast.makeText(창띄울 위치, 띄울 텍스트, 띄울 시간).show();
//ex) Toast.makeText(getApplicationContext(), text,Toast.LENGTH_LONG).show();

//로그(콘솔)에 찍기
//Log.i("","[출력할 텍스트]");  //run 창에 뜬다

package com.example.mobile01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView text1;
    Button b1, b2;
    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = findViewById(R.id.text1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("","-------> 버튼을 클릭했음");  //run에 뜨는 로그
                String text = text1.getText().toString();
                Toast.makeText(getApplicationContext(), text,
                        Toast.LENGTH_LONG).show();
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);
                int sum = n1 + n2;

                text1.setText("결과는 "+sum);
            }
        });
    }
}
