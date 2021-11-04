//음악의 background 재생을 위해 service 생성
//AndroidMenifest.xml에 하기 내용 자동 추가
//  <service
//     android:name=".MyService"
//     android:enabled="true"
//     android:exported="true"></service>

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1, btn2, btn3;
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        //java class 생성: 우클릭 > new > Service > Service
        //background에서 계속 실행해주는 것을 service라고 한다

        intent = new Intent(this, MyService.class);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);   //onStartCommand 실행됨
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);    //onDestroy 실행됨
            }
        });
    }
}




//[MyService.java(Service)]===============================================
package com.mega.mobile11;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {

    //menu > Code > override methods 선택 후 필요한 메서드 선택하면 자동으로 생성
    MediaPlayer mediaPlayer;

    public MyService() { }

    @Override
    public void onCreate() {
        Log.d("백그라운드 서비스>>", "서비스 객체 생성됨");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //service에서 실행할 명령어 넣기
        Log.d("백그라운드 서비스>>", "서비스 명령어 실행됨");
        mediaPlayer = MediaPlayer.create(this, R.raw.kbs);
        mediaPlayer.setLooping(true);   //loop
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("백그라운드 서비스>>", "서비스 객체 소멸됨");
        mediaPlayer.stop(); //음악 멈춰!
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //service binding 시 에러가 났을 경우, 그에 따른 처리 방법을 넣어두는 곳
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
