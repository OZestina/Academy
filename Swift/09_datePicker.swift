import UIKit

class ViewController: UIViewController {

    @IBOutlet var currentTime: UILabel!
    @IBOutlet var chosenTime: UILabel!
    
    //카운팅 기준 (1초) - line18
    let interval = 1.0
    //#selector는 (실행 전) 컴파일 시 미리 확인해서 확인해줘 안전하다
    let timeSelector : Selector = #selector(ViewController.updateTime)
    var count = 0
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //타이머 생성
        //기준이 되는 timeInterval은 변수로 생성해서 대입해줌
        //selector는 별도 함수 생성해서 대입
        Timer.scheduledTimer(timeInterval: interval, target: self, selector: timeSelector, userInfo: nil, repeats: true)
        
        //백그라운드 색 변경
        view.backgroundColor = UIColor.orange
        
        //날짜찍기 (자바 방식)
        let date = NSDate()
        var formatter = DateFormatter()
        formatter.dateFormat = "yy-MM-dd HH:mm EEE"
        //as로 다운해서 넣어줌
        currentTime.text = "현재시각: " + formatter.string(from: date as Date)
        print(date)
    }
    
    //#selector 펑션 만들어보자 -> #selector 함수는 앞에 @objc를 꼭꼭 붙여줘야한다
    @objc func updateTime() {
        //날짜, 시각을 가지고 와서
        //위의 라벨 현재시각 부분에 text로 넣어주자
        count += 1
        //currentTime.text = "현재시각: "+String(count)
        //print("1초마다 출력")
        //10초 후 배경색 변경
        if count == 10 {
            view.backgroundColor = UIColor.blue
        }
        //15초 후 경고창 출력
        if count == 15 {
            let alert = UIAlertController(title: "알림", message: "얼럿 메세지 입니다.", preferredStyle: .alert)
                    alert.addAction(UIAlertAction(title: "확인", style: .default))
            self.present(alert, animated: true, completion: nil)
        }
        //20초 후 page2로 가기
        if count == 20 {
            guard let go = self.storyboard?.instantiateViewController(withIdentifier: "page2") else {
                        //storyboard가 nil일 때 실행
                        return
                    }
            //go 실행
            self.present(go, animated: true)
        }
    }

    //datePicker가 고르는 수를 라벨에 출력
    //전달되는 값(sender)이 String 값으로 변환이 안돼서 포맷을 맞춰줘야한다
    @IBAction func changeDatePicker(_ sender: UIDatePicker) {
        let datePickerView = sender
        print(datePickerView.date)
        
        var formatter = DateFormatter()
        formatter.dateFormat = "yy-MM-dd HH:mm EEE"
        
        chosenTime.text = "선택시간: " + formatter.string(from: datePickerView.date)
    }
}

