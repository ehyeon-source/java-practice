package ch07.sec08.rpg;
/*
 * [핵심 조건]
 * - 무기를 장착하고 사용하는 주체(자동차 역할) 클래스.
 * 
 * [동작 요구사항]
 * - 필드 1개: 플레이어가 장착할 무기를 저장할 변수(그릇)를 선언한다. (주의: 특정 무기가 아닌, 어떤 무기든 다 담을 수 있도록 '부모 타입'으로 선언할 것)
 * - 메서드 1개: useWeapon()
 *   - 기능: 현재 자신의 필드에 장착된 무기의 attack() 기능을 대신 실행해 준다.
 */
public class Player {
	Weapon w = new Weapon();
	
	void useWeapon() {
		w.attack();
	}
}
