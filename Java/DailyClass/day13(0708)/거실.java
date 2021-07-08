package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		
		phone1.brand = "iPhone";
		phone1.color = "White";
		phone1.howOld = 3;
		
		System.out.println(phone1.brand);
		System.out.println(phone1.color);
		System.out.println(phone1.howOld);
		
		phone1.call();
		phone1.number();
		
		Dog dog1 = new Dog();
		dog1.age = 10;
		dog1.color = "Brown";
		
		dog1.bark();
		System.out.println(dog1.shit());

	}

}
