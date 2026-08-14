package ch07.sec10.bank;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec10.bank
 * - 모든 은행 계좌의 공통 기능을 모아둔 부모 클래스.
 * - (가장 중요) 이 클래스는 뼈대 역할만 하므로, 절대 단독으로 new를 통해 객체를 생성할 수 없도록 설계한다.
 * 
 * [동작 요구사항]
 * - 필드 1개: 예금주(owner)를 문자열로 선언.
 * - 생성자: 예금주 이름을 매개변수로 받아 필드를 초기화한다.
 * - 메서드 1개: checkBalance()
 *   - 기능: "잔액을 조회합니다." 출력
 */
public abstract class Account {
	String owner;
	
	Account(String owner){
		this.owner = owner;
	}
	void checkBalance() {
		System.out.println("잔액을 조회합니다.");
	}
}
