package ch06.sec13.exam02.bank;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec13.bank
 * - 같은 동네(패키지)에 있는 Account 객체를 생성하려고 시도한다.
 * - 위에서 만든 3가지 생성자 방식을 모두 호출하여 객체 생성을 시도하되, 문법적으로 에러(차단)가 발생하는 방식은 주석 처리하고 그 이유를 적어둔다.
 */

public class BranchManager {

	public static void main(String[] args) {
		
		Account a1 = new Account(10.0);
		Account a2 = new Account(10);
		//Account a3 = new Account("10");	//private 는 선언된 그 클래스 내부에서만 사용이 가능
		
		

	}

}
