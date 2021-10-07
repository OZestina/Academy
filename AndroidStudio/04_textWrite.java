//외부 스토리지에 저장해야해서 우선 권한을 줘야 한다
//permission 부분은 AndroidMenifest.xml 에 추가
//<application> 위에 와야함!
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
  
//파일 저장
// FileOutputStream file = openFileOutput(date+".txt",MODE_PRIVATE); //outputStream 
// file.write(schedule.getBytes());   //파일에 쓰기, 저장할 때 byte로 해야하는거여서 Byte로 형변환 필요
// file.close();                      //close하면서 저장됨! 반드시 필요!!
  
  
String date = text1.getText().toString();
String schedule = text2.getText().toString();
//파일에 저장해보자
 try {
    FileOutputStream file = openFileOutput(date+".txt",MODE_PRIVATE); //MODE_PRIVATE는 덮어쓰기, MODE_APPEND는 추가해서 쓰기!
    file.write(schedule.getBytes());  //저장할 때 byte로 해야하는거여서 Byte로 형변환 필요
    file.close();
  } catch (FileNotFoundException e) { //파일 없을 때 에러 처리
    e.printStackTrace();
    Log.d("","file not found");
  } catch (IOException e) {           //io에러 시 에러 처리
    e.printStackTrace();
    Log.d("", "error found while i/o");
  } catch (Exception e) {             //그 외 모든 에러 처리
    Log.d("", "other error found");
  }
text1.setText("");                    //입력값 칸 빈칸으로 리셋!
text2.setText("");


