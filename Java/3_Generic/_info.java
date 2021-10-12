//Generic 제너릭 프로그램
//generic = general ←→ detailed = specific
//클래스 생성시 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법
//즉, 객체 생성시(new!) 사용할 데이터의 타입을 정할 수 있는 문법이다.
//제너릭 프로그램을 사용하면 데이터를 넣고 뺄 때 캐스팅 할 필요가 없어진다. (자바 1.8에 추가)
//ArrayList, HashMap 등 꺽쇠 안에 들어갈 데이터들의 타입을 정해주면 업캐스팅, 다운캐스팅 필요 없이 해당 타입의 데이터들을 넣고 뺄 수 있다.
//ArrayList<> 는 제네릭 프로그램임!


//클래스도 제네릭 문법을 사용할 수 있다

public class Car<T> {
	T size;

	@Override
	public String toString() {
		return "Car [size=" + size + "]";
	}
}


public class CarUse {

	public static void main(String[] args) {
		
		Car<String> car1 = new Car<String>();
		Car<Integer> car2 = new Car<Integer>();
		car1.size = "big";
		car2.size = 100;
		
		System.out.println(car1);	//Car [size=big]
		System.out.println(car2);	//Car [size=100]
	}
}


//여러개도 사용 가능하다
public class Truck<T,P> {
	T weight;
	P distance;
	
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}
}


public class TruckUse {

	public static void main(String[] args) {
		
		Truck<String, Integer> t1 = new Truck<String, Integer>();
		Truck<Integer, String> t2 = new Truck<>();
		
		t1.weight = "중량무게";
		t1.distance = 100;
		
		t2.weight = 1000;
		t2.distance = "장거리";
		
		System.out.println(t1);	//Truck [weight=중량무게, distance=100]
		System.out.println(t2); /Truck [weight=1000, distance=장거리]

	}

}
