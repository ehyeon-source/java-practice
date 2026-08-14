package ch07.sec11.agency;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec11.agency
 * - 기획사의 모든 아티스트를 대표하는 부모 클래스.
 * - (가장 중요) 무분별한 데뷔(상속)를 막기 위해, 이 클래스는 오직 'Solo' 클래스와 'Group' 클래스에게만 상속을 허락하도록 굳게 '봉인'하십시오.
 * 
 * [동작 요구사항]
 * - 메서드 1개: perform()
 *   - 기능: "아티스트가 공연합니다." 출력
 */
public sealed class Artist permits Solo, Group{
	void perform() {
		System.out.println("아티스트가 공연합니다.");
	}
}
