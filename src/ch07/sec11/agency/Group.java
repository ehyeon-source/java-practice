package ch07.sec11.agency;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec11.agency
 * - Artist의 자산을 물려받는 그룹 가수 클래스.
 * - (가장 중요) 그룹은 나중에 서브 유닛(SubUnit)으로 파생될 수 있어야 하므로, 부모가 걸어둔 봉인을 완전히 '해제'하여 누구나 다시 상속받을 수 있는 상태로 개방하십시오.
 * 
 * [동작 요구사항]
 * - 부모의 perform() 재정의 -> "그룹이 다 함께 군무를 춥니다." 출력
 */
public non-sealed class Group extends Artist{
	@Override
	void perform() {
		System.out.println("그룹이 다 함께 군무를 춥니다.");
	}
}
