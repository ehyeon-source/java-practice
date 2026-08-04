package ch06.sec11.exam02;

/*
 * [핵심 조건]
 * - GameConfig 클래스를 설계한다.
 * - 모든 필드는 불변의 '상수'로 선언해야 하며, 상수 명명 규칙(대문자 및 언더바)을 따른다.
 * 
 * [동작 요구사항]
 * - 상수 1 (최고 레벨): 정수형 상수 `MAX_LEVEL`을 선언하고 즉시 99로 초기화한다.
 * - 상수 2 (기본 체력): 정수형 상수 `BASE_HP`를 선언하고 즉시 50으로 초기화한다.
 * - 상수 3 (최대 체력): 정수형 상수 `MAX_HP`를 선언만 해둔다.
 * - 정적 초기화 구역: 별도의 정적 블록을 열어서 '상수 3(최대 체력)'의 값을 '상수 1'과 '상수 2'를 곱한 값으로 세팅한다.
 */

public class GameConfig {
	static final int MAX_LEVEL = 99;
	static final int BASE_HP = 50;
	static final int MAX_HP;
	
	static {
		MAX_HP = MAX_LEVEL * BASE_HP;
	}
}
