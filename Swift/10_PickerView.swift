//
//  ViewController.swift
//  test07
//
//  Created by Apple on 2021/11/04.
//

import UIKit

//PickerView 사용하려면 UIPickerViewDelegate, UIPickerViewDataSource extends 해줘야함
class ViewController: UIViewController, UIPickerViewDelegate, UIPickerViewDataSource {
    
    @IBOutlet var pickerView: UIPickerView!
    
    //PickerView에서 보여줄 리스트 & 랜딩페이지
    let choices: [String] = ["음료","술","밥","간식"]
    let landing: [String?] = ["tasteBev", nil,nil,nil]
    
    //선택된 항목 저장할 변수
    var choice : Int = 0
    
    //하나의 PickerView 안에 선택 가능한 리스트 몇개
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        return 1
    }
    
    //PickerView에 표시될 항목의 개수를 반환 (리스트의 길이)
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return choices.count
    }
    
    //PickerView row의 문자열 설정 (리스트 각 항목)
    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
        return choices[row]
    }

    //PickerView에서 특정 row가 선택되었을 때 액션 지정
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        choice = row
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        pickerView.dataSource = self
        pickerView.delegate = self
        
        self.view.addSubview(self.pickerView)
    }

    @IBAction func mainToTaste(_ sender: UIButton) {
        toTaste(n: choice)
    }
    
    //페이지 없을 때는 alert창, 있으면 해당 페이지로 이동
    func toTaste (n: Int) {
        if landing[n] != nil {
            guard let go =  self.storyboard?.instantiateViewController(identifier: landing[n]!)
            else { return }
            self.present(go, animated: true)
        } else {
            let alert = UIAlertController(title: "알림", message: "준비중입니다! 곧 만나요 :)", preferredStyle: .alert)
            alert.addAction(UIAlertAction(title: "확인", style: .default) { action in } )
            self.present(alert, animated: true)
        }
    }
}

