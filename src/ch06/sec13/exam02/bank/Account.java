package ch06.sec13.exam02.bank;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec13.bank
 * - Account 클래스를 설계한다.
 * - 생성자를 오버로딩하여 다음 3가지 버전을 만든다. (권한 제어 키워드 활용 혹은 생략)
 *   1. [고객용]: 매개변수로 실수형(double)을 받으며, 외부 패키지(전 세계) 어디서든 이 방식으로 객체를 생성할 수 있도록 완전히 개방한다.
 *   2. [직원용]: 매개변수로 정수형(int)을 받으며, 같은 패키지(bank) 내부에서만 이 방식으로 객체를 생성할 수 있도록 잠가둔다.
 *   3. [시스템용]: 매개변수로 문자열(String)을 받으며, 오직 이 Account 클래스 내부에서만 객체를 생성할 수 있도록 가장 강력하게 잠가둔다.
 */

public class Account {
	public Account(double a){
		System.out.println("고객용(double) 개방형 생성자 호출됨");
	}
	
	Account(int a){
		System.out.println("직원용(int) 내수용 생성자 호출됨");
	}
	private Account(String a) {
		
	}
}
