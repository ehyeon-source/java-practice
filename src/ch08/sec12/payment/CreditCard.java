package ch08.sec12.payment;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec12.payment
 * - Payable 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - pay() 오버라이딩 -> "신용카드로 결제합니다." 출력
 */
public class CreditCard implements Payable{
	@Override
	public void pay() {
		System.out.println("신용카드로 결제합니다.");
	}
}
