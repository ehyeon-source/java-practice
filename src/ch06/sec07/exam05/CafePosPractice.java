package ch06.sec07.exam05;

/*
 * [문제 상황 2: 다양한 옵션의 커피 주문 접수]
 * 
 * 1. 객체 생성 (this(...) 연쇄 호출 확인):
 *    - order1: "아메리카노" (1번 생성자 호출 - 사이즈와 온도는 알아서 기본값 세팅됨)
 *    - order2: "카페라떼", "Grande" (2번 생성자 호출 - 온도는 알아서 기본값 세팅됨)
 *    - order3: "콜드브루", "Venti", "Iced" (3번 마스터 생성자 직접 호출)
 * 
 * 2. 주문 내역 출력:
 *    - 각 order1, order2, order3 객체에 접근하여 음료명, 사이즈, 온도 값이 정확하게 세팅되었는지 출력하여 확인한다.
 */

public class CafePosPractice {

	public static void main(String[] args) {
		CoffeeOrder order1 = new CoffeeOrder("아메리카노");
		CoffeeOrder order2 = new CoffeeOrder("카페라떼","Grande");
		CoffeeOrder order3 = new CoffeeOrder("콜드블루","Venti","Iced");
		
		System.out.println("order1 "+order1.beverage+" "+order1.size+" "+order1.temperature);
		System.out.println("order2 "+order2.beverage+" "+order2.size+" "+order2.temperature);
		System.out.println("order3 "+order3.beverage+" "+order3.size+" "+order3.temperature);
	}

}
