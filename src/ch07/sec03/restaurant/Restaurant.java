package ch07.sec03.restaurant;

/*
 * [핵심 조건]
 * - 패키지명: ch07.sec03.restaurant
 * - 모든 식당의 기본이 되는 부모 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 필드 2개 선언 (어디서든 접근 가능): 가게이름(name) - 문자열, 주소(address) - 문자열
 * - 생성자: 매개변수가 없는 '기본 생성자'를 만들고, 호출될 때 다음 문장을 출력하도록 한다.
 *   -> "1. 구청 위생과 식당 인허가 절차 완료 (부모 생성자)"
 */

public class Restaurant {
	public String name;
	public String address;
	
	Restaurant(){
		System.out.println("1. 구청 위생과 식당 인허가 절차 완료 (부모 생성자)");
	}
	
}
