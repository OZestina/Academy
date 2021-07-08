package 이차원배열;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//많은 양의 데이터를 다룰 때, 가변적이고 다양한 데이타인 경우 사용
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("potato");
		Random r = new Random();
		list.add(r);

		//사실 모두 참조형으로 저장된 것 (기본형 데이터도 마찬가지)
		System.out.println(list);	//주소값이 아닌 내용이 나옴
		
		//리스트 길이 구하는건 size()!
		System.out.println(list.size());
		
		//리스트 인덱스는 (리스트명).get(n) 으로 구함
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//인덱스 지우기 => (리스트명).remove(n)
		list.remove(4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================");
		
		//set: 집합, 중복된 값을 허용하지 않음.
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set);	//주소값이 아닌 내용이 나옴
	}

}
