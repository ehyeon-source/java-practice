package ch06.sec08.exam04;

/*
 * [핵심 조건]
 * - 전력 소비량을 계산하는 메서드를 구현하되, 메서드 이름은 반드시 `calcPower` 단 하나만 사용한다.
 * 
 * [동작 요구사항]
 * - 상황 A: '사용 시간(실수)' 데이터 하나만 들어오면, 기본 전력인 15W(실수형으로 취급)를 곱하여 총 소비 전력을 반환한다.
 * - 상황 B: '사용 시간(실수)'과 '제품 전력(실수)' 데이터 두 개가 들어오면, 두 값을 곱하여 총 소비 전력을 반환한다.
 * - 상황 C: '사용 시간(실수)', '제품 전력(실수)', '제품 개수(정수)' 데이터 세 개가 들어오면, 세 값을 모두 곱하여 총 소비 전력을 반환한다.
 */

public class PowerManager {
	
	double calcPower(double time) {
		return time * 15.0;
	}
	
	double calcPower(double time, double w) {
		return time * w;
	}
	
	double calcPower(double time, double w, int product) {
		return time * w * product;
	}
}
