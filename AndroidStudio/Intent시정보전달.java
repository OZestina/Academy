//activity 간 이동 시 
//첫 페이지에서 intent에 putExtra()로 정보를 전달하면
//  intent.putExtra("name","홍길동");
//두번째 페이지에서 해당 내용을 받아서 활용할 수 있다
//  Intent intent = getIntent();
//  intent.getStringExtra([데이터명]);  //데이터형마다 메서드 다름


//첫 페이지 (데이터 보냄)
button.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    //액티비티 이동하면서 데이터를 함께 보내려고 함
    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
    intent.putExtra("name","홍길동");    //String
    intent.putExtra("age",100);         //int
    intent.putExtra("height",199.9);    //double

    String[] hobby = {"놀기","자기","또놀기"};   //String배열
    intent.putExtra("hobby",hobby);

    ArrayList<String> subject = new ArrayList<>();  //ArrayList
    subject.add("computer"); subject.add("english"); subject.add("math"); subject.add("sports");
    intent.putExtra("subject", subject);

    startActivity(intent);
  }
});


//두번째 페이지
Intent intent = getIntent();
  String name = intent.getStringExtra("name");
  int age = intent.getIntExtra("age",0);
  double height = intent.getDoubleExtra("height",0);
  Toast.makeText(getApplicationContext(), "받은 이름은 >> "+name+"\n받은 나이는 >> "+age+"\n받은 키는 >> "+height,Toast.LENGTH_SHORT).show();

  String[] hobby = intent.getStringArrayExtra("hobby");
  Toast.makeText(getApplicationContext(),"취미는 >> "+hobby[0]+hobby[1]+hobby[2],Toast.LENGTH_SHORT).show();

  ArrayList<String> subject = intent.getStringArrayListExtra("subject");
  Toast.makeText(getApplicationContext(),"과목은 >> "+subject.get(0)+subject.get(1)+subject.get(2)+subject.get(3),Toast.LENGTH_SHORT).show();
