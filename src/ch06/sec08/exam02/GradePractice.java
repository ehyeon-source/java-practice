package ch06.sec08.exam02;

/*
 * [문제 상황 2: 과목 수에 상관없이 성적 집계하기]
 * 
 * 1. 객체 생성:
 *    - ScoreCalculator 객체를 생성하고 변수(myCalc)에 담는다.
 * 
 * 2. 다양한 형태로 메서드 호출 및 출력:
 *    - 2학기 중간고사 (2과목): `calcTotalScore`에 85, 90을 전달하여 호출하고 결과를 출력한다.
 *    - 2학기 기말고사 (4과목): `calcTotalScore`에 100, 95, 80, 90을 전달하여 호출하고 결과를 출력한다.
 *    - 모의고사 (배열 전달): `calcTotalScore`에 `new int[] {75, 85, 95}`를 직접 전달하여 호출하고 결과를 출력한다.
 */

public class GradePractice {

	public static void main(String[] args) {
		ScoreCalculator myCalc = new ScoreCalculator();
		
		System.out.println("2학기 중간고사 (2과목): "+myCalc.calcTotalScore(85,90));
		System.out.println("2학기 기말고사 (4과목): "+myCalc.calcTotalScore(100, 95, 80, 90));
		System.out.println("모의고사 (배열 전달): "+myCalc.calcTotalScore(new int[] {75, 85, 95}));
	}

}
