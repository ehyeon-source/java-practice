package ch06.sec10.exam01;

/*
 * [핵심 조건]
 * - UnitConverter 클래스를 설계한다.
 * - 내부의 모든 필드와 메서드는 객체 생성 없이 직접 접근할 수 있도록 '정적(static)'으로 선언한다.
 * 
 * [동작 요구사항]
 * - 필드: 1인치(inch)를 센티미터(cm)로 환산한 값인 2.54를 저장하는 실수형 필드를 선언한다.
 * - 메서드 A (인치를 센티미터로): 실수형 인치 값을 하나 입력받아, 정적 필드 값을 곱한 센티미터 결과를 반환한다.
 * - 메서드 B (센티미터를 인치로): 실수형 센티미터 값을 하나 입력받아, 정적 필드 값으로 나눈 인치 결과를 반환한다.
 */

public class UnitConverter {
	static double inch_Cm = 2.54;
	
	static double inchByCm(double inch) {
		return inch * inch_Cm;
	}
	
	static double cmByInch(double cm) {
		return cm / inch_Cm;
	}
}
