package ch04.sec05;

/*
 * [문제 상황 2: RPG 게임 목표 경험치 달성 시뮬레이터]
 * 
 * 1. 데이터 준비: 현재 경험치를 나타내는 int 변수(exp)를 0으로 초기화한다.
 *    사냥 횟수를 카운트할 int 변수(huntCount)를 0으로 초기화한다.
 * 2. 사냥 반복 (while문 활용):
 *    - 현재 경험치(exp)가 100 '미만'인 동안 계속해서 사냥을 반복하는 루프를 만든다. (100 이상이 되면 즉시 종료되어야 함)
 *    - 한 번 반복될 때마다 경험치(exp)는 15씩 증가한다.
 *    - 한 번 반복될 때마다 사냥 횟수(huntCount)는 1씩 증가한다.
 * 3. 결과 출력: 반복문이 완전히 종료된 후, 아래의 두 줄을 콘솔에 정확한 형식으로 출력한다.
 *    - "최종 경험치: [exp]"
 *    - "총 사냥 횟수: [huntCount]회"
 */

public class ExpSimulatorPractice {

	public static void main(String[] args) {
		int exp = 0;
		int huntCount = 0;
		
		while(true) {
			if(100<=exp)break;
			exp+=15;
			huntCount++;
		}
		System.out.println("최종 경험치: "+exp);
		System.out.println("총 사냥 횟수: "+huntCount+"회");

	}

}
