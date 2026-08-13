package ch07.sec05.smarthome;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec05.smarthome
 * - Device의 자산을 물려받는 자식 클래스로 선언한다.
 * 
 * [동작 요구사항]
 * - 물려받은 turnOn() 메서드의 내용을 개조(재정의)한다. (안전장치 부착)
 *   -> "스피커 전원이 켜집니다. 블루투스 페어링 모드를 시작합니다." 로 변경.
 * 
 * - 물려받은 resetSystem() 메서드도 개조를 시도해 본다.
 * - 컴파일러가 빨간줄을 그으며 차단하는 것을 눈으로 확인한 뒤, 해당 부분을 주석(//) 처리한다.
 * - 주석 옆에 "이 메서드를 뜯어고칠 수 없는 이유"를 본인의 언어로 작성한다.
 */
public class SmartSpeaker extends Device{
	@Override
	void turnOn() {
		System.out.println("스피커 전원이 켜집니다. 블루투스 페어링 모드를 시작합니다.");
	}
	
	//@Override		//final 메소드는 자식클래스에서 메소드 오버라이딩 즉 재정의를 못하게한다.
	//void resetSystem() {	
	//	System.out.println("시스템을 강력 초기화합니다. (경고: 복구 불가)");
	//}
}
