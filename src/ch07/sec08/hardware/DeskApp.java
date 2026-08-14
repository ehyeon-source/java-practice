package ch07.sec08.hardware;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec08.hardware
 * - Computer 객체 1개, Keyboard 객체 1개, Mouse 객체 1개를 각각 생성한다.
 * 
 * [테스트 순서 및 요구사항]
 * 1. 생성한 컴퓨터(Computer)의 plugIn() 메서드에 Keyboard 객체를 던져본다.
 * 2. 동일한 컴퓨터의 plugIn() 메서드에 Mouse 객체를 던져본다.
 * 3. 컴퓨터는 단 하나의 plugIn(UsbDevice) 메서드만 가지고 있지만, 들어오는 기기(키보드냐 마우스냐)에 따라 전혀 다른 연결 결과가 콘솔에 찍히는 것을 완벽하게 확인한다.
 */
public class DeskApp {
	public static void main(String[] args) {
		Computer c = new Computer();
		Keyboard k = new Keyboard();
		Mouse m = new Mouse();
		
		c.plugIn(k);
		
		c.plugIn(m);
		
	}

}
