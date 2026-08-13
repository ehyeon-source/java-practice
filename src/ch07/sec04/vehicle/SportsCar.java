package ch07.sec04.vehicle;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec04.vehicle
 * - Car 클래스를 상속받는 스포츠카 클래스를 선언한다.
 * 
 * [동작 요구사항]
 * - 상수 2개 선언 (어디서든 클래스 이름으로 접근할 수 있게 개방 및 고정):
 *   1. NORMAL (값: 1)
 *   2. TURBO (값: 2)
 * - 필드 1개 선언: 현재 주행 모드를 저장할 정수형 변수(driveMode)를 선언하고 기본값으로 NORMAL을 세팅한다.
 * 
 * - 메서드 오버라이딩 (안전장치 부착 필수):
 *   - 부모의 run() 메서드를 재정의한다.
 *   - 만약 현재 driveMode가 TURBO라면 "터보 엔진 가동! 초고속으로 질주합니다!!" 를 출력한다.
 *   - 만약 TURBO가 아니라면(NORMAL 등), 새로 로직을 짜지 말고 자바의 '숨겨진 부모 호출' 기능을 사용하여 부모의 run() 로직을 그대로 재사용(실행)한다.
 */
public class SportsCar extends Car{
	public static final int NORMAL = 1; 
	public static final int TURBO = 2;
	int driveMode = NORMAL;
	
	@Override
	void run() {
		if(driveMode == TURBO) {
			System.out.println("터보 엔진 가동! 초고속으로 질주합니다!!");
		}else {
			super.run();
		}
	}
}
