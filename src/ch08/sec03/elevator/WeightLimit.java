package ch08.sec03.elevator;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec03.elevator
 * - 엘리베이터가 절대 넘어서는 안 될 기준치를 제공하는 인터페이스.
 * 
 * [동작 요구사항]
 * - 상수 1: 최대 탑승 인원(MAX_PERSON)을 15로 선언한다.
 * - 상수 2: 최대 적재 하중(MAX_KG)을 1000으로 선언한다.
 * - (주의: 쓸데없이 긴 수식어를 붙이지 말고, 이번에 배우신 대로 생략 가능한 키워드는 전부 생략하여 가장 짧게 선언해 보십시오.)
 */
public interface WeightLimit {
	int MAX_PERSON = 15;
	int MAX_KG = 1000;
}
