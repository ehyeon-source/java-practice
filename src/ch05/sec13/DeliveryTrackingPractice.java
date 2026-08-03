package ch05.sec13;

/*
 * [문제 상황 2: 다중 배송 건 상태 확인 시스템]
 * 
 * 1. 열거 타입 배열 생성 및 초기화:
 *    - OrderStatus 열거 타입을 담을 수 있는 크기 3의 배열(deliveryList)을 생성한다.
 *    - 첫 번째 칸(인덱스 0)에 DELIVERED 상태를 대입한다.
 *    - 두 번째 칸(인덱스 1)에 SHIPPED 상태를 대입한다.
 *    - 세 번째 칸(인덱스 2)에 ORDERED 상태를 대입한다.
 * 
 * 2. 배송 상태 일괄 처리 (향상된 for문과 switch문 융합):
 *    - 향상된 for문을 사용하여 deliveryList 배열 안의 배송 상태를 하나씩 순회한다. (일반 for문 사용 금지)
 *    - switch문을 사용하여 뽑아온 열거 상태값에 따라 아래와 같이 출력한다.
 *      - 상태가 ORDERED일 경우: "주문이 접수되어 상품을 준비 중입니다." 출력
 *      - 상태가 SHIPPED일 경우: "상품이 택배사로 전달되어 이동 중입니다." 출력
 *      - 상태가 DELIVERED일 경우: "고객님께 배송이 완료되었습니다." 출력
 */

public class DeliveryTrackingPractice {

	public static void main(String[] args) {
		OrderStatus[] deliveryList = new OrderStatus[3];
		deliveryList[0] = OrderStatus.DELIVERED;
		deliveryList[1] = OrderStatus.SHIPPED;
		deliveryList[2] = OrderStatus.ORDERED;
		
		for(OrderStatus i:deliveryList) {
			switch(i) {
			//i 가 OrderStatus 라는 것을 컴파일러가 알고있기에 
			//OrderStatus. 이라는 소속안적고 ORDERED 라 적는게 구버젼에서는 옳다고하네
			case OrderStatus.ORDERED:	
				System.out.println("주문이 접수되어 상품을 준비 중입니다.");
				break;
			case OrderStatus.SHIPPED:
				System.out.println("상품이 택배사로 전달되어 이동 중입니다.");
				break;
			case OrderStatus.DELIVERED:
				System.out.println("고객님께 배송이 완료되었습니다.");
				break;
			}
			
		}
	}

}
