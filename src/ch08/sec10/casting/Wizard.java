package ch08.sec10.casting;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec10.casting
 * - Role 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - attack() 오버라이딩 -> "마법사가 기본 지팡이 공격을 합니다." 출력
 * - 마법사만의 고유 메서드 1개 추가: castSpell() -> "마법사가 강력한 화염구 스킬을 시전합니다." 출력
 */
public class Wizard implements Role{
	@Override
	public void attack() {
		System.out.println("마법사가 기본 지팡이 공격을 합니다.");
	}
	
	void castSpell() {
		System.out.println("마법사가 강력한 화염구 스킬을 시전합니다.");
	}
}
