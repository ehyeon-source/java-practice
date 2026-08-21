package ch08.sec12.payment;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec12.payment
 * - Payable 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - pay() 오버라이딩 -> "상품권으로 결제합니다." 출력
 * - GiftCard만의 고유 메서드 추가: checkBalance() -> "상품권 잔액을 확인합니다." 출력
 */
public class GiftCard implements Payable{
	@Override
	public void pay() {
		System.out.println("상품권으로 결제합니다.");
	}
	
	void checkBalance() {
		System.out.println("상품권 잔액을 확인합니다.");
	}
}
