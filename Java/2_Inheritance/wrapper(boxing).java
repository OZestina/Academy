import javax.swing.JOptionPane;

public class BoxingUnboxing1 {

	public static void main(String[] args) {
		//Wrapper클래스(포장클래스)
		String age = JOptionPane.showInputDialog("나이를 입력");
		
		//int 기본형을 가지고 정수와 관련된 여러가지 처리가 불가능
		//기본형과 관련된 여러가지 기능 처리를 하고자 하는 경우 사용하려고
		//기본형의 특징을 가지고 클래스로 만들어놓은 것을 wrapper 클래스라고 함
		//int -> Integer, double -> Double
		
		int age2 = Integer.parseInt(age);
		System.out.println(age2+1);
	}
}


public class BoxingUnboxing2 {

	public static void main(String[] args) {
		//원래는 참조형 변수에 들어있는 주소를 기본형 변수에 넣을 수 없다
		// => 자바는 변수가 선언될 때 변수에 들어가는 데이터 타입이 결정되기 때문
		//기본형과 기본형에 대한 포장클래스 간에만 가능하다

		Integer i1 = new Integer(0); //참조형
		int i2 = 0; //기본형 정수
		int i3 = 0;
		
		//참조형 변수(객체)에 기본형 값을 넣음: 오토박싱 (값을 주소값이라는 상자로 바꾼다)
		//기본형 변수에 참조형 값을 넣음: 오토언박싱 (상자는 빼고 값을 준다)
		i1 = i2;	//오토박싱
		i3 = i1;	//오토언박싱
	}
}


public class BoxingUnboxing3 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		//add(Object o): Object자리에는 모든 클래스가 다 들어갈 수 있다
		//== add(참조형 변수의 주소)
		
		//add로 기본형 값이 들어갈 때에는 참조형 변수로 오토박싱돼 전달되는 것
		list.add(true);	//Boolean	<- boolean
		list.add(100);	//Integer   <- int
		list.add(101.1);//Double    <- double
		list.add('c');	//Character <- char 
	}
}
