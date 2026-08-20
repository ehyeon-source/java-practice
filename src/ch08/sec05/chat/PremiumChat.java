package ch08.sec05.chat;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec05.chat
 * - Messenger 인터페이스를 구현하는 사내 전용 프리미엄 챗 클래스.
 * 
 * [동작 요구사항]
 * - sendMessage() 오버라이딩 -> "프리미엄 챗으로 전송: [text]" 출력
 * - (가장 중요) 파일 전송 기능을 고도화하기 위해 부모의 디폴트 메서드인 sendFile()을 오버라이딩한다.
 *   -> "초고속 전용망을 통해 [fileName] 파일을 직접 전송합니다." 출력 (내부에서 sendMessage를 호출하지 않음)
 */
public class PremiumChat implements Messenger{
	@Override
	public void sendMessage(String text) {
		System.out.println("일반 SMS프리미엄 챗으로 전송: "+text);
	}
	
	@Override
	public void sendFile(String fileName) {
		System.out.println("초고속 전용망을 통해 "+fileName+" 파일을 직접 전송합니다.");
	}
}
