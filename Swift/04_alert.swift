//UI는 스토리보드 상에서 모두 진행
//각 페이지 UI와 페이지와 연결 필요
//메인페이지 외의 다른 페이지 기능은 swift파일을 각각 생성하여 진행해야 한다

//하기는 버튼 클릭 시 alert 띄우는 내용
import UIKit

class ViewController: UIViewController {
    @IBOutlet var button2: UIButton!
    @IBOutlet var button1: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        print("finally swift on mac")
    }
    
    
    @IBAction func button1Click(_ sender: UIButton) {
        print("button pressed!")
        let alert = UIAlertController(title: "알림", message: "얼럿 메세지 입니다.", preferredStyle: .alert)
        alert.addAction(UIAlertAction(title: "확인", style: .default) { [self] action in
        self.button1.setTitle("확인완료", for: .normal)
                })
        self.present(alert, animated: true, completion: nil)
    }
    
    @IBAction func button2Click(_ sender: UIButton) {
        print("button pulled!")
    }
    
    
}

