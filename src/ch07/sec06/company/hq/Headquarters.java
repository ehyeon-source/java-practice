package ch07.sec06.company.hq;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec06.company.hq
 * - 본사 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 필드 1개: 회사 자금(budget)을 정수형으로 선언. (접근 제한: protected)
 * - 메서드 1개: approveProject() 
 *   - 기능: "본사에서 프로젝트 예산을 승인합니다." 출력. (접근 제한: protected)
 */
public class Headquarters {
	protected int budget;
	
	protected void approveProject() {
		System.out.println("본사에서 프로젝트 예산을 승인합니다.");
	}
}
