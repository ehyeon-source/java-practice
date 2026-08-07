package ch06.sec13.exam03.device;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec13.device
 * - 스마트폰 설계도를 만듭니다. (클래스와 생성자는 어디서든 접근 가능하도록 개방)
 * 
 * [동작 요구사항]
 * - 필드 3개 선언:
 *   1. 모델명 (문자열, "Galaxy"): 전 세계 어디서든 볼 수 있게 개방.
 *   2. 배터리온도 (정수, 35): 같은 동네(device 패키지)의 수리 기사님들만 볼 수 있게 제한.
 *   3. 고유식별번호 (문자열, "SN-1234"): 오직 이 SmartPhone 클래스 내부에서만 접근 가능하도록 철저히 은닉.
 * 
 * - 메서드 3개 선언 (각 메서드는 자신의 이름을 출력하는 간단한 기능만 수행):
 *   1. 전화걸기(): 전 세계 누구나 사용할 수 있게 개방.
 *   2. 부품테스트(): 같은 동네(device 패키지)에서만 실행할 수 있게 제한.
 *   3. 공장초기화(): 오직 이 SmartPhone 클래스 내부에서만 실행할 수 있게 철저히 은닉.
 */

public class SmartPhone {
	public SmartPhone() {
		
	}
	
	public String model = "Galaxy";
	int batteryTemp = 35;
	private String number = "SN-1234";
	
	public void call() {
		System.out.println("전화걸기");
	}
	void test() {
		System.out.println("부품테스트");
	}
	private void reset() {
		System.out.println("공장초기화");
	}
}
