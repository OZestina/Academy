//1) 네트워크 연결할 MySQL server 정보: 주소와 연결 - ip, port
//2) 연결할 MySQL server에 승인을 받아야 함 - id, pw 필요

//Java와 MySQL과의 연결 순서는 정해져 있다 (JDBC 프로그래밍)
//> Java DB Connectivity
//  1) connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1.커넥터 설정 성공!");   //설정이 잘 됐는 지 확인하는 문장 :)
      
//  2) MySQL server의 DB와 연결하고 승인을 받자
      String url = "jdbc:mysql://" + ip + ":" + port + "/shoes"
      //jdbc:mysql://localhost:3306/shoes
      DriverManager.getConnection(url,id, pw);
      
      
//  3) (승인 후) SQL을 만들자
//  4) SQL을 MySQL server에 전송
