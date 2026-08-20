package ch08.sec06.kiosk;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec06.kiosk
 * - Orderable 인터페이스를 구현하는 버거 주문 클래스.
 * 
 * [동작 요구사항]
 * - 인터페이스가 강제한 placeOrder() 메서드를 오버라이딩하여 "버거 메뉴 [menuName]을(를) 조리합니다." 를 출력하도록 한다.
 */
public class BurgerOrder implements Orderable{
	@Override
	public void placeOrder(String menuName) {
		System.out.println("버거 메뉴 "+menuName+"을(를) 조리합니다.");
	}
}
