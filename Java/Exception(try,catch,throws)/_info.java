//try~catch, throws는 런타임에러를 잡는 아이임!

//ArithmeticException: 산술계산 예외 (0으로 나누는 등...)
//IOException: 입출력 예외
//IndexOutOfBoundsException: 배열 인덱스 에러
//Exception: 모든 예외

public class Problem02 {

	public static void main(String[] args) {
		
		System.out.println("1.나는 프린트 될까요.");  //됩니다
		try {
			System.out.println("2.문제 발생 줄" + 10/0); //에러발생!
			FileWriter file = new FileWriter("test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
		} catch (ArithmeticException e1) {  //산술로 인한 에러 발생 시
			e1.printStackTrace();
		} catch (IOException e2) {          //input, output으로 인한 에러 발생 시 (ex. 파일처리 등)
			e2.printStackTrace();
			System.out.println("파일에 쓰는 중 에러 발생");
		} catch (Exception e) {             // 모든 에러 발생 시
			e.printStackTrace();
			System.out.println("모든 에러를 처리함...");
		} finally {
			//에러의 발생 유무와는 상관없이 반드시 실행해주어야 하는 부분은 여기에 넣음
			System.out.println("예외처리 완료!");
		}
		System.out.println("3.나는 프린트 될까요?");  //에러 예외처리하면 프린트됨
  }
}


//다른 클래스 내의 메서드에서 에러가 발생할 수 있는 경우 두 가지 처리 방법이 있다
//1) 에러가 발생 가능한 곳에서 try catch를 사용해 처리 - 메서드 사용하는 곳에 상관 없이 같은 처리 가능

public class ArrayError {
	public void array() {
		int[] num = {1,2,3};
		try {
			num[3] = 4;
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("인덱스 에러");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("다른 에러 발생");
		} finally {
			System.out.println("배열에 문제가 사라지게 해결..");
		}
	}
}


//2) 메서드에서는 throw 처리를 하고, 메서드를 실제로 사용하는 곳에서 try catch 처리 - 메서드를 사용하는 곳에 따라 다른 처리 구현 가능
//메서드
public class ArrayError2 {
	public void array() throws IndexOutOfBoundsException, Exception {
		int[] num = {1,2,3};
		num[3] = 4;
		System.out.println("end of array");
	}
}

//메서드 사용(main)
public class ArrayError3 {

	public static void main(String[] args) {
		ArrayError2 error = new ArrayError2();
		try {
			error.array();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("인덱스 에러");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("다른 에러 발생");
		} finally {
			System.out.println("배열에 문제가 사라지게 해결..");
		}
		System.out.println("배열 끝");
	}
}
