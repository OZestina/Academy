//Convert view에서 바로 TableLayout을 설정할 수 있다 (전체 페이지를 TableLayout 적용 시)




// 액티비티 상단 바에 아이콘 넣기 (좌측)
// getSupportActionBar().setDisplayShowHomeEnabled(true);  //
// getSupportActionBar().setIcon(R.drawable.pici_icon);    //화살표를 아이콘으로 바꾸겠다
// setTitle("명화선호도 투표");


//layout.xml 파일

<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center_vertical"       //테이블을 중앙에 오도록
    tools:context=".ResultActivity"         //Activity와의 연결 (Activity에도 xml 연결 코드가 있음!)
    android:stretchColumns="0">             //table column을 stretch해라 (좌우에 쫙 붙음!)

    <TableRow>
        <TextView
            android:id="@+id/tV1"
            android:layout_gravity="center_vertical"
            android:text="img1"
            android:textSize="15dp"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
        <RatingBar
            android:id="@+id/rBar1"
            style="@style/Widget.AppCompat.RatingBar.Indicator"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="right" />
    </TableRow>

    <TableRow>
        <TextView
            android:id="@+id/tV2"
            android:layout_gravity="center_vertical"
            android:text="img2"
            android:textSize="15dp"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
        <RatingBar
            android:id="@+id/rBar2"
            style="@style/Widget.AppCompat.RatingBar.Indicator"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="right" />
    </TableRow>

    <TableRow>
        <Button
            android:id="@+id/btnReturn"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_span="2"                 //2칸 
            android:text="돌아가기"
            android:textSize="10pt"
            />
    </TableRow>

</TableLayout>
