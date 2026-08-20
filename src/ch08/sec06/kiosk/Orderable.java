package ch08.sec06.kiosk;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec06.kiosk
 * - 모든 주문 시스템이 지켜야 할 규격과, 공통 유틸리티 기능을 제공하는 인터페이스.
 * 
 * [동작 요구사항]
 * - 추상 메서드 1개: 리턴이 없고 문자열 매개변수(menuName)를 받는 placeOrder(String menuName) 를 선언한다.
 * - 정적 메서드 1개: printWelcomeMessage() 를 선언하고, 내부에서 "키오스크 시스템에 오신 것을 환영합니다."를 출력하도록 구현한다.
 */
public interface Orderable {
	void placeOrder(String menuName);
	
	static void printWelcomeMessage() {
		System.out.println("키오스크 시스템에 오신 것을 환영합니다.");
	}
}
