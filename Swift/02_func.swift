//함수 선언
//func 함수명 (파라미터명: 파라미터 데이터 타입) -> 리턴 타입 {}
//리턴 타입이 없는 경우에는 빼고 작성한다
//func 함수명 (파라미터명: 파라미터 데이터 타입) {}

func printDay (date: String, day: String) -> Void {
	print(date + " " + day + "입니다.")
}

printDay(date: "오늘은", day: "수요일")			//오늘은 수요일입니다.


//함수 사용 시 파라미터 입력에 변수명을 넣고 싶지 않을 경우,
//선언 시 파라미터명 앞에 '_'를 붙여준다
func add (_ n1: Int,_ n2: Int) -> Int {
	return n1+n2;
}

print(add(2,3))									//5

