package c230912;

public class Main {
	public static void main(String[] args)
	{
		/*## DataBase
		 - 자료를 저장하는 곳
		 - 데이터를 정리하는 곳
		 - 저장한 자료를 찾는 곳
		 - 창고다
		   - 종류는?
		     - 의류 창고
		     - 물류 창고
		     - 식료품 창고
		     - 신발장?
		     - 책장?
		     - 냉동 창고
		     - 보온 창고
		  ## 종류
		 - noSQL
		   - 크게 정해진 규격이 없다.
		   - MongoDB, Redis
		   - 몽고DB의경우 파일로 저장하는 거와 크게 다를바 없다.
		   - Redis 저장공간이 하드디스크가아니라 램이다 몽고DB보다 빠르다 대신 휘밠성이다 
		 - SQL, RDBMS
		     - 쓰려면 규칙에 맞춰야 한다.
		     - 제대로 쓰려면 좀 어렵다.
		     - Oracle, mySQL
			 - Orachle 기능이 제한되어있다
			  ( 유료결제하면 기능풀림)
		  ## SQL
		    - Language << DB랑 대화한다.
		    - Structured Query Language
		    변수 선언 int a;
		  ## 명령어 
		    - 구조 생성 create		     
		    - 구조 삭제 drop
		    - 구조 수정(테이블) alter
		    - 테이블 명 수정 rename
		    
//		  #### 데이터 조작어, DML   
		    - 데이터 삽입 insert 
		    - 데이터 수정 update 
		    - 데이터 삭제 delete 
		    - 데이터 선택 select 
		    
		    - 권한 부여 grant
		    - 권한 삭제 revoke
		 
		#### Type
//		   #### 원시 타입
//		   #### 참조 타입 DB에서는 참조타입이 없다.   
		   #### 숫자
		      - Number => Integer | Short | Long
		      - Float => Double | Float  
		   #### 문자
		   	  - Char(acter) => 고정길이, max : 2000byte
		   	  - VarChar2 (mySQL : VarChar) => Char 보다는 더 넣을 수 있다. 가변길이
		   	  - Long = String => 길이에 대한 조건이 없다. max : 2gb
		   	  - Clob => Long 보다 크다. 4gb
		   	  - NChar => N이 붙은 것들은 유니코드 텍스트
		   	  - NVarChar
		   	  - NClob
		   #### 기타
		      - Date => 날짜
		      - Timestamp => 시간(기간)

테이블을 생성할거다 => create
이름, 타입, 데이터의 길이를 정한다.
Number(10, 10) <- 10개 까지 올수있다 (Precision : 전체 길이, Scale : 소수점 이후의 길이)
Float(10) => (Precision : 전체길이) 
Char(10)
VarChar(10)
Long 		      
		       	
		   
		   #### 참거짓 숫자로 0 1로 따짐

		 ## DB
		 	- 데이터를 어떻게 저장을 할까?
		    - DataBase || Schema를 생성한다. create
		    - DB에 속하는 테이블을 생성한다. create
		    - 생성한 테이플에 데이터를 넣는다  insert
		    - 생성한 테이플에서 데이틀 가져 온다. select 
		  
		  ## RDBMS
		    - Relational DataBase Mangement System
		    - 관계형 데이터 베이스
		    
		  ## 비관계형 데이터 베이스
		    - noSQL
	        
	      # JSON
	        - 우리가 다루는 데이터(객체, 스트링, 배열) => 문자열로 바꿔준다.
	        - "안녕하세요, 저는 정경훈입니다."
	        - [안녕하세요, 저는 정경훈입니다.] => "안녕하세요, 저는 정경훈입니다."
	        - ["안녕하세요", "저는 정경훈입니다."]
	        - { name : "정경훈" } => { "name" : "정경훈" }  
	        
	        
		 */
		
 	}
}
