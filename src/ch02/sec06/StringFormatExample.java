package ch02.sec06;

/*
 * [문제 상황: 카페 메뉴판 포맷팅 및 서버 JSON 응답 데이터 작성]
 *
 * 1. 이스케이프 문자 활용: String 변수(menuItem)를 선언하고, 이스케이프 문자(\t, \n, \")만을 활용하여 아래와 같은 형태를 구성한 뒤 System.out.print()로 출력한다.
 * 카테고리(탭)메뉴명
 * "커피"(탭)아메리카노
 *
 * 2. 텍스트 블록 기본 활용: 텍스트 블록(""")을 사용하여 아래 모양의 JSON 형식 데이터를 String 변수(jsonResponse)에 저장하고 출력한다.
 * {
 *     "code": "200",
 *     "status": "정상"
 * }
 *
 * 3. 텍스트 블록 줄바꿈 방지: 텍스트 블록을 사용하여 String 변수(longText)를 만든다. 단, 코드 안에서는 엔터를 쳐서 두 줄로 나누어 작성하되, 콘솔에 출력할 때는 "이 긴 문장은 텍스트 블록 안에서 작성되었지만 한 줄로 출력됩니다."라는 문장이 줄바꿈 없이 한 줄로 나오도록 특정 기호를 사용하여 처리한 후 출력한다.
 */

public class StringFormatExample {

	public static void main(String[] args) {
		String menuItem = "카테고리\t메뉴명\n\"커피\"\t아메리카노";
		System.out.print(menuItem);
		
		String jsonResponese = """
				{
				   "code": "200",
				   "status": "정상"
				}
				""";
		System.out.println(jsonResponese);
		
		String longText = """
				"이 긴 문장은 텍스트 블록 안에서 \
				작성되었지만 한 줄로 출력됩니다."
				""";
		System.out.println(longText);
		
		//자잘한 오타 실수가 많았음
	}

}
