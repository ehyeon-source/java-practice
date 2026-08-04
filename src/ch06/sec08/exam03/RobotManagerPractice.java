package ch06.sec08.exam03;

/*
 * [문제 상황 2: 로봇 청소기 가동 및 흐름 제어]
 * 
 * 1. 객체 생성 및 초기화:
 *    - RobotCleaner 객체를 생성하고 변수(myRobot)에 담는다.
 *    - `chargeBattery()` 메서드를 호출하여 배터리를 4로 세팅한다.
 * 
 * 2. 상태 점검 및 실행:
 *    - `if`문과 `checkBattery()` 메서드를 활용하여, 배터리가 충분한 상태(true)일 경우에만 if문 블록 내부가 실행되도록 작성한다.
 *    - if문 블록 내부에서 "청소를 시작합니다."를 출력한 뒤, `clean()` 메서드를 호출한다.
 * 
 * 3. 종료 메시지:
 *    - if문 블록 바깥(아래)에 "충전기에 연결하세요."를 출력한다.
 */

public class RobotManagerPractice {

	public static void main(String[] args) {
		RobotCleaner myRobot = new RobotCleaner();
		myRobot.chargeBattery(4);
		
		if(myRobot.checkBattery()) {
			System.out.println("청소를 시작합니다.");
			myRobot.clean();
		}
		
		System.out.println("충전기에 연결하세요.");
		

	}

}
