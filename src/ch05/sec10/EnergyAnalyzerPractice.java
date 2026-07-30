package ch05.sec10;

/*
 * [문제 상황: 스마트 홈 주간 전력 사용량 분석 시스템]
 * 
 * 1. 데이터 준비:
 *    - 정수형 배열(dailyEnergyUsage)을 생성하고, 월요일부터 금요일까지의 5일 치 전력 사용량 데이터인 42, 38, 45, 50, 41 을 할당한다.
 * 
 * 2. 총 사용량 집계 (필수 조건: 향상된 for문 사용):
 *    - 인덱스를 직접 컨트롤하는 전통적인 for문(for(int i=0...))의 사용을 엄격히 금지한다.
 *    - 배열에서 값을 하나씩 순차적으로 뽑아와서 변수에 담아주는 '향상된 for문'만을 사용하여 전체 전력 사용량의 총합을 구한다.
 * 
 * 3. 평균 사용량 계산 및 결과 출력:
 *    - 구해진 총합과 배열의 길이 속성을 활용하여 5일간의 '평균 전력 사용량'을 소수점까지 정확하게 보존하여 계산한다.
 *    - "주간 총 전력 사용량: [총합]" 을 출력한다.
 *    - "일일 평균 전력 사용량: [평균값]" 을 출력한다.
 */

public class EnergyAnalyzerPractice {

	public static void main(String[] args) {
		int[] dailyEnergyUsage = {42, 38, 45, 50, 41};
		
		int total = 0;
		
		
		for(int i:dailyEnergyUsage) {
			total+=i;
		}
		double avg = (double)total/dailyEnergyUsage.length;
		System.out.println("주간 총 전력 사용량: "+total);
		System.out.println("일일 평균 전력 사용량: "+avg);

	}

}
