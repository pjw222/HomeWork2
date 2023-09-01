package c230901;

public class StrBuilderTest {
	public static void strBuildersTest() {
		String str1 = "abc";
		str1 = str1+ "defg";
		
		StringBuilder sb = new StringBuilder();
		str1 = str1.replace("b", "z");
		String str2 = sb.append("글자를 추가한다.").toString(); //append 뒤에다가 원하는걸 자기가 처리가한다
		System.out.println(str2);
		// 0글1자2를3 (4추5가6)한7다8.9
		System.out.println(sb.delete(4, 6).toString());
		System.out.println(sb.replace(4, 4, "수정").toString());
		System.out.println(sb.replace(4, 6, "치환").toString());
		System.out.println(sb.append("글자를 추가한다.").toString());
		str1.substring(5);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
