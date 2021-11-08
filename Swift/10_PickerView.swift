//
//  ViewController.swift
//  test07
//
//  Created by Apple on 2021/11/04.
//

import UIKit

//PickerView 사용하려면 UIPickerViewDelegate, UIPickerViewDataSource extends 해줘야함
//delegate를 extends해야 pickerView 자동완성 사용 
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

// [delegate 설정]=====================================================================

import UIKit

class Page2ViewController: UIViewController,UIPickerViewDelegate, UIPickerViewDataSource {
    
    @IBOutlet var imageLabel: UILabel!
    @IBOutlet var pickerImage: UIPickerView!
    @IBOutlet var imageView: UIImageView!
    
    //필요한 변수 선언
    let MAX_ARRAY_NUM = 10
    let PICKER_VIEW_COLUMN = 1
    //range를 넘어가도 어느정도 유동적으로 감안해주는 CG
    let PICKER_VIEW_HEIGHT : CGFloat = 80
    var imageArray = [UIImage?]()
    var imageFileName = ["1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg","10.jpg"]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //imageArray에 UIImage만들어서 넣어주자
        for i in 0..<MAX_ARRAY_NUM {
            let image = UIImage(named: imageFileName[i])
            imageArray.append(image)
        }
        
        imageLabel.text = imageFileName[0]
        imageView.image = imageArray[0]
        
    }
    
    //피커뷰 몇개 넣을것인지
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        return PICKER_VIEW_COLUMN
    }
    //전체 피커뷰에 넣을 아이템 개수
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return imageFileName.count
    }
    //피커뷰 높이 결정
    func pickerView(_ pickerView: UIPickerView, rowHeightForComponent component: Int) -> CGFloat {
        return PICKER_VIEW_HEIGHT
    }
    
    //⭐피커뷰 delegate 설정해줘야 함⭐
    //피커뷰 우클릭해서 컨트롤러메뉴 좌측 아이콘으로 드래그,
    //delegate 선택
    
    //피커뷰에 무엇을 넣을지
    func pickerView(_ pickerView: UIPickerView, viewForRow row: Int, forComponent component: Int, reusing view: UIView?) -> UIView {
        let imageObject = UIImageView(image: imageArray[row])
        //이미지뷰의 크기 결정
        imageObject.frame = CGRect(x: 0, y: 0, width: 100, height: 150)
        return imageObject
    }
    
    //String을 넣어줄 경우 titleForRow로 진행
//    func pickerView(_ pickerView: UIPickerView, titleForRow row: Int, forComponent component: Int) -> String? {
//        return imageFileName[row]
//    }
//
    //피커뷰에서 하나를 선택 후 어떤 처리를 할지
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        //파일 이름 설정, 이미지 변화
        imageLabel.text = imageFileName[row]
        imageView.image = imageArray[row]
    }
    


}

