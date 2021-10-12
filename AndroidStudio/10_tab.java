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
        android:id="@+id/tabHost"
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
