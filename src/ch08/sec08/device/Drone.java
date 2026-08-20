package ch08.sec08.device;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec08.device
 * - Flyable과 Camera 두 인터페이스를 '다중 구현'하는 드론 클래스.
 * 
 * [동작 요구사항]
 * - 두 인터페이스가 요구하는 총 3개의 추상 메서드를 모두 오버라이딩한다.
 * - takeOff() -> "드론이 이륙합니다." 출력
 * - land() -> "드론이 착륙합니다." 출력
 * - takePicture() -> "드론이 공중 촬영을 합니다." 출력
 */
public class Drone implements Flyable, Camera{
	@Override
	public void takeOff(){
		System.out.println("드론이 이륙합니다.");
	}
	
	@Override
	public void land() {
		System.out.println("드론이 착륙합니다.");
	}
	
	@Override
	public void takePicture() {
		System.out.println("드론이 공중 촬영을 합니다.");
	}
}
