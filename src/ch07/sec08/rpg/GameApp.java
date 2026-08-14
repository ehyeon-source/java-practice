package ch07.sec08.rpg;
/*
 * [가동 조건]
 * - Player 객체를 하나 생성한다.
 * 
 * [테스트 순서 및 요구사항]
 * 1. 플레이어의 무기 장착 슬롯(필드)에 기본 Weapon 객체를 끼워 넣고, useWeapon()을 호출해 본다.
 * 2. 플레이어의 무기 장착 슬롯을 Sword 객체로 교체하여 끼워 넣고, useWeapon()을 호출해 본다.
 * 3. 플레이어의 무기 장착 슬롯을 Bow 객체로 다시 교체하여 끼워 넣고, useWeapon()을 호출해 본다.
 * 4. 플레이어는 단 하나의 무기 사용 메서드만 썼지만, 장착된 부품에 따라 공격 방식이 자유자재로 바뀌는 것을 콘솔로 확인한다.
 */
public class GameApp {
	public static void main(String[] args) {
		Player p = new Player();
		
		p.w = new Weapon();
		p.useWeapon();
		
		p.w = new Sword();
		p.useWeapon();
		
		p.w = new Bow();
		p.useWeapon();

	}

}
