package ch08.sec08.device;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec08.device
 * - 비행 기능에 대한 표준 규격을 제공한다.
 * 
 * [동작 요구사항]
 * - 리턴과 매개변수가 없는 추상 메서드 2개: takeOff(), land() 선언.
 */
public interface Flyable {
	void takeOff();
	void land();
}
