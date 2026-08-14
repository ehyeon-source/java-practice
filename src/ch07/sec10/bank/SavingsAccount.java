package ch07.sec10.bank;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec10.bank
 * - Account를 상속받는 적금 계좌 클래스.
 * 
 * [동작 요구사항]
 * - 생성자: 예금주 이름을 매개변수로 받아, 부모의 생성자를 호출하여 세팅해 준다.
 * - 고유 메서드 1개: earnInterest()
 *   - 기능: "이자가 발생합니다." 출력
 */
public class SavingsAccount extends Account{
	SavingsAccount(String owner){
		super(owner);
	}
	
	void earnInterest() {
		System.out.println("이자가 발생합니다.");
	}
}
