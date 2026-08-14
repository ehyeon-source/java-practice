package ch07.sec08.hardware;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec08.hardware
 * - 모든 USB 기기의 뼈대가 되는 부모 클래스.
 * 
 * [동작 요구사항]
 * - 메서드 1개: connect()
 *   - 기능: "USB 기기를 연결합니다." 출력
 */
public class UsbDevice {
	void connect() {
		System.out.println("USB 기기를 연결합니다.");
	}
}
