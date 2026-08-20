package ch08.sec02.pay;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec02.pay
 * - 모든 결제 수단이 반드시 지켜야 하는 표준 규칙을 정하는 인터페이스.
 * 
 * [동작 요구사항]
 * - 리턴 타입이 없고 매개변수도 없는 pay() 추상 메서드를 하나 선언한다.
 */
public interface Payment {
	void pay();
}
