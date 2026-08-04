package ch06.sec10.exam01;

/*
 * [가동 조건]
 * - 객체 생성(`new`)을 절대 하지 않고, 클래스명을 통해 다이렉트로 정적 메서드에 접근하여 단위 변환 결과를 출력한다.
 * 
 * [입력 데이터]
 * - 10.0 인치를 센티미터로 변환
 * - 50.8 센티미터를 인치로 변환
 * 
 * [기대되는 정확한 출력 결과]
 * 10.0인치는 25.4cm 입니다.
 * 50.8cm는 20.0인치 입니다.
 */

public class ConverterPractice {

	public static void main(String[] args) {
		double cm = UnitConverter.inchByCm(10.0);
		double inch = UnitConverter.cmByInch(50.8);
		
		System.out.println("10.0인치는 "+cm+"cm 입니다.");
		System.out.println("50.8cm는 "+inch+"인치 입니다.");
	}

}
