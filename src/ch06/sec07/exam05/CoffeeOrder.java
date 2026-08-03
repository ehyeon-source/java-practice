package ch06.sec07.exam05;

/*
 * [문제 상황 1: 커피 주문 설계도 및 this(...)를 활용한 생성자 위임]
 *
 * 1. 필드 선언:
 *    - 문자열(String) 타입의 음료명(beverage), 사이즈(size), 온도(temperature) 필드를 선언한다.
 * 
 * 2. 생성자 오버로딩 및 this(...) 적용:
 *    - 생성자 ③ (마스터 생성자): 음료명, 사이즈, 온도 3개를 모두 매개변수로 받아 `this.필드 = 매개변수` 형태로 초기화한다.
 *    - 생성자 ①: 음료명 하나만 매개변수로 받는다. 내부에서는 `this(...)`를 사용해 마스터 생성자를 호출하되, 사이즈는 "Regular", 온도는 "Hot"을 기본값으로 넘겨준다.
 *    - 생성자 ②: 음료명과 사이즈 두 개를 매개변수로 받는다. 내부에서는 `this(...)`를 사용해 마스터 생성자를 호출하되, 온도는 "Hot"을 기본값으로 넘겨준다.
 */

public class CoffeeOrder {
	String beverage;
	String size;
	String temperature;
	
	CoffeeOrder(String beverage, String size, String temperature){
		this.beverage = beverage;
		this.size = size;
		this.temperature =temperature;
	}
	
	CoffeeOrder(String beverage){
		this(beverage,"Regular","Hot");
	}
	
	CoffeeOrder(String beverage, String size){
		this(beverage, size, "Hot");
	}
}
