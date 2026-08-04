package ch06.sec11.exam01;

/*
 * [핵심 조건]
 * - BankAccount 클래스를 설계한다.
 * - 생성 후 절대 변경되면 안 되는 데이터와, 변경 가능한 데이터를 구분하여 필드를 선언한다.
 * 
 * [동작 요구사항]
 * - 필드 1 (은행명): 선언과 동시에 "JavaBank"로 초기화하며, 이후 절대 변경할 수 없도록 설정한다.
 * - 필드 2 (계좌번호): 문자열 타입으로 선언하되, 객체 생성 시점(생성자)에 값을 전달받아 초기화하고 이후 변경할 수 없도록 설정한다.
 * - 필드 3 (예금주명): 문자열 타입으로 선언하고 생성자에서 초기화하지만, 개명 등으로 인해 나중에도 값을 변경할 수 있어야 한다.
 * - 생성자: 계좌번호와 예금주명 데이터를 입력받아 필드를 초기화한다.
 */

public class BankAccount {
	final String bankName = "JavaBank";
	final String num;
	String name;
	
	BankAccount(String num, String name){
		this.num = num;
		this.name = name;
	}
	
}
