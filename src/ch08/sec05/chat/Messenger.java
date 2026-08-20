package ch08.sec05.chat;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec05.chat
 * - 메신저가 갖춰야 할 기본 통신 규격을 정의한다.
 * 
 * [동작 요구사항]
 * - 추상 메서드: 리턴이 없고 문자열 매개변수(text)를 받는 sendMessage(String text) 를 선언한다.
 * - 디폴트 메서드: 리턴이 없고 문자열 매개변수(fileName)를 받는 sendFile(String fileName) 을 선언한다.
 *   - 디폴트 메서드 내부 로직: 
 *     1) "기본 설정: 파일 전송 기능을 지원하지 않아 파일명만 텍스트로 보냅니다." 출력
 *     2) 내부에서 자신의 추상 메서드인 sendMessage()를 호출하며 매개변수로 fileName을 넘겨준다.
 */
public interface Messenger {
	void sendMessage(String text);
	
	default void sendFile(String fileName) {
		System.out.println("기본 설정: 파일 전송 기능을 지원하지 않아 파일명만 텍스트로 보냅니다.");
		sendMessage(fileName);
	}
}
