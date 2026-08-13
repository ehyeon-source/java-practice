package ch07.sec03.restaurant;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec03.restaurant
 * - KoreanRestaurant 객체를 하나 생성한다. (가게이름: "맛나국밥", 주소: "창원시")
 * - 객체가 생성된 후, 상속받아 세팅된 필드(이름과 주소)를 화면에 출력하여 확인한다.
 * 
 * [기대되는 정확한 출력 결과]
 * 1. 구청 위생과 식당 인허가 절차 완료 (부모 생성자)
 * 2. 한식당 인테리어 및 오픈 준비 완료 (자식 생성자)
 * 가게 이름: 맛나국밥
 * 가게 주소: 창원시
 */
public class OpenApp {
	public static void main(String[] args) {
		KoreanRestaurant kr = new KoreanRestaurant("맛나국밥", "창원시");
		System.out.println("kr 가게이름: "+kr.name);
		System.out.println("kr 가게주소: "+kr.address);
		
		
	}

}
