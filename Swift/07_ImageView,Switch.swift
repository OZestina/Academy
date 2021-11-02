class ViewController: UIViewController {

    //사진 저장할 변수
    var imgOn :UIImage?
    var imgOff :UIImage?
    
    //사진 보여줄 ImageView
    @IBOutlet var imgView: UIImageView!
    
    //버튼 토글기능을 위한 변수 생성
    var isZoom = false
    
    //버튼 내용 수정을 위한 아울렛 생성
    @IBOutlet var btnResize: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //사진 연결
        imgOn = UIImage(named: "1.png")
        imgOff = UIImage(named: "2.png")
        //로딩 시 default로 보여줄 사진 설정
        imgView.image = imgOn
    }

    //줌인-아웃 설정 버튼
    @IBAction func btnResizeImage(_ sender: UIButton) {
        
        let scale: CGFloat = 2
        var newWidth: CGFloat = 0
        var newHeight : CGFloat = 0
        
        //버튼을 누를 때마다 타이틀 변경, ImgView 크기 세팅
        if isZoom {
            btnResize.setTitle("zoom-out", for: .normal)
            newWidth = imgView.frame.width / scale
            newHeight = imgView.frame.height / scale
        } else {
            btnResize.setTitle("zoom-in", for: .normal)
            newWidth = imgView.frame.width * scale
            newHeight = imgView.frame.height * scale
        }
        //true <-> false 값 변경
        isZoom = !isZoom
        
        //새로 세팅한 크기 imgView에 설정
        imgView.frame.size = CGSize(width: newWidth, height: newHeight)
    }
  
    //스위치
    @IBAction func switchImageOnOff(_ sender: UISwitch) {
        if sender.isOn {  //파라미터로 받는 sender
            imgView.image = imgOn
        } else {
            imgView.image = imgOff
        }
    }
}

