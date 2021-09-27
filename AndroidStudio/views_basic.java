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
