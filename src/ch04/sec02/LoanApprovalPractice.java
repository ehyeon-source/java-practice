package ch04.sec02;

/*
 * [문제 상황 2: 은행 비대면 대출 자동 심사 시스템]
 * 
 * 1. 고객 데이터 준비: 신용 점수를 나타내는 int 변수(creditScore)에 750을, 연 소득(단위: 만원)을 나타내는 int 변수(annualIncome)에 4500을 할당한다.
 * 2. 단계별 심사 진행:
 *    - 1차 심사: 신용 점수가 700 이상인지 판별한다.
 *      - 700 이상인 경우에만 2차 심사(연 소득)로 넘어간다.
 *        - 연 소득이 5000 이상이면: String 변수(result)에 "대출 최종 승인" 할당
 *        - 연 소득이 5000 미만이면: String 변수(result)에 "보증인 추가 필요" 할당
 *      - 700 미만인 경우 2차 심사를 진행하지 않고 즉각 탈락 처리한다.
 *        - String 변수(result)에 "신용 미달로 대출 거절" 할당
 * 3. 결과 출력: 최종 심사 결과(result)를 콘솔에 출력한다.
 */

public class LoanApprovalPractice {

	public static void main(String[] args) {
		int creditScore = 750;
		int annualIncome = 4500;
		
		String result;
		
		if(700 <= creditScore) {
			if(5000 <= annualIncome) {
				result = "대출 최종 승인";
			}else {
				result = "보증인 추가 필요";
			}
		}else {
			result = "신용 미달로 대출 거절";
		}
		
		System.out.println("result: "+result);

	}

}
