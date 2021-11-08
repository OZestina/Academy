//
//  TasteBev.swift
//  test07
//
//  Created by Apple on 2021/11/04.
//

import UIKit

class TasteBev: UIViewController {
    
    //선택된 옵션값 저장용 배열
    var options : [Int] = [0,0,0,0,0,0,0,0,0]

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    //버튼 누르면 다음 페이지로 이동 & 옵션값 넘기기
    @IBAction func btnBevResult(_ sender: UIButton) {
        guard let go = self.storyboard?.instantiateViewController(withIdentifier: "resultBev") as? ResultBev else { return }
        go.options = options
        //페이지 이동 실행
        self.present(go, animated: true)
    }
    
    //(함수) 옵션 선택에 따른 배열 업데이트
    func optionChoose(_ idx:Int, _ value:Int) {
        options[idx] = value
    }
    
    //옵션 선택에 따라 배열 변경
    @IBAction func option1(_ sender: UISegmentedControl) {
        optionChoose(0,sender.selectedSegmentIndex) }
    @IBAction func option2(_ sender: UISegmentedControl) {
        optionChoose(1,sender.selectedSegmentIndex) }
    @IBAction func option3(_ sender: UISegmentedControl) {
        optionChoose(2,sender.selectedSegmentIndex) }
    @IBAction func option4(_ sender: UISegmentedControl) {
        optionChoose(3,sender.selectedSegmentIndex) }
    @IBAction func option5(_ sender: UISegmentedControl) {
        optionChoose(4,sender.selectedSegmentIndex) }
    @IBAction func option6(_ sender: UISegmentedControl) {
        optionChoose(5,sender.selectedSegmentIndex) }
    @IBAction func option7(_ sender: UISegmentedControl) {
        optionChoose(6,sender.selectedSegmentIndex) }
    @IBAction func option8(_ sender: UISegmentedControl) {
        optionChoose(7,sender.selectedSegmentIndex) }
    @IBAction func option9(_ sender: UISegmentedControl) {
        optionChoose(8,sender.selectedSegmentIndex) }
    
}
