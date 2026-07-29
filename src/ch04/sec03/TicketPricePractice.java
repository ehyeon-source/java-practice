package ch04.sec03;

/*
 * [문제 상황: 영화관 요일별 티켓 요금 자동 계산 시스템]
 * 
 * 1. 초기 데이터: 관람 요일을 나타내는 String 변수(dayOfWeek)에 "SATURDAY"를 할당한다.
 * 2. 요금 계산 (최신 switch 표현식 활용): 요일에 따른 최종 티켓 가격을 판단하여 int 변수(ticketPrice)에 '직접 할당'한다.
 *    - "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" 인 경우: 평일 기본요금인 10000을 반환 (반드시 콤마로 묶어서 한 줄로 처리할 것)
 *    - "FRIDAY" 인 경우: 금요일 요금인 12000을 반환
 *    - "SATURDAY" 또는 "SUNDAY" 인 경우: 중괄호 블록을 열고, 내부에서 주말 기본요금(15000)과 주말 할증금(2000)을 더하는 수식을 작성하여 int 임시 변수(calcPrice)에 담은 뒤, 그 값을 최종 반환하여 할당되게 함 (이 조건 역시 콤마로 묶어서 처리할 것)
 *    - 그 외의 잘못된 입력일 경우: 0을 반환
 * 3. 결과 출력: 최종 계산된 ticketPrice 값을 "SATURDAY의 티켓 요금: [값]" 형태로 콘솔에 출력한다.
 */

public class TicketPricePractice {

	public static void main(String[] args) {
		String dayOfWeek = "SATURDAY";
		
		int ticketPrice = switch(dayOfWeek) {
		case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" -> 10000;
		
		case "FRIDAY" -> 12000;
		
		case "SATURDAY", "SUNDAY"-> {
			int calcPrice = 15000 + 2000;
			yield calcPrice;
		}
		
		default -> 0;
		};
		
		System.out.println("SATURDAY의 티켓 요금: "+ticketPrice);
	}

}
