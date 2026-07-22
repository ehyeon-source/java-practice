package ch02.sec08;

/*
 * [문제 상황: 영화관 티켓 발권 및 할인 시스템]
 * 
 * 1. 실수에서 정수로 변환 (소수점 버림): 고객에게 할인율을 적용한 최종 결제 금액이 12500.85원이다. 이 값을 double 타입 변수(discountedPrice)에 저장한다. 이후 원 단위 이하의 소수점을 버리기 위해 int 타입 변수(finalPrice)로 강제 타입 변환하여 대입한다.
 * 2. 정수에서 문자로 변환: 발권될 영화의 상영관 코드가 메인 서버에서 정수 66으로 전달되었다. int 타입 변수(roomCode)에 저장한 뒤, 고객에게 보여줄 실제 알파벳 상영관 이름을 구하기 위해 char 타입 변수(roomName)로 강제 타입 변환하여 대입한다.
 * 3. 큰 정수에서 작은 정수로 변환: 해당 상영관의 오늘 예약된 총 관람객 수는 110명이다. 먼저 long 타입 변수(totalAudience)에 이 값을 저장한다. 이 인원수는 byte 타입의 최대 범위 안에 충분히 들어가므로, 메모리 최적화를 위해 byte 타입 변수(byteAudience)로 강제 타입 변환하여 대입한다.
 * 4. 결과 출력: 최종 결제 금액(finalPrice), 상영관 이름(roomName), 관람객 수(byteAudience)를 콘솔에 출력하여 변환이 의도대로 이루어졌는지 확인한다.
 */

public class TicketCastingExample {

	public static void main(String[] args) {
		double discountedPrice = 12500.85;
		int finalPrice = (int)discountedPrice;
		
		int roomCode = 66;
		char roomName = (char)roomCode;
		
		long totalAudience = 110;
		byte byteAudience = (byte)totalAudience;
		
		System.out.println("최종 결제 금액: "+finalPrice);
		System.out.println("상영관 이름: "+roomName);
		System.out.println("관람객 수: "+byteAudience);
	}

}
