package ch07.sec03.restaurant;

/*
 * [핵심 조건]
 * - 패키지명: ch07.sec03.restaurant
 * - Restaurant 클래스의 자산을 물려받는 자식 클래스로 선언한다.
 * 
 * [동작 요구사항]
 * - 생성자: 가게이름(name)과 주소(address)를 매개변수로 받는다.
 * - 이 생성자 내부에서 물려받은 필드에 값을 세팅하고, 그다음 아래 문장을 출력하도록 한다.
 *   -> "2. 한식당 인테리어 및 오픈 준비 완료 (자식 생성자)"
 * - (주의) 자바의 '숨겨진 메커니즘'을 활용하여 부모의 인허가 절차가 무조건 먼저 출력되도록 설계한다.
 */

public class KoreanRestaurant extends Restaurant{
	KoreanRestaurant(String name, String address){
		super();
		this.name = name;
		this.address = address;
		System.out.println("2. 한식당 인테리어 및 오픈 준비 완료 (자식 생성자)");
	}
}
