package ch08.sec04.iot;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec04.iot
 * - 스마트 기기가 지켜야 할 표준 규칙과 안전 기준 온도를 제공한다.
 * 
 * [동작 요구사항]
 * - 상수 2개: 최고 허용 온도(MAX_TEMP)를 30으로, 최저 허용 온도(MIN_TEMP)를 10으로 선언한다.
 * - 추상 메서드 3개: turnOn(), turnOff(), setTemperature(int temp) 를 선언한다.
 */
public interface SmartDevice {
	int MAX_TEMP = 30;
	int MIN_TEMP = 10;
	
	void turnOn();
	void turnOff();
	void setTemperature(int temp);
}
