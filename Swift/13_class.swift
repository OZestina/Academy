//
//  Cal.swift
//  test08_DB
//
//  Created by Apple on 2021/11/09.
//

import Foundation

//Swift는 함수형 언어여서
//하나의 파일에 클래스를 여러개 생성해도 괜찮다!

//클래스 밖에 선언한 초글로벌변수(정확한 이름 아님 주의)는
//해당 파일의 클래스들 뿐 아니라
//패키지 내 다른 클래스에서 바로 적용이 가능하다

//같은 패키지에 있는 파일끼리는 import 필요없당!


class BasicCal{
    
    var price = 1000
    
    func prints() {
        print("멤버변수값: ",price)
        print(value)                //아래 다른파일에서 선언된 초 글로벌변수 바로 사용
    }
}





//========[다른 파일]=============================

import UIKit

//초글로벌변수 선언: 클래스 밖에 선언
var total2: UILabel?
var value = 100

class ViewController: UIViewController {
    
