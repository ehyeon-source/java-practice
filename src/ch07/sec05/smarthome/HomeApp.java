package ch07.sec05.smarthome;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec05.smarthome
 * - 스피커 객체를 하나 생성한다.
 * - 개조된 전원 켜기 기능을 호출하여 바뀐 문구를 확인한다.
 * - 초기화 기능을 호출하여, 부모가 굳게 잠가둔 원본 문구가 그대로 출력되는지 확인한다.
 */
public class HomeApp {
	public static void main(String[] args) {
		SmartSpeaker speaker = new SmartSpeaker();
		
		speaker.turnOn();
		
		speaker.resetSystem();
	}

}
