// 인터페이스 -> 프로토콜
// extends/implements -> :

class Page1: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func page1Act(_ sender: UIButton) {
//        guard 함수
//        - 반드시 가져가야할 조건들을 검사하는 파트
//        - if문으로 대체 가능하지만 가독성을 위해 guard를 사용한다.
//        - guard 조건 else {조건이 false인 경우 수행되는 구문}
//        - 조건이 true이면 guard문은 그냥 지나가고 false이면 else구문을 수행한 뒤 함수를 바로 종료한다.
//        - 이때, 암묵적인 종료가 아니라 묵시적인 종료이므로 return이나 throw 등 종료하는 명령이 존재해야 하며, 없으면 컴파일 에러가 난다.
        guard let go = self.storyboard?.instantiateViewController(withIdentifier: "Page4") else {
            //storyboard가 nil일 때 실행
            return
        }
      //go 실행
        self.present(go, animated: true)
    }
    
    @IBAction func back1Act(_ sender: UIButton) {
      //뒤로 돌아가기 (이전 페이지로 돌아가기)
        self.presentingViewController?.dismiss(animated: true)
    }
}


//페이지 이동 시 값 넘기고 받기
//1) 값 넘기기
@IBAction func page5Act(_ sender: UIButton) {
    //!강제언랩핑(unwrapping)
    //객체로 만들어진 것을 순수한 타입으로 변경
    //idText.text = Optional("root")
    //idText.text! = "root"
    let id = idText.text!
    let pw = pwText.text!

    //스위프트에서 사용하는 기본형은 모두 구조체
    //구조체는 struct 키워드 사용
    //상속값은 기능이 제한적
//        struct Int{
//            var min = ___
//            var max = ___
//        }

  //프린트 시 \() 안에 넣으면 변수, 코드연산값 사용 가능
    print("가지고 온 id는 \(id) ****")
    print("가지고 온 id는 \(pw) ****")

    if id == "root" && pw == "1234"{
        print("로그인 성공")
        let alert = UIAlertController(title: "로그인 성공", message: "페이지를 이동합니다", preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: "확인", style: .default){
            action in
            //확인 누르면 페이지 이동하게 만들어보자
            //값을 넘기려면 각 view에 이름을 정해줘야 한다(Page5 등)
            //다운 캐스팅할 때 as 키워드 이용
            guard let go = self.storyboard?.instantiateViewController(withIdentifier: "Page5") as? Page5ViewController else {
                return
            }
            //[페이지 이동 변수.변수명] 으로 값 넘김
            //받는 넘기는 변수와 동일한 변수의 이름으로 자동으로 넘어간다
            //받는 컨트롤러에서 같은 조건으로 선언된 id, pw, arr 필요 (아니면 에러 발생)
            go.id = id
            go.pw = pw
            go.arr = [1,2,3,4,5]
            //페이지 이동 실행
            self.present(go, animated: true)
        })
        self.present(alert, animated: true, completion: nil)
    } else {
        print("로그인 실패")
    }

}


//2)값 받기
class Page5ViewController: UIViewController {
    //값을 저장할 변수를 넘어오는 변수명과 동일하게 만들어준다
    var id = ""
    var pw = ""
    var arr : [Int] = []
    
    @IBOutlet var labelId: UILabel!
    @IBOutlet var labelPw: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        print("받은 id 값은 >> "+id)
        print("받은 pw 값은 >> "+pw)
        // Do any additional setup after loading the view.
        labelId.text = id
        labelPw.text = pw
    }
}
