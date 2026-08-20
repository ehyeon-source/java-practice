package ch08.sec05.chat;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec05.chat
 * 
 * [테스트 순서 및 요구사항]
 * 1. Messenger 타입 변수 하나를 선언한다.
 * 2. BasicSms 객체를 대입하고, sendMessage("안녕") 와 sendFile("보고서.pdf") 를 호출해 본다. (디폴트 메서드가 내부에서 추상 메서드를 부르는 흐름 확인)
 * 3. PremiumChat 객체로 교체하여 대입하고, sendMessage("안녕") 와 sendFile("보고서.pdf") 를 호출해 본다. (오버라이딩된 디폴트 메서드의 독립적인 흐름 확인)
 */
public class ChatApp {
	public static void main(String[] args) {
		Messenger m;
		
		m = new BasicSms();
		m.sendMessage("안녕");
		m.sendFile("보고서.pdf");
		
		System.out.println();
		
		m = new PremiumChat();
		m.sendMessage("안녕");
		m.sendFile("보고서.pdf");
	}

}
