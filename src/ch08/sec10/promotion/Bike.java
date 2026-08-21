package ch08.sec10.promotion;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec10.promotion
 * - 두 클래스 모두 Vehicle 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - Car 클래스의 run() -> "자동차가 달립니다." 출력
 * - Bike 클래스의 run() -> "자전거가 달립니다." 출력
 */
public class Bike implements Vehicle{
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
	}
}
