package ch08.sec05.chat;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec05.chat
 * - Messenger 인터페이스를 구현하는 기본 문자 클래스.
 * 
 * [동작 요구사항]
 * - 인터페이스가 강제한 sendMessage()만 오버라이딩하여 "일반 SMS로 전송: [text]" 를 출력하도록 한다.
 * - (주의: 디폴트 메서드인 sendFile()은 오버라이딩하지 않고 부모의 것을 그대로 물려받아 사용한다.)
 */
public class BasicSms implements Messenger{
	@Override
	public void sendMessage(String text) {
		System.out.println("일반 SMS로 전송: "+text);
	}
}
