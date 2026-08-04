package ch06.sec10.exam03;

/*
 * [가동 조건]
 * - main 메서드에서 다음 두 가지 작업을 순서대로 수행한다.
 * 1. Ticket 객체를 생성하지 않고, 클래스명을 통해 'VIP 티켓 발급' 정적 메서드를 직접 호출한다.
 * 2. 그 다음, 새로운 Ticket 객체를 힙 영역에 직접 생성하여 티켓 번호를 101로 세팅하고, '티켓 출력' 인스턴스 메서드를 호출한다.
 * 
 * [기대되는 정확한 출력 결과]
 * 티켓 번호: 9999번 발급 완료
 * 티켓 번호: 101번 발급 완료
 */

public class TicketPractice {

	public static void main(String[] args) {
		Ticket.printVipTicket();
		Ticket tk = new Ticket(101);
		tk.printTicket();

	}

}
