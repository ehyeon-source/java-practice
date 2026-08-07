package ch06.sec13.exam03.device;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec13.device
 * - SmartPhone 객체를 생성합니다.
 * - 설계도에 있는 3개의 필드와 3개의 메서드에 모두 접근(호출)을 시도합니다.
 * - 문법적으로 에러(차단)가 발생하는 코드는 주석 처리하고, 그 이유를 짧게 적어주세요.
 */

public class ServiceCenter {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		String s = phone.model;
		int b = phone.batteryTemp;
		//String n = phone.number;	//private 접근제한이 붙으면 선언된 클래스에서만 접근이가능
		
	}

}
