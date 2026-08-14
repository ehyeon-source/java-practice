package ch07.sec11.agency;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec11.agency
 * - Artist의 자산을 물려받는 솔로 가수 클래스.
 * - (가장 중요) 솔로 가수는 밑으로 유닛이나 멤버를 둘 수 없으므로, 더 이상 누구도 이 클래스를 상속할 수 없도록 완벽하게 '단절(최종)'시키십시오.
 * 
 * [동작 요구사항]
 * - 부모의 perform() 재정의 -> "솔로 가수가 단독 무대를 펼칩니다." 출력
 */
public final class Solo extends Artist{
	@Override
	void perform() {
		System.out.println("솔로 가수가 단독 무대를 펼칩니다.");
	}
}
