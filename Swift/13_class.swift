//
//  Cal.swift
//  test08_DB
//
//  Created by Apple on 2021/11/09.
//

import Foundation

//Swift는 함수형 언어여서
//하나의 파일에 클래스를 여러개 생성해도 괜찮다!
//하나의 파일에 클래스를 선언해서 전역변수를 공유할 수도 있다
//(전역변수를 클래스 밖에 선언 가능!)

//같은 패키지에 있는 파일끼리는 import 필요없당!

class BasicCal{
    
    var price = 1000
    
    func prints() {
        print("멤버변수값: ",price)
    }
    
    
}
