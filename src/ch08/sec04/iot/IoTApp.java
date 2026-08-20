package ch08.sec04.iot;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec04.iot
 * 
 * [테스트 순서 및 요구사항]
 * 1. SmartDevice 타입의 참조 변수를 선언하고 SmartHeater 객체를 연결한다.
 * 2. turnOn()을 호출한다.
 * 3. setTemperature(40)을 호출하여 상한선 방어 로직이 작동하는지 확인한다.
 * 4. setTemperature(5)를 호출하여 하한선 방어 로직이 작동하는지 확인한다.
 * 5. setTemperature(24)를 호출하여 정상 세팅을 확인한다.
 * 6. turnOff()를 호출한다.
 */
public class IoTApp {
	public static void main(String[] args) {
		SmartDevice dev = new SmartHeater();
		
		dev.turnOn();
		
		dev.setTemperature(40);
		
		dev.setTemperature(5);
		
		dev.setTemperature(24);
		
		dev.turnOff();
	}

}
