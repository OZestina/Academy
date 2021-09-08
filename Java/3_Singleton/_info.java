//객체지향(OOP, object oriented program)은 RAM에 들어있는 주소를 가지고 CPU가 조립한다.
//주소는 new로 객체 생성 시 생기므로, 객체를 많이 만들 수록 메모리가 필요하게 된다.

//Singleton: 싱글톤은 객체를 하나만 만들고, 더 이상 만들지 않는 방법을 말한다
//멤버 변수 값이 객체 생성 시 매번 똑같다고 한다면 (혹은 멤버변수 값이 중요하지 않다고 한다면) 여러번 객체를 생성해줄 필요가 없다.
//객체를 한 번 생성한 후 멤버변수값을 넣은 후, 그 값을 가지고 메서드만 호출하는 경우는 객체를 한 번만 만들어준다
//서버의 경우 부하를 줄이기 위해 싱글톤 방법을 쓴다 -> DAO, Controller, myBatis, dbcp, ...

// <-> 프로토타입(VO, value object): 필요할 때 클래스의 인스턴스인 객체를 만들어서 사용하는 방법
//     멤버변수 값이 객체생성 시 변하는 객체가 있으면 매번 객체를 만들어 해당 객체의 값을 넣어주어햐 한다. 

//싱글톤 만드는 방법 2가지!
//1) context 파일에 넣어라
//2) annotation을 달아라

//필요한 메서드를 사용하기 위해 클래스를 싱글톤 방법으로 생성
public class SingleObject {
	static int count;
	static SingleObject object;
	
	private SingleObject() {
		System.out.println("SingleObject 객체 생성됨");
		count++;
	}
	
	//싱글톤은 객체를 하나만 만들고, 더 이상 만들지 않는 방법을 말한다
	//getInstance라는 static 메서드를 만들어서 객체가 이미 만들어졌는지 체크를 하게 된다.
	public static SingleObject getInstance() {
		if(object == null) {
			//object가 null이라는 것은 아직 객체가 하나도 안만들어졌다라는 의미
			//객체가 만들어지면 주소가 들어가야 하는데 null이 들어가있기 때문
			object = new SingleObject();
		}
    //object가 null이 아니라면, 객체가 만들어져서 주소가 들어갔다는 의미
    //이미 만들어진 object 반환하면 됨
		return object;
	}
}


//메서드의 사용
public class SingleUser {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			SingleObject sin1 = SingleObject.getInstance();
			if (i < 3) {
				System.out.println(sin1);	//출력되는 주소 모두 동일
			}
		}
		System.out.println(SingleObject.count+"개");	//1개
	}
}
