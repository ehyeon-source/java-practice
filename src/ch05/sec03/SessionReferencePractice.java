package ch05.sec03;

/*
 * [문제 상황: 웹 서버 접속 세션(Session) 참조 검증]
 * 
 * 1. 데이터 준비:
 *    - String 배열 변수(sessionA)를 선언하고, new 키워드를 사용하여 {"admin", "guest"} 를 할당한다.
 *    - String 배열 변수(sessionB)를 선언하고, new 키워드를 사용하여 {"admin", "guest"} 를 할당한다.
 *    - String 배열 변수(sessionC)를 선언하고, sessionA의 참조값을 그대로 대입(공유)한다.
 * 2. 참조 비교 및 결과 출력:
 *    - sessionA와 sessionB가 메모리상에서 '같은 객체'를 참조하는지 `==` 연산자로 비교하여, 그 결과를 boolean 변수(isSameAB)에 저장한 뒤 콘솔에 출력한다.
 *    - sessionA와 sessionC가 '같은 객체'를 참조하는지 `==` 연산자로 비교하여, 그 결과를 boolean 변수(isSameAC)에 저장한 뒤 콘솔에 출력한다.
 * 3. 검증: 내부 데이터는 모두 같더라도, 출력 결과는 각각 false와 true가 나와야 한다.
 */

public class SessionReferencePractice {

	public static void main(String[] args) {
		String[] sessionA = new String[]{"admin", "guest"};	//배열 변수 할당하는 법 까아먹서 찾아봄.
		String[] sessionB = new String[]{"admin", "guest"};
		String[] sessionC = sessionA;
		
		boolean isSameAB = sessionA == sessionB;
		System.out.println(isSameAB);	//내 예상 false
		boolean isSameAC = sessionA == sessionC;
		System.out.println(isSameAC);	//내 예상 true
		

	}

}
