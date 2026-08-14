package ch07.sec08.hardware;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec08.hardware
 * - USB 기기를 꽂아서 사용하는 컴퓨터 본체 클래스. (UsbDevice와 상속 관계 아님)
 * 
 * [동작 요구사항]
 * - 메서드 1개: plugIn(...)
 * - (가장 중요) 이 컴퓨터는 키보드 전용 포트나 마우스 전용 포트를 따로 두지 않습니다. 
 * - 단 하나의 plugIn 메서드가 '부모 그릇(UsbDevice 타입)' 하나만 매개변수로 받도록 설계하십시오.
 * - 메서드 내부에서는 넘겨받은 부모 그릇 매개변수를 이용해 connect()를 호출합니다.
 */
public class Computer {
	void plugIn(UsbDevice usb) {
		usb.connect();
	}
}
