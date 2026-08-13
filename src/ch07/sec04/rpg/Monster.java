package ch07.sec04.rpg;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec04.rpg
 * - 모든 몬스터의 기본이 되는 부모 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 메서드 1개 선언: attack(String target)
 *   - 기능: 콘솔에 "[target]에게 일반 공격을 시전합니다! (데미지: 10)"을 출력한다.
 */
public class Monster {
	void attack(String target) {
		System.out.println(target+"에게 일반 공격을 시전합니다! (데미지: 10)");
	}
}
