package ch07.sec11.agency;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec11.agency
 * - Group 클래스를 상속받는 유닛 그룹 클래스. (Group이 개방 상태이므로 일반적인 상속 방법 사용 가능)
 * 
 * [동작 요구사항]
 * - perform() 재정의 -> "유닛 그룹이 특별 무대를 선보입니다." 출력
 */
public class SubUnit extends Group{
	@Override
	void perform() {
		System.out.println("유닛 그룹이 특별 무대를 선보입니다.");
	}
}
