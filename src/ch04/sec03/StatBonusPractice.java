package ch04.sec03;

/*
 * [문제 상황 2: RPG 게임 직업별 보너스 스탯 산출 시스템]
 * 
 * 1. 초기 데이터: 플레이어의 직업을 나타내는 String 변수(playerClass)에 "MAGE"를 할당한다.
 * 2. 보너스 산출 (최신 표현식 활용): 직업에 따라 보너스 스탯을 계산하여 int 변수(bonusStat)에 '직접 할당'한다.
 *    - 직업이 "WARRIOR"인 경우: 100을 반환
 *    - 직업이 "MAGE"인 경우: 내부적으로 (50 * 3)을 계산하여 int 임시 변수(calcResult)에 담은 뒤, 그 값을 최종 반환하여 할당되게 함
 *    - 직업이 "ARCHER" 또는 "THIEF"인 경우: 80을 반환 (두 가지 조건을 한 줄에서 콤마로 묶어 동시에 처리할 것)
 *    - 그 외의 모든 경우: 10을 반환
 * 3. 결과 출력: 최종 계산된 bonusStat 값을 "MAGE의 보너스 스탯: [값]" 형태로 콘솔에 출력한다.
 */

public class StatBonusPractice {

	public static void main(String[] args) {
		String playerClass = "MAGE";
		
		int bonusStat = switch(playerClass) {
		case "WARRIOR" -> 100;
		case "MAGE"->{
			int calcResult = 50 * 3;
			yield calcResult;
		}
		case "ARCHER","THIEF" -> 80;
		default -> 10;
		};

		System.out.println("MAGE의 보너스 스탯: "+bonusStat);
	}

}
