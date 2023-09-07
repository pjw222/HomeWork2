package c230907;

public class Main {

	public static void main(String[] args) {
//		Exception e; //예외
		// error => 문제 발생 시 해당 문제를 다른 방식으로 처리한다.
		// 멈추지 않고 계속 돌아간다 이런 문제가 발생했다고만 알려주고
		// 예외 처리
		// 인덱스 버퍼 없을 때 << 개발할 때
		// 로그인 할 때 없는 아이디, 비밀번호 틀림, 전화번호 입력할 때 8개 숫자만 입력
		// if 입력 뭘 받았냐? => 제대로 입력이 안되면 "다시 입력해라"
		// Exception => 컴파일, 런타임을 진행하면서 에러가 발생했다 또는 발생할 확률이 있다.
		// 런타임 : 실행환경
		
		try {
			ExceptionTest.test();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			throw new Exception("에외 처리중");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}
