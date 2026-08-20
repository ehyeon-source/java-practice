package ch08.sec03.elevator;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec03.elevator
 * 
 * [테스트 순서 및 요구사항]
 * 1. 현재 엘리베이터의 무게를 나타내는 정수형 변수(currentWeight)를 하나 선언하고 1050을 셋팅한다.
 * 2. 조건문(if)을 사용하여, 현재 무게가 인터페이스에 정의된 '최대 적재 하중'을 초과했는지 검사한다. 
 *    (주의: 객체를 생성하지 말고 인터페이스 이름을 통해 상수에 다이렉트로 접근할 것)
 * 3. 초과했다면 "경고: 최대 적재 하중(1000kg)을 초과했습니다!" 를 출력한다. (이때 1000이라는 숫자도 직접 치지 말고 인터페이스의 상수를 끌어와서 조립해 출력할 것)
 */
public class ElevatorApp {
	public static void main(String[] args) {
		int currentWeight = 1050;
		
		if(currentWeight > WeightLimit.MAX_KG) {
			System.out.println("경고: 최대 적재 하중("+WeightLimit.MAX_KG+"kg)을 초과했습니다!");
		}

	}

}
