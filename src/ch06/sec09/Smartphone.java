package ch06.sec09;

/*
 * [핵심 조건]
 * - Smartphone 클래스를 설계한다. 
 * - 객체마다 독립적으로 가지는 '인스턴스 멤버'의 특성과, 'this' 키워드를 활용해 자기 자신의 필드와 메서드를 호출하는 구조를 구현한다.
 * 
 * [동작 요구사항]
 * - 필드: 소유자 이름(문자열), 배터리 잔량(정수)
 * - 생성자: 소유자 이름 데이터 하나를 입력받아 초기화한다.
 * - 메서드 A (배터리 설정): 전달받은 정수 값을 배터리 잔량 필드에 저장한다.
 * - 메서드 B (앱 실행): 내부에서 '메서드 A'를 호출하여 배터리를 85로 세팅하고, 
 *   "[소유자]의 스마트폰이 앱을 실행합니다. (남은 배터리: [배터리잔량]%)" 형태의 문자열을 출력한다.
 */

public class Smartphone {
	String name;
	int battery;
	
	Smartphone(String name){
		this.name = name;
	}
	
	void setBattery(int battery) {
		this.battery = battery;
	}
	
	void playApp() {
		this.setBattery(85);
		System.out.println(name+"의 스마트폰이 앱을 실행합니다. (남은 배터리: "+battery+"%)");
	}
}
