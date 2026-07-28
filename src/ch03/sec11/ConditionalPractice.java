package ch03.sec11;

/*
 * [문제 상황: 쇼핑몰 장바구니 배송비 자동 계산 시스템]
 * 
 * 1. 초기 데이터: 사용자의 총 주문 금액을 나타내는 int 변수(orderAmount)에 35000을 할당한다.
 * 2. 배송비 판별 (if문 사용 절대 금지): 다음 조건에 따라 배송비를 결정하여 int 변수(shippingFee)에 저장한다. 
 *    - 주문 금액이 50000 '초과'인 경우: 배송비는 0
 *    - 주문 금액이 30000 '초과'이면서 50000 '이하'인 경우: 배송비는 1500
 *    - 주문 금액이 30000 '이하'인 경우: 배송비는 3000
 * 3. 결과 출력: 최종 결정된 shippingFee 값을 콘솔에 출력한다.
 */

public class ConditionalPractice {

	public static void main(String[] args) {
		int orderAmount = 35000;
		
		int shippingFee = (50000<orderAmount? 0: 30000<orderAmount? 1500: 3000);
		
		System.out.println("shippingFee: "+shippingFee);

	}

}
