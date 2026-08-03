package ch06.sec06.exam02;

/*
 * [문제 상황 1: 스마트 에어컨 설계도 제작 (초기값 세팅)]
 *
 * 1. 파일 생성: public class로 선언된 클래스를 생성한다. (main 메서드가 없는 순수 설계도 용도)
 * 2. 필드 선언 및 초기화: 
 *    - 문자열(String) 타입의 제조사 필드(company)를 선언하고 "삼성전자"로 초기값을 대입해 둔다.
 *    - 정수(int) 타입의 목표 온도 필드(targetTemp)를 선언하고 24로 초기값을 대입해 둔다.
 *    - 정수(int) 타입의 현재 실내 온도 필드(currentTemp)를 선언하되, 이 필드는 초기값을 대입하지 않고 선언만 해둔다.
 */

public class SmartAirCon {
	String company = "삼성전자";
	int targetTemp = 24;
	int currentTemp;
}
