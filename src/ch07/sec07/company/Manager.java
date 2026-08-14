package ch07.sec07.company;
/*
 * [핵심 조건]
 * - Employee의 자산을 물려받는 관리자 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 부모가 물려준 work() 메서드를 자신에게 맞게 개조(재정의)한다. (안전장치 필수)
 *   -> "관리자가 팀원들의 업무를 지시하고 검토합니다." 출력.
 * - 관리자만의 고유 메서드를 1개 추가한다: approveVacation()
 *   -> "팀원의 휴가 신청을 승인합니다." 출력.
 */
public class Manager extends Employee{
	@Override
	void work() {
		System.out.println("관리자가 팀원들의 업무를 지시하고 검토합니다.");
	}
	
	void approveVacation() {
		System.out.println("팀원의 휴가 신청을 승인합니다.");
	}
}
