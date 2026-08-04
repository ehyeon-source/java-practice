package ch06.sec09;

/*
 * [가동 조건]
 * - Smartphone 객체 2개를 생성하고, 각각의 앱 실행 메서드를 호출하여 인스턴스 필드가 객체마다 따로 유지되는지 확인한다.
 * 
 * [입력 데이터]
 * - 첫 번째 폰 소유자: "앨리스"
 * - 두 번째 폰 소유자: "제임스"
 * 
 * [기대되는 정확한 출력 결과]
 * 앨리스의 스마트폰이 앱을 실행합니다. (남은 배터리: 85%)
 * 제임스의 스마트폰이 앱을 실행합니다. (남은 배터리: 85%)
 */

public class DeviceManagerPractice {

	public static void main(String[] args) {
		Smartphone phone1 = new Smartphone("앨리스");
		Smartphone phone2 = new Smartphone("제임스");

		phone1.playApp();
		phone2.playApp();
	}

}
