//웹키트뷰 사용을 위해 Permission 설정을 해줘야 함
// > Info.plist를 수정
// > Information Property List 하단에
// > App Transport Security Settings 추가 (+)
// > 그 하단에 (삼각형 아래로 향하게 하고)
// > Allow Arbitrary Loads 추가 (+)
// > Allow Arbitrary Loads의 value를 YES로 변경

import UIKit
import WebKit   //WKWebView용

class Page3ViewController: UIViewController, WKNavigationDelegate {

    @IBOutlet var txtUrl: UITextField!
    //WebKit import 필요! - 없으면 에러뜹니당
    @IBOutlet var myWebView: WKWebView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //초기 로딩 페이지 유튜브로 지정
        loadWebPage("http://www.youtube.com")
    }
    
    //유저가 입력한 웹 페이지 주소에서 http://가 있는 지 확인 후 없으면 붙여줌
    func checkUrl(_ url:String) -> String {
        var strUrl = url
        let flag = strUrl.hasPrefix("http://")
        if !flag { strUrl = "http://" + strUrl }
        return strUrl
    }
    
    //로딩 아이콘 관련
    func webView(_ webView: WKWebView, didCommit navigation: WKNavigation!) {
        //로딩이 늦어지는 경우 로딩 아이콘 노출
          //  myActivityIndicator.startAnimating()
         //   myActivityIndicator.isHidden = false
        }
        
        func webView(_ webView: WKWebView, didFinish navigation: WKNavigation!) {
            //로딩 완료시 로딩 아이콘 숨김
          //  myActivityIndicator.stopAnimating()
          //  myActivityIndicator.isHidden = true
        }
        
        func webView(_ webView: WKWebView, didFail navigation: WKNavigation!, withError error: Error) {
            //로딩 실패시 로딩 아이콘 숨김
          //  myActivityIndicator.stopAnimating()
          //  myActivityIndicator.isHidden = true
        }
    
        func loadWebPage(_ url:String) {
            let myUrl = URL(string: url)
            let myRequest = URLRequest(url: myUrl!)
            myWebView.load(myRequest)
        }
        //입력한 사이트로 이동
        @IBAction func btnGotoUrl(_ sender: UIButton) {
            let myUrl = checkUrl(txtUrl.text!)
            txtUrl.text = ""
            loadWebPage(myUrl)
        }
        
        @IBAction func btnGoSite1(_ sender: UIButton) {
            loadWebPage("http://www.naver.com")
        }
        
        @IBAction func btnGoSite2(_ sender: UIButton) {
            loadWebPage("http://www.inflearn.com")
        }
        //html page로 이동 가능
        @IBAction func btnLoadHtmlString(_ sender: UIButton) {
            let htmlString = "<h1> HTML String </h1><p> String 변수를 이용한 웹페이지 </p> <p><a href=\"http://2sam.net\">2sam</a>으로 이동</p>"
            myWebView.loadHTMLString(htmlString, baseURL: nil)
        }
        //저장한 html page 로딩 가능
        @IBAction  func btnLoadHtmlFile(_ sender: UIButton) {
            let filePath = Bundle.main.path(forResource: "htmlView", ofType: "html")
            let myUrl = URL(fileURLWithPath: filePath!)
            let myRequest = URLRequest(url: myUrl)
            myWebView.load(myRequest)
        }
        //로딩중지
        @IBAction func btnStop(_ sender: UIBarButtonItem) {
            myWebView.stopLoading()
        }
        //새로고침
        @IBAction func btnReload(_ sender: UIBarButtonItem) {
            myWebView.reload()
        }
        //뒤로가기
        @IBAction func btnGoBack(_ sender: UIBarButtonItem) {
            myWebView.goBack()
        }
        //앞으로가기
        @IBAction func btnGoForward(_ sender: UIBarButtonItem) {
            myWebView.goForward()
        }

    
    
    
}
