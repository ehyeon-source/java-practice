package ch08.sec12.payment;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec12.payment
 * 
 * [동작 요구사항]
 * 1. 매개변수로 Payable 타입을 받는 정적(static) 메서드 process(Payable p)를 선언한다.
 * 2. process() 메서드 내부 로직: 
 *    - 매개변수로 들어온 객체의 pay()를 호출한다.
 *    - instanceof 연산자(Java 12+ 패턴 매칭 권장)를 사용하여, 해당 객체가 GiftCard 타입인지 확인한 후 맞다면 checkBalance()를 호출한다.
 * 
 * [테스트 순서]
 * - main 메서드 내부에서 CreditCard와 GiftCard 객체를 생성한다.
 * - process() 메서드에 두 객체를 번갈아 전달하여, 상품권일 때만 안전하게 잔액 확인 로직이 작동하는지 검증한다.
 */
public class PaymentApp {
	static void process(Payable p) {
		p.pay();
		
		if(p instanceof GiftCard giftcard) {
			giftcard.checkBalance();
		}
	}
	public static void main(String[] args) {
		process(new CreditCard());
		process(new GiftCard());

	}

}
