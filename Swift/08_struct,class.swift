//구조체 struct
//상속을 못하는 자료형
//인스턴스 생성 시 stack에 생성
struct Sample {
    
    //멤버변수(인스턴스변수)
    var name : String = ""
    var age : Int = 100
    //스태틱 변수
    static var count : Int = 0
    
    //생성자 (이니셜라이저)
    //오버로딩
    init() { print("구조체 생성") }
    init(name:String, age: Int) {
        self.name = name
        self.age = age }
    
    //멤버함수(일반함수)
    func play(_ hour: Int) -> String {
        return "나는 " + String(hour) + "시간 놀래" }
    //스태틱함수
    static func getCount() -> Int {
        return count }
    
}

//인스턴스 생성
var s1 : Sample = Sample()
var s2 : Sample = Sample(name: "kim", age: 20)

s1.name = "hong"
s1.age = 100
print(s1)
print(s2)


//Int 구조체 안에 생성돼있는 static변수는 바로 사용 가능
print(Int.max)
print(Int.min)




//클래스
//상속 가능
//객체 생성 시 heap 영역에 저장
//소멸자(deinitializer) 지정 가능
class Student {
    var name : String
    var age : Int
    
    init(name:String, age:Int) {
        print("student instance have made")
        self.age = age
        self.name = name }
    
    deinit {
        print("deleted")
    }
    
    //타입과 클래스 메서드 모두 인스턴스에서 이용 불가
    //클래스명.메서드명 으로만 이용가능
    //type은 상속 불가 (static)
    //class메서드는 상속 가능
    static func typeMethod() {
        print("parent class - type")
    }
    
    class func classMethod() {
        print("parent class - class")
    }
    
}

//c에 nil값도 저장될 수 있도록 ?객체로 생성
var c : Student? = Student(name: "kim", age: 20)

//deinit
c = nil


//클래스 상속
//클래스 생성 시 "자식 : 부모" 로 선언
//자식 객체는 부모 객체가 먼저 만들어지고 그것을 확장해서 만드는 개념
//자식의 생성자가 호출될 때 부모의 생성자가 먼저 호출된다
//부모의 생성호출은 마지막줄에 써야한다

class Go3 : Student {
    var univ : String
    
    init(name:String, univ:String) {
        self.univ = univ
        super.init(name: name, age: 19)
    }
}
