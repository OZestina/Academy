<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity7">

    <LinearLayout
        android:id="@+id/choice1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/textView4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="선택을 시작하겠습니까?"
            android:textSize="25dp" />

        <CheckBox
            android:id="@+id/checkBox"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="시작함"
            android:textColor="#0A3BEF"
            android:textSize="20dp" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/choice2"
        android:layout_width="match_parent"
        android:layout_height="401dp"
        android:orientation="vertical">

        <TextView
            android:id="@+id/textView5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="좋아하는 애완동물은?"
            android:textSize="25dp" />

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

            <RadioButton
                android:id="@+id/act7radio3"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="토끼"
                android:textColor="#057809"
                android:textSize="20dp" />
        </RadioGroup>

        <Button
            android:id="@+id/picBtn"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="선택완료"
            android:textSize="20dp" />

        <ImageView
            android:id="@+id/imageView7"
            android:layout_width="match_parent"
            android:layout_height="167dp"
            app:srcCompat="@drawable/ic_launcher_background" />

    </LinearLayout>

    <Switch
        android:id="@+id/act7switch"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20dp"
        android:text="시작함" />

    <Button
        android:id="@+id/choiceBtn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20dp"
        android:text="메인으로" />

</LinearLayout>


//================================================================

package com.mega.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity7 extends AppCompatActivity {

    Switch aSwitch;
    CheckBox checkBox;
    RadioGroup radio;
    ImageView imageView;
    Button button1, button2;
    LinearLayout start, pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        aSwitch = findViewById(R.id.act7switch);
        checkBox = findViewById(R.id.checkBox);
        radio = findViewById(R.id.act7radio);
        imageView = findViewById(R.id.imageView7);
        button1 = findViewById(R.id.picBtn);
        button2 = findViewById(R.id.choiceBtn);
        start = findViewById(R.id.choice1);
        pet = findViewById(R.id.choice2);

        //화면 안보이게 처리
        start.setVisibility(View.INVISIBLE);
        pet.setVisibility(View.INVISIBLE);
        //스위치 여부에 따라
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    start.setVisibility(View.VISIBLE);
                    if (checkBox.isChecked()) {
                        pet.setVisibility(View.VISIBLE);
                    }
                } else {
                    start.setVisibility(View.INVISIBLE);
                    pet.setVisibility(View.INVISIBLE);
                }
            }
        });
        //체크박스 여부에 따라
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
        //애완동물 버튼 클릭 시 이미지 변경
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
        //메인으로 클릭 시 웹사이트 이동
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/"));
                startActivity(intent);
            }
        });
    }
}
