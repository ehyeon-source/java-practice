package ch05.sec11;

/*
 * [문제 상황: 커맨드라인 영화 티켓 예매 시스템]
 * 
 * 1. 입력값 검증:
 *    - 프로그램 실행 시 메인 메서드로 전달되는 인자(args)의 개수가 정확히 2개인지 검사한다.
 *    - 만약 인자 개수가 2개가 아니라면, "티켓 가격과 예매 인원수를 정확히 입력해주세요."를 출력하고 프로그램을 강제 종료한다.
 * 
 * 2. 데이터 추출 및 변환:
 *    - 전달받은 첫 번째 인자를 '티켓 단가'로, 두 번째 인자를 '예매 인원수'로 추출한다.
 *    - 추출한 두 개의 문자열 데이터를 산술 연산이 가능한 정수형(int)으로 각각 변환하여 변수에 저장한다.
 * 
 * 3. 결제 금액 계산 및 출력:
 *    - 변환된 티켓 단가와 예매 인원수를 곱하여 총 결제 금액을 계산한다.
 *    - "총 결제 금액: {계산된 총액}원" 형태로 출력한다.
 */

public class CommandLineTicketPractice {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("티켓 가격과 예매 인원수를 정확히 입력해주세요.");
			return;	//System.exit(0)이라는 더 정석적인 정상종료 방법있음 
		}
		
		String tempMoney = args[0];
		int money = Integer.parseInt(tempMoney);
		String tempPeople = args[1];
		int people = Integer.parseInt(tempPeople);
		
		int totalMoney = money * people;
		System.out.println("총 결제 금액: "+totalMoney+"원");
	}

}
