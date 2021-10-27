//https://developer.apple.com/documentation/swift/dictionary

//딕셔너리
//키: 밸류, 쌍으로 저장되는 데이터

//빈 딕셔너리 선언
var emptyDict: [String: String] = [:]

//값이 있는 딕셔너리 선언
var responseMessages = [200: "OK",
                        403: "Access forbidden",
                        404: "File not found",
                        500: "Internal server error"]

print(responseMessages)							//[500: "Internal server error", 200: "OK", 403: "Access forbidden", 404: "File not found"]
print(responseMessages[200])					//Optional("OK")
print(responseMessages[200]!)					//"OK"


let httpResponseCodes = [200, 403, 301]
for code in httpResponseCodes {
    if let message = responseMessages[code] {
        print("Response \(code): \(message)")
    } else {
        print("Unknown response \(code)")
    }
}
