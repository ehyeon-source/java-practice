package ch07.sec06.company.branch;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec06.company.branch (주의: 본사와 패키지가 다름!)
 * - Headquarters와 아무런 혈연관계(상속)가 없는 일반 클래스.
 * 
 * [동작 요구사항]
 * - 메서드 1개: testAccess()를 선언한다.
 * - 이 메서드 안에서 Headquarters 객체를 new로 생성해 보고, 예산(budget) 필드와 승인(approveProject) 메서드에 접근을 시도해 본다.
 * - 컴파일러가 에러(빨간줄)를 뿜어내면 주석(//) 처리하고, "에러가 나는 이유"를 본인의 언어로 적어둔다.
 */
import ch07.sec06.company.hq.*;
public class Outsider {
	void testAccess() {
		Headquarters h = new Headquarters();
		
		//protected 는 상속 받은 클래스가 아니라면 다른 패키지에서 접근할 수 없다. 
		//h.budget = 10;
		//h.approveProject;
	}
}
