package ch07.sec04.vehicle;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec04.vehicle
 * - SportsCar 객체를 하나 생성한다.
 * 
 * [테스트 순서 및 기대되는 정확한 출력 결과]
 * 1. 생성 직후 run() 호출 -> "일반 주행을 시작합니다."
 * 2. 주행 모드를 TURBO 상태로 변경한 뒤 run() 호출 -> "터보 엔진 가동! 초고속으로 질주합니다!!"
 * 3. 주행 모드를 다시 NORMAL 상태로 복구한 뒤 run() 호출 -> "일반 주행을 시작합니다."
 */
public class DriveApp {
	public static void main(String[] args) {
		SportsCar sp = new SportsCar();
		
		sp.run();
		
		sp.driveMode = SportsCar.TURBO;
		sp.run();
		
		sp.driveMode = SportsCar.NORMAL;
		sp.run();
	}

}
