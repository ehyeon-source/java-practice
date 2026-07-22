package ch02.sec01;

/*
 * [문제 상황: 쇼핑몰 상품 가격 오류 수정 및 최종 결제 금액 계산]
 * 
 * 1. 변수 선언 및 초기화: 상품 A(itemA)의 가격을 5000으로, 상품 B(itemB)의 가격을 8000으로 초기화한다.
 * 2. 상태 출력: 교환 전의 상품 A와 B의 가격을 출력한다.
 * 3. 값 교환: 직원의 실수로 상품 A와 B의 가격 태그가 서로 잘못 붙어있다. 임시 변수를 사용해 두 변수의 값을 올바르게 교환한다.
 * 4. 상태 출력: 교환 후 정상적으로 바뀐 상품 A와 B의 가격을 출력한다.
 * 5. 연산 및 출력: 올바른 가격을 기준으로, 상품 A를 3개, 상품 B를 2개 장바구니에 담았을 때의 총 결제 금액을 계산하여 문자열과 함께 출력한다.
 */

public class ShoppingCartExample {
	public static void main(String[]args) {
		int itemA =5000;
		int itemB=8000;
		
		System.out.println("A 가격: "+itemA+", B 가격: "+itemB);
		
		int temp;
		temp=itemA;
		itemA=itemB;
		itemB=temp;
		
		System.out.println("A 가격: "+itemA+", B 가격: "+itemB);
		
		System.out.println("A 3개, B 2개 총 결제금액: "+((itemA*3)+(itemB*2)));
	}
}
