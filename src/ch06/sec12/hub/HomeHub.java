package ch06.sec12.hub;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec12.hub
 * - 이 실행 클래스 안에서 삼성 패키지의 SmartPlug 객체 1개와, LG 패키지의 SmartPlug 객체 1개를 각각 생성한다.
 * - 두 설계도의 클래스 이름이 `SmartPlug`로 완전히 동일하므로, import 문만으로는 에러(충돌)가 발생한다.
 * - 에러가 나지 않도록 자바의 패키지 규칙(전체 경로 명시)을 활용하여 두 객체를 안전하게 생성해 낸다.
 * - (별도의 출력문 없이, 정상적으로 두 객체를 담는 변수가 선언 및 초기화되기만 하면 됨)
 */

public class HomeHub {

	public static void main(String[] args) {
		ch06.sec12.samsung.SmartPlug samsung = new ch06.sec12.samsung.SmartPlug();
		ch06.sec12.lg.SmartPlug lg = new ch06.sec12.lg.SmartPlug();

	}

}
