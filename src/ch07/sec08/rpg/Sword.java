package ch07.sec08.rpg;
/*
 * [핵심 조건]
 * - 두 클래스 모두 Weapon의 자산을 물려받는 자식 클래스.
 * 
 * [동작 요구사항]
 * - Sword 클래스는 부모의 attack()을 재정의하여 "검을 휘둘러 몬스터를 벱니다!" 출력 (안전장치 필수)
 * - Bow 클래스는 부모의 attack()을 재정의하여 "활을 쏘아 몬스터를 맞춥니다!" 출력 (안전장치 필수)
 */
public class Sword extends Weapon {
	@Override 
	void attack() {
		System.out.println("검을 휘둘러 몬스터를 벱니다!");
	}
}
