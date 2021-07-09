package 클래스생성;

public class 브런치카페 {

	public static void main(String[] args) {
		
		int coffeePrice = 3500;
		int coffeeCount = 5;
		int bagelPrice = 3000;
		int bagelCount = 3;
		
		계산긔 cal = new 계산긔();
		
		cal.multi(coffeePrice, coffeeCount);
		cal.multi(bagelPrice, bagelCount);
		
		cal.order("카페라테");
		cal.order("베이글");
		
		cal.add(1000, 2000);
		cal.div(55.5, 11.2);

	}

}
