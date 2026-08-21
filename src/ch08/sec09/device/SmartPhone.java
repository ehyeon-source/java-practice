package ch08.sec09.device;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec09.device
 * - Callable과 Playable 인터페이스를 '다중 상속(extends)' 받아 기능을 확장한 자식 인터페이스.
 * 
 * [동작 요구사항]
 * - 스마트폰만의 고유 기능인 runApp() 추상 메서드를 하나 추가로 선언한다.
 */
public interface SmartPhone extends Callable, Playable{
	void runApp();
}
