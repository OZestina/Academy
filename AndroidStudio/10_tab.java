//탭으로 나눠진 것
//손코딩도 가능하고, Palette> Legacy> TabHost 로 선택해서 사용도 

//xml 파일
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".TabActivity">
<!--context: 안드로이드에서는 activity 하나를 의미
            스프링 프로젝트에서는 project 하나를 의미-->

    <TabHost
        android:id="@+id/tabHost"                       //id 정해주자
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_gravity="center">
            
              <TabWidget
                android:id="@android:id/tabs"           //정해진 id로 써야함 => "@android:id/tabs"
                android:layout_width="match_parent"
                android:layout_height="wrap_content">
            </TabWidget>
            
            <FrameLayout
                android:id="@android:id/tabcontent"     //정해진 id로 써야함 => "@android:id/tabcontent"
                android:layout_width="match_parent"
                android:layout_height="wrap_content">
                
                <LinearLayout                           //탭1화면
                    android:id="@+id/tabSong"
                    android:layout_width="match_parent"
                    android:layout_height="500dp"
                    android:orientation="vertical"
                    android:background="@color/teal_200">
                    <TextView
                        android:id="@+id/text1"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="제목을 보여주세요"/>
                </LinearLayout>

                <LinearLayout                           //탭2화면
                    android:id="@+id/tabArtist"
                    android:layout_width="match_parent"
                    android:layout_height="500dp"
                    android:orientation="vertical"
                    android:background="@color/purple_200">
                    <TextView
                        android:id="@+id/text2"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="가수를 보여주세요"/>
                </LinearLayout>

                <LinearLayout                           //탭3화면
                    android:id="@+id/tabAlbum"
                    android:layout_width="match_parent"
                    android:layout_height="500dp"
                    android:orientation="vertical"
                    android:background="@color/white">
                    <TextView
                        android:id="@+id/text3"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:text="앨범을 보여주세요"/>
                </LinearLayout>
                
            </FrameLayout>
        </LinearLayout>
    </TabHost>

</LinearLayout>


//java class
public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup();    //기초적인 tab 초기화

        //각 tab마다의 설정을 넣음
        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");   //indicator에 들어가는게 나타나는 이름
        tabSpecSong.setContent(R.id.tabSong);   //layout을 끼워넣음
        tabHost.addTab(tabSpecSong);            //TabHost에 TabSpec 추가

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

    }
}
