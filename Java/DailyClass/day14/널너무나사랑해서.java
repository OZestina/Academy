package 클래스사용;

import 클래스생성.TV;

public class 널너무나사랑해서 {

	public static void main(String[] args) {
		
		//new를 하면 멤버변수들이 heap영역에 복사
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다.
		TV myTv = new TV();	
		
		myTv.ch = 7;
		myTv.vol = 5;
		myTv.onOff = true;
		
		System.out.println("myTv의 채널은 "+myTv.ch);
		System.out.println("myTv의 볼륨은 "+myTv.vol);
		System.out.println("myTv의 전원은 "+myTv.onOff);
		
		TV yourTv = new TV();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		
		System.out.println("yourTv의 채널은 "+yourTv.ch);
		System.out.println("yourTv의 볼륨은 "+yourTv.vol);
		System.out.println("yourTv의 전원은 "+yourTv.onOff);

	}

}
