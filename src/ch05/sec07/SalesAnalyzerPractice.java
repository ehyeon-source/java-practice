package ch05.sec07;

/*
 * [문제 상황: 영업 지점별 월간 매출 통계 분석 시스템]
 * 
 * 1. 데이터 준비:
 *    - 2차원 정수 배열(salesData)을 선언하고, 중괄호를 사용해 선언과 동시에 아래의 데이터를 즉시 할당한다.
 *      - 1지점(첫 번째 행)의 매출: 120, 150, 130  (3개월 치 데이터)
 *      - 2지점(두 번째 행)의 매출: 200, 220       (2개월 치 데이터)
 * 
 * 2. 지점별 총매출 분석 (출력):
 *    - 중첩 반복문과 배열의 길이 속성을 활용하여 데이터를 순회한다.
 *    - 각 지점의 '총매출'을 계산하여 아래와 같은 형식으로 출력한다.
 *      (출력 예시)
 *      1지점 총매출: 400
 *      2지점 총매출: 420
 * 
 * 3. 전사 평균 매출 분석 (출력):
 *    - 모든 지점의 전체 매출 합계와 전체 데이터 개수(총 5개월)를 누적하여 구한다.
 *    - 누적된 데이터를 바탕으로 '전사 평균 매출'을 소수점까지 정확하게 계산하여 출력한다.
 *      (출력 예시)
 *      전사 평균 매출: 164.0
 */

public class SalesAnalyzerPractice {

	public static void main(String[] args) {
		int[][] salesData = {
				{120,150,130},
				{200,220}};
		
		int total=0;
		int count=0;
		
		for(int i=0;i<salesData.length;i++) {
			int sum=0;
			for(int j=0;j<salesData[i].length;j++) {
				count++;
				sum+= salesData[i][j];
			}
			System.out.println((i+1)+"지점 총매출: "+sum);
			total += sum;
		}
		double avg = (double)total / count;
		System.out.println("전사 평균 매출: "+avg);
	}

}
