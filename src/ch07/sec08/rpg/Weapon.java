package ch07.sec08.rpg;
/*
 * [핵심 조건]
 * - 모든 무기의 뼈대가 되는 부모 클래스.
 * 
 * [동작 요구사항]
 * - 메서드 1개: attack()
 *   - 기능: "기본 무기로 공격합니다." 출력
 */
public class Weapon {
	void attack() {
		System.out.println("기본 무기로 공격합니다.");
	}
}
