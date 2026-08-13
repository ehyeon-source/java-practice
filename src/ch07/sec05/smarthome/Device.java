package ch07.sec05.smarthome;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec05.smarthome
 * - 모든 스마트 기기의 뼈대가 되는 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 메서드 1: turnOn() 
 *   - "기기의 전원을 켭니다." 출력. (자식들이 각자 입맛에 맞게 개조할 수 있도록 열어둠)
 * - 메서드 2: resetSystem() 
 *   - "시스템을 강력 초기화합니다. (경고: 복구 불가)" 출력. 
 *   - (가장 중요) 이 기능은 보안상 매우 민감하므로, 자식 클래스에서 절대 로직을 뜯어고칠 수 없도록 완전히 자물쇠를 채워서 선언한다.
 */
public class Device {
	void turnOn() {
		System.out.println("기기의 전원을 켭니다.");
	}
	
	final void resetSystem() {
		System.out.println("시스템을 강력 초기화합니다. (경고: 복구 불가)");
	}
}
