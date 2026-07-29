package ch04.sec03;

/*
 * [문제 상황 1: 스마트 팩토리 공정 스킵 및 연속 조립 시스템]
 * 
 * 1. 초기 데이터: 현재 투입된 부품이 시작해야 할 공정 단계를 나타내는 int 변수(processStep)에 2를 할당한다.
 * 2. 공정 실행 (다중 분기 활용): 단계별로 아래의 메시지를 출력하되, 시작 단계부터 그 이후의 모든 단계가 순차적으로 멈춤 없이 실행되도록 흐름을 설계한다.
 *    - 단계가 1일 때: "1단계: 뼈대 조립" 출력 (이후 2단계로 계속 진행됨)
 *    - 단계가 2일 때: "2단계: 엔진 탑재" 출력 (이후 3단계로 계속 진행됨)
 *    - 단계가 3일 때: "3단계: 외관 도색" 출력 (이후 최종 단계로 계속 진행됨)
 *    - 그 외의 단계일 때: "최종: 검수 및 출고" 출력 후 흐름 완전 종료.
 * 3. 검증: processStep이 2인 상태로 실행했을 때 콘솔에 "2단계", "3단계", "최종" 메시지가 모두 연속으로 출력되어야 한다. (흐름을 중단시키는 문법을 의도적으로 배제할 것)
 */

public class FactoryProcessPractice {

	public static void main(String[] args) {
		int processStep = 2;
		
		switch(processStep) {
		case 1:
			System.out.println("1단계: 뼈대 조립");
		case 2:
			System.out.println("2단계: 엔진 탑재");
		case 3:
			System.out.println("3단계: 외관 도색");
		default:
			System.out.println("최종: 검수 및 출고");
		}
	}

}
