package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		int n1=0, n2=0, n3=0, n4=0;
		for (int i = 1; i <= 10; i++) {
			if (i%3==0) {
				n1 += i;
			}
		}
		System.out.println("n1: "+n1);
		
		for (int i = 3; i <= 10; i+=3) {
			n2+= i;
		}
		System.out.println("n2: "+n2);
		
		for (int i = 3; i <= 10; i++) {
			n3+= i;
			i+=2;
		}
		System.out.println("n3: "+n3);
		
		for (int i = 1; i <= 10; i++) {
			if(i%3==0) {
				n4+= i;
				i+=2;
			}
		}
		System.out.println("n4: "+n4);
		
		
		
		int m1 = 0, m2=0, m3=0;
		
		for (int i = 1; i <= 10; i++) {
			if (i%3 != 0) {
				m1 += i;
			}
		}
		System.out.println("m1: "+m1); //m1: 37
		
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				continue;	//다음 반복으로 넘어가라 (조건 만족 시 이하의 코드는 무시)
			}
			m2 += i;
		}
		System.out.println("m2: "+m2); //m2: 37
		
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				continue;	//다음 반복으로 넘어가라 (조건 만족 시 이하의 코드는 무시)
			}
			m3 += i;
			System.out.println(m3);
			
			if(m3>20) {
				m3 = m3-i;
				break;
			}
		}
		System.out.println("m3: "+m3); //m2: 37
		
	}

}
