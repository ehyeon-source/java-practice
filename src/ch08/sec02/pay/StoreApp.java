package ch08.sec02.pay;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec02.pay
 * 
 * [테스트 순서 및 요구사항]
 * 1. Payment 타입의 참조 변수를 하나 선언한다.
 * 2. 이 변수에 CreditCard 객체를 연결하고, pay()를 호출하여 정상 작동을 확인한다.
 * 3. 동일한 참조 변수에 이번에는 KakaoPay 객체로 교체하여 연결하고, 다시 pay()를 호출하여 변경된 결제 방식이 정상 출력되는지 확인한다.
 */
public class StoreApp {
	public static void main(String[] args) {
		Payment p = new CreditCard();
		p.pay();
		
		p = new KakaoPay();
		p.pay();
	}

}
