//table view controller로 아예 뷰 컨트롤러 생성 가능
//이런 특수한 아이들은 cocoa 파일 생성 시 UITableViewController로 생성해주면 됨
//Table View Cell에 id 지정해서 클릭 시 이벤트를 컨트롤할 수 있음 (이하 "myCell")


//[Navigation Controller]
//스토리보드 클릭 후
//Editor > Embed in > Navigation Controller 클릭
//네비게이션 컨트롤러 생성, 해당 컨트롤러에 연결되면 상단의 네비게이션 바 사용 가능



import UIKit

//앱 내에서 사용할 배열 선언
var items = ["책 구매", "철수와 약속", "스터디 준비하기"]
var itemsImageFile = ["2.jpg","4.jpg","6.jpg"]

class TableViewController: UITableViewController {

    @IBOutlet var tvListView: UITableView!
    
    override func viewDidLoad() {
        super.viewDidLoad()

      //네비게이션 컨트롤러에 edit버튼 생성 : 자동으로 필요한 내용 설정해줌
        self.navigationItem.leftBarButtonItem = self.editButtonItem
    }

    // MARK: - Table view data source

    //선택을 몇 개 할 것인가 지정
    override func numberOfSections(in tableView: UITableView) -> Int {
        // #warning Incomplete implementation, return the number of sections
        return 1
    }

    //보여줄 테이블 뷰 전체 행 개수 지정
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        // #warning Incomplete implementation, return the number of rows
        return items.count
    }

    //하나의 셀 당 단위 정의
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        //지정한 셀 id로 지정
        let cell = tableView.dequeueReusableCell(withIdentifier: "myCell", for: indexPath)
        //셀의 인덱스(indexPath) 값으로 노출할 이미지, 텍스트 지정
        cell.textLabel?.text = items[(indexPath as NSIndexPath).row]
        cell.imageView?.image = UIImage(named: itemsImageFile[(indexPath as NSIndexPath).row])
        
        return cell
    }
   
    // 줄 단위로 editing 기능을 사용할 지 설정 (왼쪽으로 슬라이드해 삭제)
    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        return true
    }

    //삭제 등의 이벤트 후 처리 내용 정의 (배열에서 지우기 등)
    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCell.EditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            
            // Delete the row from the data source
            items.remove(at: (indexPath as NSIndexPath).row)
            itemsImageFile.remove(at: (indexPath as NSIndexPath).row)
            
            //fade는 효과를 준 부분(스윽 사라지는 것)
            tableView.deleteRows(at: [indexPath], with: .fade)
            
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }
    
    //delete 버튼 이름 바꾸기
    override func tableView(_ tableView: UITableView, titleForDeleteConfirmationButtonForRowAt indexPath: IndexPath) -> String? {
        "삭제"
    }
    
    
    //목록의 순서를 변경하는 이벤트 후 처리 내용 정의 (배열 순서 변경 등)
    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {
        
        //옮기고자 하는 items, 이미지를 가지고 온다.
        let itemToMove = items[(fromIndexPath as NSIndexPath).row]
        let imgToMove = itemsImageFile[(fromIndexPath as NSIndexPath).row]
        
        //원래 있던 자리에서 삭제
        items.remove(at: (fromIndexPath as NSIndexPath).row)
        itemsImageFile.remove(at:(fromIndexPath as NSIndexPath).row)
        
        //옮기려는 위치에 삽입
        items.insert(itemToMove, at: (to as NSIndexPath).row)
        itemsImageFile.insert(imgToMove, at: (to as NSIndexPath).row)

    }
    
    //다른 페이지로 갔다가 다시 돌아오는 경우 처리 내용 정의 - 새로고침
    override func viewWillAppear(_ animated: Bool) {
        tvListView.reloadData()
    }


    /*
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }
    */
    
    // MARK: - Navigation
     
    // 세그웨이를 통해 데이터를 보내고 싶을 때 (클릭 시 데이터 전달)
    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        
        //세그먼트 자체 id를 설정해줘야함 (이하 "sgDetail")
        //전달 세그먼트 확인
        if segue.identifier == "sgDetail"{
            
            //1) 다른 ViewController로 보낼 데이터 선정
            let cell = sender as! UITableViewCell   //nil없을거니까 느낌표로! 다운캐스팅
            let indexPath = self.tvListView.indexPath(for: cell)
            //2) 목적지 View Controller 지정
            let detailView = segue.destination as! DetailViewController
            //3) 데이터 목적지로 전송
            //detailView에 있는 receiveItem 함수를 실행
            //함수가 있어야함!
            detailView.receiveItem((indexPath! as NSIndexPath).row)
        }   
    }
}

// [테이블 뷰 셀 클릭 시 넘어가는 페이지 : 데이터 전달] =========================================

class DetailViewController: UIViewController {

    @IBOutlet var textLabel: UILabel!
    @IBOutlet var imageView2: UIImageView!
    var receiveItem = -1
    
    override func viewDidLoad() {
        super.viewDidLoad()
      //받은 데이터 기반으로 페이지에 표시
        textLabel.text = items[receiveItem]
        imageView2.image = UIImage(named: itemsImageFile[receiveItem])
    }
    
  //전 페이지에서 데이터 전달 받는 함수 생성
    func receiveItem(_ item: Int) {
        receiveItem = item
    }


// [테이블뷰 항목 추가하는 페이지] ====================================================
  
class AddViewController: UIViewController {

    @IBOutlet var tfAddItem: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    @IBAction func addBtn(_ sender: UIButton) {
        let text = tfAddItem.text!
        items.append(text)
        itemsImageFile.append("2.jpg")
      
      //네비게이션 기능으로 pop된 페이지를 하나 없앰 (전 페이지로 이동)
        navigationController?.popViewController(animated: true)
    }
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
