package ch08.sec08.device;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec08.device
 * 
 * [테스트 순서 및 요구사항]
 * 1. Flyable 타입의 참조 변수를 선언하고 Drone 객체를 연결한다.
 * 2. 이 변수를 통해 이륙과 착륙 메서드를 호출한다. (이때 촬영 메서드를 호출하면 어떻게 될지 주석으로 짤막하게 남겨본다.)
 * 3. Camera 타입의 참조 변수를 선언하고 새로운 Drone 객체를 연결한다.
 * 4. 이 변수를 통해 촬영 메서드를 호출하여 정상 작동을 확인한다.
 */
public class DroneApp {
	public static void main(String[] args) {
		Flyable fly = new Drone();
		fly.takeOff();
		fly.land();
		//촬영 메서드를 호출해봤자 에러가 일어난다. 참조변수타입이 Camera 가 아니라서
		
		Camera camera = new Drone();
		camera.takePicture();
	}

}
