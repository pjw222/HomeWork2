# 네트워크란?
    - 요청과 응답

# WAS란?
## Web Server란?
    - 웹페이지를 주는서버

## Application Server란?
    - 데이터를 주는 서버

# 클라이언트란?
    - 객체? 요청자
    - 스마트폰 -> 구글? -> 크롬, 엣지, 파폭 등등의 브라우저

# 통신 순서?

    - 클라이언트 <-> Web Server <-> Application Server <-> DB Server

# Java에서의 통신 순서

    - Client <-> Web Server(Tomcat) <-> WAS <-> DB Server
    - WAS <-> Servlet(컨테이너, 도메인주소(IP)) (정확히는 Servlet을 가져다 쓰게됨)

# JSP, Servlet

    - JSP, Java Server Page 자바 서버에서 사용하는 웹페이지

# HTTP 통신의 종류 / RESTFUL API
 - GET : 단순 데이터 요청 응답
    - GET 형식으로 써왔다
    - 브라우저
- POST : 우편, 데이터를 보낼 때 사용한다.
    - 데이터를 사용자가 볼 수 없게 가려준다.
    - 밑에 PUT PATCH DELETE 필요없이 POST로 다 처리 할수 있다.
    - 로그인
- PUT : 서버에 데이터를 놓다.
     - 데이터 가림
- PATCH : 서버에 데이터를 수정한다.
     - 데이터 가림
     - PUT VS PATCH : PUT은 모든 데이터를 보낸다 VS PATCH는 일부 데이터만 보낸다.
- DELETE : 데이터를 삭제
      - GET과 같은 형식으로 데이터를 주고 받는다.
- OPTION : 조건
     - CORS : Cross Origin Resource Sharing 서로 다른 주소의 데이터를 주고 받는다 
  
# URL, URI
- URL : 흔히 우리가 얘기하는 인터넷 주소
      - Uniform Resource Locator 
- URI : 통합 자원 식별자
     - Uniform Resource Identifier
- 사용 시 사실상 둘다 인터넷 주소로 생각하면 된다.

## URL
- https://www.google.co.kr/?h1=ko
- https:// << 프로토콜
- www.google.co.kr << 도메인
- / << 라우터 | 컨텍스트
- ?h1=ko << 데이터, 쿼리 | 쿼리스트링
  - h1 = ko 

- https://www.google.com/search?q=%EA%B5%AC%EA%B8%80&oq=%EA%B5%AC%EA%B8%80&gs_lcr....	
  - 구글 검색 
- https://www.google.com/search?q=구글 
  - { q = 구글; oq = 구글 }
   

# 데이터 전송 방법
- GET 형식에서는 URL에 포함되어 데이터를 보낸다. << 쿼리스트링
- POST 형식에서는 데이터가 URL에 포함되지 않는다. << body : {} << JSON 형식을 많이 사용한다.
   
# 이건 뭘까?
- %EA%B5%AC%EA%B8%80 >> 구글

- %EB%84%A4 %EC%9D%B4 %EB%B2%84 >> 네이버

- naver >> naver

# Encoding VS Decoding
- Encoding => AVI => MP4, MP4 => wmv : 데이터 포멧을 변경한다.
- Decoding : 인코딩을 되돌린다.

- %EA%B5%AC%EA%B8%80 -> 구글 : 디코딩  
- 구글 -> %EA%B5%AC%EA%B8%80 : 인코딩

## 암호화 == 인코딩
- 못알아보게 바꾼다. 

## 복호화 == 디코딩
- 암호화된 암호를 해독해서 읽어낸다.
     - ex) 가 => A, AAAA => 가가가가