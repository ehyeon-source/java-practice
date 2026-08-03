package ch06.sec04;

/*
 * [문제 상황 2: 로봇 생산 및 메모리 독립성 검증]
 * 
 * 1. 첫 번째 로봇 생산:
 *    - 앞서 만든 AndroidRobot 설계도를 바탕으로 'new' 연산자를 사용하여 첫 번째 객체를 생성하고, 변수(robotA)에 그 주소를 저장한다.
 *    - "첫 번째 로봇이 조립되어 메모리에 등재되었습니다."를 출력한다.
 * 
 * 2. 두 번째 로봇 생산:
 *    - 동일한 설계도를 사용하여 '완전히 새로운' 두 번째 객체를 생성하고, 변수(robotB)에 그 주소를 저장한다.
 *    - "두 번째 로봇이 조립되어 메모리에 등재되었습니다."를 출력한다.
 *
 * 3. 객체의 독립성 검증 (출력):
 *    - 붕어빵 틀(설계도)이 같다고 해서 만들어진 붕어빵(객체)들이 하나로 합쳐지는 것은 아니다.
 *    - 변수 robotA와 robotB가 가리키는 메모리 주소가 '서로 다른 독립적인 주소'인지 비교 연산자를 통해 검증하고, 그 결과(boolean)를 출력한다.
 */

public class RobotFactoryPractice {

	public static void main(String[] args) {
		AndroidRobot robotA = new AndroidRobot();
		System.out.println("첫 번째 로봇이 조립되어 메모리에 등재되었습니다.");
		
		AndroidRobot robotB = new AndroidRobot();
		System.out.println("두 번째 로봇이 조립되어 메모리에 등재되었습니다.");
		
		System.out.println("두 로봇은 같은 주소인가: "+(robotA==robotB));

	}

}
