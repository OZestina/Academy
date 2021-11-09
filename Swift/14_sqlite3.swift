

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

    @IBAction func insertBtn(_ sender: UIButton) {
        let db = SQLite3DB()
        
        //casting 함수도 optional이어서 강제언래핑 해줘야한다
        let no = Int32(noText.text!)!
        let name = NSString(utf8String: nameText.text!)!
        print("id: ", no, "name: ", name)
        db.insert(id: no, name: name)
        
    }
    
    @IBAction func deleteBtn(_ sender: UIButton) {
        //DB 객체 생성
        let db = SQLite3DB()
        
        let no = Int32(noText.text!)!
        db.delete(id: no)
    }
    
    @IBAction func updateBtn(_ sender: UIButton) {
        
        let db = SQLite3DB()
        
        let no = Int32(noText.text!)!
        let name = NSString(utf8String: nameText.text!)!
        print("id: ", no, "name: ", name)
        db.update(id: no, name: name)
        
    }
    
    
    @IBAction func dbStartBtn(_ sender: UIButton) {
        //DB클래스 객체 생성
        let db = SQLite3DB()
        print("db주소값은 ", db.path)
        //만든 데이터베이스 호출 (연결 테스트용)
        //db.openDB()
        
        //테이블 생성
        db.createTable()
    }
    
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
    //print("fileManager: ", fileManager)
    //print(fileManager.urls(for:.libraryDirectory,in:.userDomainMask).last!.appendingPathComponent("company.db").path)
        
        return fileManager.urls(for:.libraryDirectory, in:.userDomainMask).last!.appendingPathComponent("company.db").path
    }()
    
    //가상 기계의 경로(폴더+파일)를 가지고 와서, 여기에 sqlite DB를 생성해야함
    
    //DB연결 함수
    //자바에서는 Cursor의 역할을 하는 OpaquePointer를 리턴
    //(연결 통로를 가리킴)
    //연결통로가 있는 경우 (not nil) 연결됐다는것!
    //연결이 안될 경우 nil을 리턴해야해서 ?를 붙여준다
    func openDB() -> OpaquePointer? {
        var con : OpaquePointer? = nil
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
        
        //할애한 자원 모두 해제시켜라
        sqlite3_finalize(con)
    }
    
    //insert 함수
    let sql_insert = "insert into contact values (?,?);"
    //utf-8 변환을 위해 (한글 입력) NSString으로 진행
    //NSString에 utf-8 변환 메서드 있음
    func insert(id: Int32, name: NSString) {
        let db = openDB()
        var con : OpaquePointer? = nil
        //sql문 객체화
        if sqlite3_prepare_v2(db, sql_insert, -1, &con, nil) == SQLITE_OK {
            
            sqlite3_bind_int(con, 1, id)
            sqlite3_bind_text(con, 2, name.utf8String, -1, nil) //-1: 길이는 알아서 하여라
            
            //print("sql query 객체화 성공")
            //객체화 성공했으면 실행
            if sqlite3_step(con) == SQLITE_DONE {
                print("record inserted")
            } else {
                print("record insert failed")
            }
        } else {
            print("sql query 객체화 실패")
        }
//        할애한 자원 모두 해제시켜라
        sqlite3_finalize(con)
    }
    
    //delete 함수
    let sql_delete = "delete from contact where id = ?;"
    func delete(id: Int32) {
        let db = openDB()
        var con : OpaquePointer? = nil
        //sql문 객체화
        if sqlite3_prepare_v2(db, sql_delete, -1, &con, nil) == SQLITE_OK {
            
            sqlite3_bind_int(con, 1, id)
            
            //print("sql query 객체화 성공")
            //객체화 성공했으면 실행
            if sqlite3_step(con) == SQLITE_DONE {
                print("record deleted")
            } else {
                print("record delete failed")
            }
        } else {
            print("sql query 객체화 실패")
        }
        //할애한 자원 모두 해제시켜라
        sqlite3_finalize(con)
    }
    
    //update 함수
    let sql_update = "update contact set name = ? where id = ?;"
    func update(id: Int32, name: NSString) {
        let db = openDB()
        var con : OpaquePointer? = nil
        //sql문 객체화
        if sqlite3_prepare_v2(db, sql_update, -1, &con, nil) == SQLITE_OK {
            
            sqlite3_bind_text(con, 1, name.utf8String, -1, nil)
            sqlite3_bind_int(con, 2, id)
            //print("sql query 객체화 성공")
            //객체화 성공했으면 실행
            if sqlite3_step(con) == SQLITE_DONE {
                print("record updated")
            } else {
                print("record update failed")
            }
        } else {
            print("sql query 객체화 실패")
        }
        //할애한 자원 모두 해제시켜라
        sqlite3_finalize(con)
    }
    
    //select 함수
    let sql_query = "select * from contact"
//    func select(<#parameters#>) -> <#return type#> {
        
        //할애한 자원 모두 해제시켜라
//        sqlite3_finalize(con)
//    }
    
    
}
