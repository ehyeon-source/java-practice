package ch07.sec10.bank;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec10.bank
 * 
 * [테스트 순서 및 요구사항]
 * 1. 부모인 Account 객체를 직접 new로 생성해 본다.
 * 2. 컴파일러가 빨간줄을 뿜어내면 해당 줄을 주석(//) 처리하고, "이 클래스가 직접 객체를 생성할 수 없는 이유"를 본인의 언어로 짤막하게 적어둔다.
 * 3. 자식인 SavingsAccount 객체를 예금주 이름과 함께 정상적으로 생성한다.
 * 4. 생성된 적금 계좌를 통해 checkBalance()와 earnInterest()를 차례대로 호출하여 정상 작동을 확인한다.
 */
public class BankApp {
	public static void main(String[] args) {
		//Account a = new Account();	추상클래스는 상속해주는 것이 목적이기에 생성 불가능하게 막혀있다.
		
		SavingsAccount sa = new SavingsAccount("선준");
		
		sa.checkBalance();
		sa.earnInterest();
	}

}
