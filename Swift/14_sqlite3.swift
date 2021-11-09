//Sqlite3을 관장하는 별도의 class를 생성해서 진행한다 (같은 swift내에 있어도 무방!)

//sqlite 사용하려면 임포트 해줘야함!
import SQLite3
import UIKit

class ViewController: UIViewController {

    @IBOutlet var noText: UITextField!
    @IBOutlet var nameText: UITextField!
    @IBOutlet var queryResult: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        //같은 패키지 안의 클래스 및 함수 호출 - 얘는 13_class.swift 참고
        let cal = BasicCal()
        cal.prints()
    }

  //값 추가
    @IBAction func insertBtn(_ sender: UIButton) {
    }
    
  //테이블 새로 생성
    @IBAction func dbStartBtn(_ sender: UIButton) {
        //DB클래스 객체 생성
        let db = SQLite3DB()
        print("db주소값은 ", db.path)
        //만든 데이터베이스 호출 (연결 테스트용)
        //db.openDB()
        
        //테이블 생성
        db.createTable()
    }
    
  //검색
    @IBAction func queryResultBtn(_ sender: UIButton) {
    }

}


class SQLite3DB {
    //자바에서는 File
    //swift에서는 FileManager
    
    //FileManager 객체 생성 (.default 로 생성)
    //let fileManager = FileManager.default
    //let path = fileManager.urls(for: .libraryDirectory, in: .userDomainMask).last!.appendPathComponent("company.db").path
    
    //위의 내용을 익명 함수를 사용한 방법으로!
    let path: String = {
        let fileManager = FileManager.default
    //  print("fileManager: ", fileManager)
    //  print(fileManager.urls(for:.libraryDirectory, in:.userDomainMask).last!
    //  .appendingPathComponent("company.db").path)
        return fileManager.urls(for:.libraryDirectory, in:.userDomainMask).last!.appendingPathComponent("company.db").path
    }()
    
    //가상 기계의 경로(폴더+파일)를 가지고 와서, 여기에 sqlite DB를 생성해야함
    
    //DB연결 함수
    //자바에서는 Cursor의 역할을 하는 OpaquePointer를 리턴 (OpaquePointer는 연결 통로를 가리킴)
    //연결통로가 있는 경우 (not nil) 연결됐다는것!
    //연결이 안될 경우 nil을 리턴해야해서 ?를 붙여준다
    func openDB() -> OpaquePointer? {
        var con : OpaquePointer? = nil
      //
        if sqlite3_open(path, &con) == SQLITE_OK {
            print("connect succeeded")
        } else {
            print("connect failed")
        }
        return con
    }
    
    //table 생성 함수
    let sql_create =
    """
        create table contact (
        id int primary key not null,
        name char(255)
        );
    """
    func createTable() {
        let db = openDB()
        var con : OpaquePointer? = nil
        //sql문 객체화
        if sqlite3_prepare_v2(db, sql_create, -1, &con, nil) == SQLITE_OK {
            //print("sql query 객체화 성공")
            //객체화 성공했으면 실행
            if sqlite3_step(con) == SQLITE_DONE {
                print("table created")
            } else {
                print("table not created")
            }
        } else {
            print("sql query 객체화 실패")
        }
        
        //실행이 성공하면 "테이블이 생성되었습니다" 출력
        
        //할애한 자원 모두 해제시켜라
//        sqlite3_finalize()
    }
    
    //insert 함수
    let sql_insert = "insert into contact values (?,?);"
    //utf-8 변환을 위해 (한글 입력) NSString으로 진행
    //NSString에 utf-8 변환 메서드 있음
//    func insert(id: Int32, name: NSString) -> <#return type#> {
        
        //할애한 자원 모두 해제시켜라
//        sqlite3_finalize(<#T##pStmt: OpaquePointer!##OpaquePointer!#>)
//    }
    //select 함수
    let sql_query = "select * from contact"
//    func select(<#parameters#>) -> <#return type#> {
        
        //할애한 자원 모두 해제시켜라
//        sqlite3_finalize(<#T##pStmt: OpaquePointer!##OpaquePointer!#>)
//    }
    
    
}
