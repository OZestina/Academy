//배열 선언
var arr : Array<Int> = Array<Int> ()
var arr2 : Array<Int> = [Int]()
var arr3 : Array<Int> = []
var arr4 : [Int] = [Int] ()
var arr5 : [Int] = []

//배열에 값 넣기
arr.append(1)
arr.append(2)
arr.append(3)
//배열 출력
print(arr)			//[1, 2, 3]
//배열 길이 구하기
print(arr.count)	//3

//배열 칸 하나하나마다 접근 방법
print(arr[0])		//인덱스로 값 찾기
arr.remove(at:0)	//삭제
arr[0] = 1000		//입력
arr.insert(200, at:1)   //값 끼워넣기

//배열 내에 특정 값이 있는지 확인
print(arr.contains(1000))	//true

//배열 내용 전체 삭제
arr.removeAll()
print(arr.count)			//0
print(arr)					//[]
