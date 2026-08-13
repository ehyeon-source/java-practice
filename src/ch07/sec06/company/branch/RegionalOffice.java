package ch07.sec06.company.branch;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec06.company.branch (주의: 본사와 패키지가 다름!)
 * - 하지만 Headquarters를 상속(extends)받는 공식 지사(자식) 클래스이다.
 * 
 * [동작 요구사항]
 * - 메서드 1개: requestSupport()를 선언한다.
 * - (가장 중요) 자바의 규칙상 다른 패키지에서는 new Headquarters()로 직접 객체를 만들어 접근할 수 없다. 
 * - 대신, 부모에게 물려받은 내 것(상속)처럼 접근해야 한다. 이 메서드 안에서 부모의 예산(budget) 필드에 1000을 세팅하고, 부모의 승인(approveProject) 메서드를 곧바로 호출해 본다. (에러가 나지 않아야 성공)
 */
import ch07.sec06.company.hq.*;
public class RegionalOffice extends Headquarters{
	void requestSupport() {
		this.budget = 1000;
		approveProject();
	}
}
