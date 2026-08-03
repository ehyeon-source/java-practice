package ch05.sec12;

/*
 * [문제 상황 1: 회원 등급 열거 타입 설계]
 *
 * 1. 파일 생성: 클래스가 아닌 Enum(열거 타입)으로 생성한다.
 * 2. 상수 정의: 
 *    - 회원의 등급을 나타내는 세 개의 열거 상수를 순서대로 선언한다.
 *    - 사용될 상수명: VVIP, VIP, NORMAL
 */

public enum Grade {
	VVIP,
	VIP,
	NORMAL
}
