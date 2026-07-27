package ch03.sec04;

/*
 * [문제 상황: 스마트 물류 트럭의 남은 연료량 정밀 계산]
 * 
 * 1. 위험한 실수 연산 (오차 확인용): 트럭의 초기 연료량은 7L(int maxFuel)이다. 1km를 달릴 때마다 0.1L(double consumePerKm)씩 소모된다. 트럭이 63km(int driveDistance)를 주행했을 때 남은 연료량을 연산하여 double 타입 변수(wrongResult)에 담고 콘솔에 출력해 본다. (부정확한 값이 나오는 것을 확인한다.)
 * 2. 정밀도 보정 (정수 연산 전환): 위와 동일한 조건에서, 소수점 오차가 발생하지 않도록 초기 연료량과 소모량을 모두 '정수' 단위로 변환(스케일업)하여 계산을 수행한다. 과정에 필요한 변수들은 직접 판단하여 int 타입으로 선언한다.
 * 3. 정확한 결과 출력: 정수 연산으로 도출된 최종 남은 연료량을 바탕으로, 다시 원래의 리터(L) 단위의 실수 값으로 복원하여 콘솔에 "정확한 남은 연료량: [값]L" 형태로 출력한다.
 */

public class FuelAccuracyPractice {

	public static void main(String[] args) {
		int maxFuel = 7;
		double consumPerKm = 0.1;
		int driveDistance = 63;
		double wrongResult = maxFuel - consumPerKm * driveDistance;
		System.out.println("wrongResult: "+wrongResult);
		
		int result = (int)(maxFuel/consumPerKm)-driveDistance;	//AI왈 좋지않은 코드, 계산 과정 자체에 실수를 아예 얼씬도 못 하게 하라고 주장
		
		
		System.out.println("정확한 남은 연료량: "+(result/10.0)+"L");
	}

}
