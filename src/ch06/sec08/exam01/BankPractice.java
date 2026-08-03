package ch06.sec08.exam01;

/*
 * [문제 상황 2: ATM 기기 조작 및 결과 확인]
 * 
 * 1. 객체 생성:
 *    - SimpleATM 객체를 생성하고 변수(myAtm)에 담는다.
 * 
 * 2. 메서드 순차적 호출 및 결과 출력:
 *    - myAtm의 `insertCard()` 메서드를 호출한다.
 *    - myAtm의 `deposit()` 메서드에 10000과 50000을 전달하여 호출하고, 리턴받은 결과값을 `totalMoney`라는 변수에 담아 "입금 후 총 잔액: [값]원" 형태로 출력한다.
 *    - myAtm의 `convertDollar()` 메서드에 130000과 1300.0을 전달하여 호출하고, 리턴받은 결과값을 `usd`라는 변수에 담아 "환전된 달러: [값]USD" 형태로 출력한다.
 *    - myAtm의 `ejectCard()` 메서드를 호출한다.
 */

public class BankPractice {

	public static void main(String[] args) {
		SimpleATM myAtm = new SimpleATM();
		
		myAtm.insertCard();
		
		int totalMoney = myAtm.deposit(10000, 50000);
		System.out.println("입금 후 총 잔액: "+totalMoney+"원");
		
		double usd = myAtm.convertDollar(130000, 1300.0);
		System.out.println("환전된 달러: "+usd+"USD");
		
		myAtm.ejectCard();
	}

}
