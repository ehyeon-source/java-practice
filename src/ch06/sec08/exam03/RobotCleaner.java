package ch06.sec08.exam03;

/*
 * [문제 상황 1: 로봇 청소기 상태 및 동작 설계]
 *
 * 1. 필드 선언:
 *    - 정수(int) 타입의 배터리 잔량 필드(battery)를 선언한다.
 * 
 * 2. 메서드 선언:
 *    - 메서드 ① (배터리 충전): 리턴값이 없는 `chargeBattery(int battery)` 메서드를 선언하고, 매개값을 필드(this.battery)에 저장한다.
 *    - 메서드 ② (상태 점검): 리턴값이 `boolean`인 `checkBattery()` 메서드를 선언한다. 
 *      배터리가 0이면 "배터리가 없습니다."를 출력하고 false를 리턴, 0이 아니면 "배터리가 충분합니다."를 출력하고 true를 리턴한다.
 *    - 메서드 ③ (청소 동작): 리턴값이 없는(void) `clean()` 메서드를 선언한다.
 *      내부에서 `while(true)` 무한 루프를 돌린다.
 *      만약 배터리가 0보다 크면 "청소 중입니다.(배터리 잔량: [잔량])"을 출력하고 배터리를 1 감소시킨다.
 *      그렇지 않으면(0 이하가 되면) "청소를 멈춥니다.(배터리 잔량: [잔량])"을 출력하고 `return;`을 사용하여 메서드를 완전히 종료시킨다.
 */

public class RobotCleaner {
	int battery;
	
	void chargeBattery(int battery) {
		this.battery = battery;
	}
	
	boolean checkBattery() {
		if(battery==0) {
			System.out.println("배터리가 없습니다.");
			return false;
		}else {
			System.out.println("배터리가 충분합니다.");
			return true;
		}
	}
	
	void clean() {
		while(true) {
			if(battery>0) {
				System.out.println("청소 중입니다.(배터리 잔량: "+battery+")");
				battery--;
			}else {
				System.out.println("청소를 멈춥니다.(배터리 잔량: "+battery+")");
				return;
			}
		}
	}
}
