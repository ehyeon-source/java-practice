package ch08.sec04.iot;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec04.iot
 * - SmartDevice 인터페이스의 규칙을 따르는 히터 클래스.
 * 
 * [동작 요구사항]
 * - 내부 상태를 저장할 private int temperature; 필드를 선언한다.
 * - 인터페이스의 3가지 추상 메서드를 모두 오버라이딩한다.
 *   1. turnOn(): "스마트 히터를 가동합니다." 출력
 *   2. turnOff(): "스마트 히터를 종료합니다." 출력
 *   3. setTemperature(int temp): 
 *      - 매개변수로 들어온 온도가 MAX_TEMP보다 높으면 온도를 MAX_TEMP로 고정한다.
 *      - MIN_TEMP보다 낮으면 온도를 MIN_TEMP로 고정한다.
 *      - 정상 범위면 그대로 세팅한다.
 *      - 세팅이 끝난 후 "현재 히터 온도: XX도"를 출력한다.
 */
public class SmartHeater implements SmartDevice{
	private int temperature;
	
	@Override
	public void turnOn() {
		System.out.println("스마트 히터를 가동합니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트 히터를 종료합니다.");
	}
	
	@Override
	public void setTemperature(int temp) {
		if(temp > SmartDevice.MAX_TEMP) {
			temperature = SmartDevice.MAX_TEMP;
		}else if(temp < SmartDevice.MIN_TEMP) {
			temperature = SmartDevice.MIN_TEMP;
		}else {
			temperature = temp;
		}
		
		System.out.println("현재 히터 온도: "+temperature+"도");
	}
}
