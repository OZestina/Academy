//텍스트필드에서 가져오는 값은 모두 string
//그냥 .text로 프린트하면 옵셔널 내용이 추가로 붙어서
//값만 가져오려면 강제로 언래핑이 필요하다(끝에 !를 붙여준다)

//숫자로 바꿀 경우 함수를 사용한다.
//Int(), String()으로 왔다갔다 할 수 있다
//Int -> String 의 경우, 에러가 발생할 수 있어 꼭 느낌표를 붙여줘야한다
//    (아니면 safe한 옵셔널 바인딩을 이용할 수도 있다)
//    (참고링크: https://devxoul.gitbooks.io/ios-with-swift-in-40-hours/content/Chapter-2/optionals.html)


//강제로 언래핑 필요 (! 붙이기)
//print("namaewa",txtName.text)는 옵셔널이 붙어져서 나옴
print(txtName.text!)
txtLabel.text = txtName.text!+"은 "+txtAge.text!+"세 입니다."
var newAge = 0
newAge = Int(txtAge.text!)!+1
txtLabel2.text = txtName.text!+"의 내년 나이는 "+String(newAge)+"세입니다."


var n1 : Int = Int(num1.text!)!
var n2 : Int = Int(num2.text!)!
lab1.text = "두 수의 합은 "+String(n1+n2)+"입니다."
lab2.text = "두 수의 차는 "+String(n1-n2)+"입니다."
lab3.text = "두 수의 곱은 "+String(n1*n2)+"입니다."
lab4.text = "두 수를 나누면 "+String(n1/n2)+"입니다."
