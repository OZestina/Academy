//프린트!
print("Hello, world!")
print("welcome to swift branch")


//변수 선언에는 두 가지 방법이 있다
//1) 정석 => var 변수명 : 타입명 = 값
//2) 간편 => var 변수명 = 값
//간편 방법의 경우 변수에 값이 입력되면서 타입이 추측되며,
//정수의 경우 Int로, 실수의 경우 Double로 추측된다

//기본 자료형
//정수, 실수, 논리, 문자
var age : Int = 99
var weight : Double = 22.2
var food : Bool = false
var gender : Character = "남"
var name : String = "홍길동"

//','는 빈칸을 사이에 두고 합해서 출력
print("나이는", age)       //나이는 99
print("몸무게는", weight)
print("점심은", food)
print("성별은", gender)
print("이름은", name)

//max값 확인해보기
print(Int.max)
print(UInt.max)           //Unsigned를 U로 줄여서 하는듯!

var someValue : Any = "test"    //자바에서의 object와 비슷
print(someValue)

someValue = 100                 //변수의 데이터 타입이 Any여서 스트링도, 정수도 담을 
print(someValue)
