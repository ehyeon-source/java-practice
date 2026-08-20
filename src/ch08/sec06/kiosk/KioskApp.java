package ch08.sec06.kiosk;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec06.kiosk
 * 
 * [테스트 순서 및 요구사항]
 * 1. (중요) 아직 어떠한 주문 객체도 생성하지 않은 상태에서, 인터페이스의 정적 메서드인 printWelcomeMessage()를 다이렉트로 호출하여 환영 인사를 출력한다.
 * 2. Orderable 타입의 참조 변수를 선언하고 BurgerOrder 객체를 연결한다.
 * 3. placeOrder("치즈버거") 를 호출하여 정상적으로 주문이 들어가는지 확인한다.
 */
public class KioskApp {
	public static void main(String[] args) {
		Orderable.printWelcomeMessage();
		
		Orderable order = new BurgerOrder();
		
		order.placeOrder("치즈버거");

	}

}
