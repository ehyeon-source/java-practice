package ch06.sec08.exam02;

/*
 * [문제 상황 1: 가변길이 매개변수를 활용한 점수 계산기 설계]
 *
 * 1. 메서드 선언:
 *    - 리턴 타입이 정수(int)인 `calcTotalScore` 메서드를 선언한다.
 *    - 매개변수로 정수형 가변길이 매개변수(`int... scores`)를 받도록 선언한다.
 * 
 * 2. 로직 구현:
 *    - 메서드 내부에서 총합을 누적할 정수형 변수(예: total)를 0으로 선언한다.
 *    - for문을 사용하여 전달받은 점수들의 총합을 구한 뒤, 그 결과를 리턴(return)한다.
 */

public class ScoreCalculator {
	int calcTotalScore(int...scores) {
		int total = 0;
		for(int i:scores) {
			total+=i;
		}
		return total;
	}
}
