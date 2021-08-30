package com.mega.mvc08;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Casting1 {
	
	public static void main(String[] args) {
		
		//리스트 
		ArrayList list = new ArrayList();
		BPPen pen1 = new BPPen();
		pen1.brand = "monami";
		pen1.price = 500;
		pen1.thickness = 0.5;
		
		list.add(pen1);
		list.add("kim");		//Up casting (자동형변환)
		list.add(new Date());	//Up casting (자동형변환)
		list.add(new Random());	//Up casting (자동형변환)
		list.add(100);			//오토박싱 -> up casting
		list.add(11.11);		//오토박싱 -> up casting
		
		//리스트에서 꺼내 쓸 때에는 
		//down casting(강제형변환) (-> 오토언박싱) 되어 나옴!
		
		//up casting object로 들어간 객체는 원 클래스가 가지고 있던
		//자식에서 추가된 메서드 및 변수를 쓸 수 없게 된다 (자식에서 추가된 메서드, 변수 인식 못함)
		Object pen2 = list.get(0);	//자식 메서드, 변수 사용 불가!
		
		//자식에서 추가된 메서드, 변수를 사용하고 싶으면
		//다시 자식 타입으로 down casting (강제형변환)해야한다
		BPPen pen3 = (BPPen)list.get(0);
		System.out.println(pen3.thickness);	//자식메서드, 변수 사용 가능!
		pen3.buy();
		pen3.write();
		
		//다운캐스팅(object->integer) 및 오토언박싱(Integer->int) 진행
		int age = (Integer)list.get(4);
		int age1 = (int)list.get(4);
	}
}
