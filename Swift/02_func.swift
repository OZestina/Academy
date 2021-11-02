//함수 선언
//func 함수명 (파라미터명: 파라미터 데이터 타입) -> 리턴 타입 {}
//리턴 타입이 없는 경우에는 빼고 작성한다
//func 함수명 (파라미터명: 파라미터 데이터 타입) {}

func printDay (date: String, day: String) -> Void {
	print(date + " " + day + "입니다.") }
printDay(date: "오늘은", day: "수요일")			//오늘은 수요일입니다.


//함수 사용 시 파라미터 입력에 변수명을 넣고 싶지 않을 경우,
//선언 시 파라미터명 앞에 '_'를 붙여준다
func add (_ n1: Int,_ n2: Int) -> Int {
	return n1+n2 }
print(add(2,3))						//5



var names = ["홍길동","홍길순","홍길정","홍길장"]
//1,3,마지막으로 친한 친구 이름 함수 정의: 튜플로 반환
func getNames(_ names: [String]) -> (f1:String, f3:String, f4:String) {
    return (names[0], names[2], names[names.count-1]) }

//언더바는 무시한다
var (n1, _, n3) = getNames(names)
print(n1)           //홍길동
print(n3)           //홍길장


//파라미터에 디폴트 값 지정 가능
func setLevel(_ name:String, _ level:String = "보통등급") {
    print(name+"님의 등급은 "+level+"입니다.")}

setLevel("홍길동")         //홍길동님의 등급은 보통등급입니다.
setLevel("홍길순","VIP")   //홍길순님의 등급은 VIP입니다.


//여러개 입력 시 ... 이용
func hobby(_ fields:String...) {
    print(fields) }
hobby("a","a")      //["a", "a"]
hobby("b","n","b")  //["b", "n", "b"]
