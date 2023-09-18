# 네트워크란?
- 연결망
- 로컬끼리 연결하는 연결망
  - 인터넷
-서버끼리의 연결

# 서버란?
- 컴퓨터? 어떤? 저장공간?
- 요청을 받고 응답을 내보내주는 컴퓨터
- 외부에서 접근 가능한 컴퓨터

# 포트란?
- 일련번호? << 맥주소
- 접근 가능하게 하는 권리?
- 문, 외부에서 접근할 수 있도록, 내 컴퓨터에 들어올 수 있도록 열어두는 문

## 대표적인 포트  (*중요표시)
- 80 : HTTP* << 웹 프로토콜
- 443 : HTTPS*  << 인증된 웹 프로토콜
- 22 : SSH* << 배포
- 1521 : Oracle 
- 3306 : mySQL

# 도메인이란?
- 주소?
- 배포할 때 접근하기 쉽게 하기 위해
- naver.com : 223.130.200.104:443
- 서울시 천호동 어쩌구 저쩌구 : 경도 몇도 위도 몇도 
- 최하위.하위.상위.최상위(com|org|net|kr 등등)
  - co.kr << 합쳐서 최상위일까? kr 만 최상위 kr은 순수 한국 도메인 co 는 기업
  - pe.kr << pe ? 개인 

# HTTP
- HyperText Transfer Protocol
- 브라우저에서 통신하는 규칙

## HTTPS
- HTTP + Secure
- 인증된 HTTP 통신
- SSL 인증 방식을 사용한다.
  - Let's Encrypyto | certbot
  - AWS에서는 호스팅 영역이 있을 시 자동 인증 지원(유료)

# HTML
- HyperText Markup Langauge
- 웹페이지의 출력 담당, 구조만 있을 뿐 플로우는 없다.

```html
 <html>	
	<head>
 	      <title>HTML이란?</title>
 	</head>
 	<body>
 		<div>
 		어쩌구 저쩌구
 		</div>
 		     
	</body>
 </html>	
```

# CSS
- CasCading Style Sheets
- 웹페이지의 모양을 담당한다.

# Javascript
- 웹페이지의 로직을 담당한다.
- Java와는 이름만 연관있다. << 이름 빼면 연관성 0
- Java Oracle, Javascript Mozila
- Mocha -> Javascript, 인기 얻을려고 

```html
<html>
	<head>
		<title>제목</title>
		<script>
			Javascript입력~
		</script>
		<script src="자바 스크립트 파일의 주소"></script>
		<style>
			CSS내용 입력
		</style>
		<link href="CSS 파일 주소" rel="stylesheet" /> // 뒤에 슬래시는 내용이없으니까 바로닫아버려라 라는 용도 
	</head>
	<body>
		<div>
			내용~
		</div>
	</body>
</html>
```

# Java에서의 Web Server Open ?
- Tomcat을 사용한다.
- port : 8888
- admin / admin

# Server
## Web Server
- Web으로 연결을 한다?
- Web을 주는 서버

## Application Server
- Data를 주는 서버

## DB Server

## Web Application Server
- WAS 

# Tomcat
- Apache를 기반으로 돌아가는 서버 프로그램
- PHP로 되어있다.
- WAS

## Apache
- Web Server 
- PHP 를 사용해서 WAS 처럼 쓸 수 있다.

# 잡설(Javascript)
- Javascript는 인터프리터 언어, 세상에서 가장 빠른 프로그래밍 언어(C보다는 느릴거 같다.)
- OS 상에서 사용하는 것이 아닌 브라우저 상에서 사용하는 것을 기본으로 하고있다.
- Node.js << OS에서 Javascript를 실행할 수 있게 해준다.
- Node.js 기반으로 React 라이브러리를 사용할 수 있다.
- React 라이브러는 View만을 위한 Javascript 라이브러리.
- 이외에도 Vue.js, Angular.js라는 프레임워크가 있다.
  - Angular.js는 죽었다.
  - React VS Vue.js
- 위 내용은 전부 순수 FrontEnd(Web Server) 쪽 기술이다.
- Node.js를 사용한 백엔드 가능

# OSI 7계층 | TCP&IP 5계층
- 7층(5층) HTTP 한번 요청보내면 한번 응답 받고 끝 | Web Socket HTTP 통신을 이용한 소켓 통신 
- 6층(4층) socket 데이터를 항상 언제든지 주고 받을수 있다 조건이없다. 보통은 C++ 로 구현한다 ( ex 게임 )
- 5층(4층) TCP | UDP
- 4층 IP

# Tomcat 실행
- Windows : tomcat9\bin\tomcat9.exe
- Mac : tomcat9\bin 에서 startup.sh 실행
