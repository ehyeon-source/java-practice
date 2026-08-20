package ch08.sec02.pay;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec02.pay
 * - 두 클래스 모두 Payment 인터페이스의 규칙을 따르도록(구현하도록) 선언한다.
 * 
 * [동작 요구사항]
 * - 인터페이스가 강제한 pay() 메서드를 각자에 맞게 재정의(오버라이딩)한다.
 * - CreditCard 클래스는 "신용카드로 결제합니다." 출력
 * - KakaoPay 클래스는 "카카오페이로 간편 결제합니다." 출력
 */
public class CreditCard implements Payment{
	@Override
	public void pay() {
		System.out.println("신용카드로 결제합니다.");
	}
}
