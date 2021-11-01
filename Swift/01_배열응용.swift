import UIKit

//배열 선언 및 추가
var shoppingList2 : [String] = []
shoppingList2.append("bag")
shoppingList2.append("pen")
shoppingList2.append("mouse")
print(shoppingList2)

//배열 인덱스를 이용해 값 바꾸기
shoppingList2[0] = "mac"
print(shoppingList2)

//프린트문 안에 \()를 이용해 변수 이용 가능
//배열.count로 길이 구할 수 있음    
print("전체 쇼핑 리스트의 개수는 \(shoppingList2.count)개")

//원하는 위치에 값 끼워넣기
shoppingList2.insert("charger", at: 1)
print(shoppingList2)

//원하는 위치의 값 삭제하기
shoppingList2.remove(at: 0)
print(shoppingList2)

//배열.enumerated()
//배열을 튜플로 만들어줌 (인덱스, 밸류)
for (index, value) in shoppingList2.enumerated() {
    print(index, ": ", value)
}

//0..<5 는 range(0,5)랑 같은 개념
//0...5 는 0~5 (5 포함)의 범위를 의미
for x in 0..<5 {
    print(x)
}

for x in 0..<shoppingList2.count {
    print(shoppingList2[x])
}

var odd = 0
var even = 0
for (index, value) in [1,3,5,6,7,9].enumerated() {
    //각 배열의 인덱스와 값을 프린트
    print(index, value)
    print(value + 100)
    if value % 2 == 0 {
        even += 1
    } else {
        odd += 1
    }
}
print("짝수: \(even)개, 홀수: \(odd)개")

