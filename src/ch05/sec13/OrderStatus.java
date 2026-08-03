package ch05.sec13;

/*
 * [문제 상황 1: 배송 상태 열거 타입 설계]
 *
 * 1. 파일 생성: 클래스가 아닌 Enum(열거 타입)으로 생성한다.
 * 2. 상수 정의: 
 *    - 쇼핑몰의 배송 상태를 나타내는 세 개의 열거 상수를 선언한다.
 *    - 사용될 상수명: ORDERED (주문접수), SHIPPED (배송중), DELIVERED (배송완료)
 */

public enum OrderStatus {
	ORDERED,
	SHIPPED,
	DELIVERED
}
