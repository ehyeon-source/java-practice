package ch06.sec13.exam02.user;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec13.user
 * - 다른 동네(패키지)에 있는 Account 객체를 생성하려고 시도한다. (필요 시 패키지 수입(import) 활용)
 * - 위에서 만든 3가지 생성자 방식을 모두 호출하여 객체 생성을 시도하되, 문법적으로 에러(차단)가 발생하는 방식들은 주석 처리하고 그 이유를 적어둔다.
 */
import ch06.sec13.exam02.bank.Account;

public class MobileApp {

	public static void main(String[] args) {
		Account a1 = new Account(10.0);
		Account a2 = new Account(10);	//ai 왈 에러가 나는게 문제의도지만 자바가 컴파일러 뒤에서 몰래 자동 타입 변환을 시켰다고 함
		//Account a3 = new Account("10");

	}

}
