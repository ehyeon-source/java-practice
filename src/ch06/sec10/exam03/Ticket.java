package ch06.sec10.exam03;

/*
 * [핵심 조건]
 * - Ticket 클래스를 설계한다.
 * - 정적(static) 구역에서는 인스턴스 멤버에 다이렉트로 접근할 수 없다는 원칙을 준수하여 로직을 구성한다.
 * 
 * [동작 요구사항]
 * - 인스턴스 필드: 티켓 번호(정수)
 * - 인스턴스 메서드 (티켓 출력): "티켓 번호: [티켓번호]번 발급 완료"를 출력한다.
 * - 정적 메서드 (VIP 티켓 발급): 내부에서 스스로 Ticket 객체를 하나 생성한 뒤, 그 객체의 티켓 번호를 9999로 세팅하고 '티켓 출력' 인스턴스 메서드를 호출한다.
 */

public class Ticket {
	int ticketNum;
	Ticket(){
		
	}
	
	Ticket(int ticketNum){
		this.ticketNum = ticketNum;
	}
	
	void printTicket() {
		System.out.println("티켓 번호: "+ticketNum+"번 발급 완료");
	}
	
	static void printVipTicket() {
		Ticket tk = new Ticket();
		tk.ticketNum = 9999;
		tk.printTicket();
	}
}
