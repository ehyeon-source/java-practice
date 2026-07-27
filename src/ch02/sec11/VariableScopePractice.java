package ch02.sec11;

/*
 * [문제 상황: 게임 캐릭터 보너스 점수 계산 시스템]
 *
 * 1. 메인 블록 변수 선언: 기본 점수를 의미하는 int 변수(baseScore)를 선언하고 80을 할당한다. 또한 최종 점수 계산에 쓰일 보너스 점수를 담을 int 변수(bonusScore)를 선언하고 미리 0으로 초기화해 둔다.
 * 2. if 블록 내부 범위 활용: 만약 기본 점수(baseScore)가 70보다 크다면, 보너스 점수(bonusScore) 값으로 20을 대입한다. 이어서 이 if 블록 내부에서만 사용할 임시 합계용 int 변수(tempTotal)를 새롭게 선언하여 기본 점수와 보너스 점수를 더한 값을 할당하고, "보너스 적용! 임시 합계: [값]" 형태로 출력한다.
 * 3. 메인 블록 결과 산출: if 블록이 완전히 종료된 후, 최종 점수를 담을 int 변수(finalScore)를 선언하고 기본 점수와 보너스 점수를 더하여 할당한 뒤 "최종 점수: [값]" 형태로 콘솔에 출력한다.
 */

public class VariableScopePractice {

	public static void main(String[] args) {
		int baseScore = 80;
		int bonusScore = 0;
		
		if(baseScore > 70) {
			bonusScore+=20;
			int tempTotal = baseScore + bonusScore;
			System.out.println("보너스 적용! 임시 합계: "+tempTotal);
		}
		
		int finalScore = baseScore + bonusScore; 
		System.out.println("최종 점수: "+finalScore);

	}

}
