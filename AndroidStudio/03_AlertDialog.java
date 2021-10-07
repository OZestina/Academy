//AlertDialig
//버튼 클릭 시 뜨는 확인/선택/리스트선택 창

//AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this); //괄호 안에는 어느 페이지 위에서 띄울건 지 표시
//dlg.setTitle("이건 제목");              //팝업창 타이틀
//dlg.setIcon(R.mipmap.ic_launcher);     //내용에 아이콘 넣기. 아이콘은 이미지 폴더에 저장하고 이름 가져다 쓴다
//dlg.setMessage("you pushed me, too");   //나올 메시지 넣기: setMessage()
//dlg.setPositiveButton("확인",null);     //Yes 버튼, 누르면 실행되는 액션/링크
//dlg.setNegativeButton("neh",null);      //No 버튼, 누르면 실행되는 액션/링크
//dlg.show();                             //AlertDialog.Builder 보이기


//AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);           //AlertDialog.Builder 선언
//dlg.setTitle("자주가는 42트");
//String[] siteArray = new String[] {"42월드","깃헙"};                            //AlertDialog로 전달할 리스트 선언
//dlg.setItems(siteArray, new DialogInterface.OnClickListener() {                 //리스트를 넣고 싶으면 setItems()해서 클릭 옵션 넣어주면 됨!
//  @Override
//  public void onClick(DialogInterface dialog, int which) {                      //리스트 중에서 선택한 내용의 인덱스(0부터 시작)가 두번째 파라미터로 넘어감
//    Log.d("","선택한 인덱스 "+which+"번은 "+siteArray[which]+"야");
//    Intent intent = null;
//    if (which == 0){
//        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://42world.com"));
//    } else {
//        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com"));
//        Toast.makeText(getApplicationContext(), "깃헙 가즈아", Toast.LENGTH_SHORT).show();
//    }
//    startActivity(intent);                                                      //intent는 startActivity 잊지 말자
//  }
//  });//end of dlg.setItems
//dlg.show();                                                                     //.show() 도 잊지 말긔!


package com.example.mobile05;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("","button 1 clicked");
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("자주가는 42트");
                String[] siteArray = new String[] {"42월드","깃헙","네이버웹툰","다음웹툰","9gag"};
                dlg.setItems(siteArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("","선택한 인덱스 "+which+"번은 "+siteArray[which]+"야");
                        Intent intent = null;
                        if (which == 0){
                            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://42world.com"));
                        } else if (which == 1){
                            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com"));
                            Toast.makeText(getApplicationContext(), "깃헙 가즈아", Toast.LENGTH_SHORT).show();
                        } else if (which == 2){
                            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://webtoon.naver.com"));
                        } else if (which == 3){
                            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://webtoon.daum.com"));
                        } else {
                            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://9gag.com"));
                        }
                        startActivity(intent);
                    }
                });

                //dlg.setMessage("you pushed me");
                dlg.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("","what up?");
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("이건 제목");
                dlg.setIcon(R.mipmap.ic_launcher);  //
                //dlg.setMessage("you pushed me, too");
                String[] versionArray = new String[] {"oreo","kitkat","pie"};
                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("","선택한 인덱스는 "+which);
                    }
                });
                dlg.setPositiveButton("확인",null);   //Yes 버튼
                dlg.setNegativeButton("neh",null);  //No 버튼
                dlg.show();
            }
        });

    }
}
