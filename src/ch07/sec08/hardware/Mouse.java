package ch07.sec08.hardware;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec08.hardware
 * - 두 클래스 모두 UsbDevice를 상속받는 자식 클래스.
 * 
 * [동작 요구사항]
 * - Keyboard 클래스는 connect()를 재정의하여 "키보드가 연결되어 타이핑이 가능합니다." 출력 (안전장치 필수)
 * - Mouse 클래스는 connect()를 재정의하여 "마우스가 연결되어 포인터가 활성화됩니다." 출력 (안전장치 필수)
 */
public class Mouse extends UsbDevice{
	@Override
	void connect() {
		System.out.println("마우스가 연결되어 포인터가 활성화됩니다.");
	}
}
