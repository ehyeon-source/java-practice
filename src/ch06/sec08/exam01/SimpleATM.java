package ch06.sec08.exam01;

/*
 * [문제 상황 1: ATM 기기 기능 설계]
 *
 * 1. 파일 생성: public class로 선언된 클래스를 생성한다.
 * 2. 메서드 선언:
 *    - 메서드 ①: 리턴값이 없는(void) `insertCard()` 메서드를 선언하고, 내부에서 "카드가 인식되었습니다."를 출력한다.
 *    - 메서드 ②: 두 개의 정수(현재 잔액 currentBalance, 입금액 amount)를 매개변수로 받고, 두 값을 더한 결과를 정수(int)로 리턴하는 `deposit` 메서드를 선언한다.
 *    - 메서드 ③: 정수형 원화(won)와 실수형 환율(rate)을 매개변수로 받고, 원화를 환율로 나눈 결과값을 실수(double)로 리턴하는 `convertDollar` 메서드를 선언한다. (나눗셈 연산 시 캐스팅에 주의하세요)
 *    - 메서드 ④: 리턴값이 없는(void) `ejectCard()` 메서드를 선언하고, 내부에서 "카드를 반환합니다."를 출력한다.
 */

public class SimpleATM {
	void insertCard() {
		System.out.println("카드가 인식되었습니다.");
	}
	
	int deposit(int currentBalance, int amount) {
		return currentBalance + amount;
	}
	
	double convertDollar(int won, double rate) {
		return (double)won / rate;
	}
	
	void ejectCard() {
		System.out.println("카드를 반환합니다.");
	}
}
