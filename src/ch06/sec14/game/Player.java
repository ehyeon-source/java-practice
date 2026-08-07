package ch06.sec14.game;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec14.game
 * - Player 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 필드: 체력(hp)을 정수형으로 선언하되, 외부에서 절대 직접 건드릴 수 없도록 철저히 은닉한다.
 * - Getter: 현재 체력 값을 읽어갈 수 있는 전용 메서드를 완전히 개방한다.
 * - Setter: 체력 값을 수정할 수 있는 전용 메서드를 개방하되, 다음의 '문지기' 로직을 반드시 포함한다.
 *   1. 들어오는 체력 값이 0 미만이면 체력을 0으로 고정한다 (사망 상태 방어).
 *   2. 들어오는 체력 값이 100을 초과하면 체력을 100으로 고정한다 (최대 체력 제한).
 *   3. 0 ~ 100 사이의 정상적인 값이면 그대로 체력에 반영한다.
 */

public class Player {
	private int hp;
	
	public int getHp(){
		return hp;
	}
	public void setHp(int hp) {
		if(hp<0) {
			this.hp = 0;
		}else if(100<hp) {
			this.hp = 100;
		}else {
			this.hp = hp;
		}
 	}
}
