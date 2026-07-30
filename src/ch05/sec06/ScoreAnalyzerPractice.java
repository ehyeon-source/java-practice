package ch05.sec06;

/*
 * [문제 상황 2: 학생 성적 분석기 (메서드 분리)]
 * 
 * 1. main 영역 설계:
 *    - 정수형 배열 변수(scores)를 먼저 선언만 해둔다. (이 줄에서는 값 대입 금지)
 *    - 다음 줄에서 85, 92, 78 이라는 세 개의 성적을 가진 배열을 생성하여 앞서 선언한 scores 변수에 대입한다.
 *    - 하단에 생성할 성적 분석 메서드를 호출하면서, 이 scores 배열을 매개값으로 넘겨준다.
 * 2. 성적 분석 메서드 설계:
 *    - main 메서드 바깥에, 정수형 배열을 매개변수로 받아주는 분석용 메서드(예: analyzeScores)를 선언한다.
 *    - 전달받은 배열을 순회하여 모든 성적의 총합을 구한다.
 *    - 구한 총합을 바탕으로 평균을 계산한다. (단, 평균은 소수점까지 정확하게 계산되어야 함)
 * 3. 결과 출력: 분석 메서드 내부에서 아래와 같이 출력한다.
 *    - "총합: {총합계}"
 *    - "평균: {평균값}"
 */

public class ScoreAnalyzerPractice {
	static void analyzeScores(int[] scores) {
		int total = 0;
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		double avg = (double)total / scores.length;
		System.out.println("총합: "+total);
		System.out.println("평균: "+avg);
	}
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {85,92,78};
		analyzeScores(scores);
		

	}

}
