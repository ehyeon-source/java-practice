package ch04.sec04;

/*
 * [문제 상황 1: 100일 챌린지 저금통 누적 시스템]
 * 
 * 1. 데이터 준비: 저금된 총금액을 누적해서 담을 int 변수(totalMoney)를 선언하고 0으로 초기화한다. 
 *    날짜 카운터 역할을 할 int 변수(day)를 하나 선언한다. (단, day 변수는 반드시 반복문 바깥에서 선언할 것)
 * 2. 100일 저금 실행 (for문 사용): 1일 차부터 100일 차까지 매일 반복해서 저금을 진행한다.
 *    - 매일 저금하는 금액은 '현재 일차(day) * 100' 원이다. (예: 1일차 100원, 2일차 200원 ... 100일차 10000원)
 *    - 이 금액을 totalMoney에 계속 누적해서 더한다.
 * 3. 결과 출력: 반복문이 완전히 종료된 후, 아래의 두 줄을 콘솔에 출력한다.
 *    - "최종 누적 금액: [총금액]원"
 *    - "저금 완료 일수: [최종 day 값 - 1]일" (반드시 반복문 바깥에서 day 변수를 재활용하여 출력할 것)
 */

public class PiggyBankPractice {

	public static void main(String[] args) {
		int totalMoney = 0;
		int day;
		
		for(day=1;day<=100;day++) {
			totalMoney += (day * 100);
		}
		
		System.out.println(totalMoney+"원");
		System.out.println(day-1+"일");
	}

}
