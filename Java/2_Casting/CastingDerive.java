package com.mega.mvc08;

public class CastingDerive {

	public static void main(String[] args) {
		
		//파생된 데이터, 참조형 변수
		//형변환 (casting, 캐스팅)
		//참조형 형변환은 "상속관계에 있는 클래스간" 가능
		
		Stationary s = new Stationary();	//부모, 수퍼, 큰
		BPPen b = new BPPen();				//자식, 서브, 작
		
		//클래스 간의 크기는 개념을 가지고 큰 지/작은 지를 판별
		
		s = b;		//자동형변환, Up casting(업캐스팅): 큰 <--- 작
		//b = s;	//불가능
		b = (BPPen)s;	//강제형변환, Down casting(다운캐스팅): 작 <--- 큰
	}

}
