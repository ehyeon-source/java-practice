package ch06.sec14.game;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec14.game
 * - Player 객체를 생성한다.
 * - 데미지를 입거나 물약을 먹는 극단적인 상황을 가정하여 Setter를 호출하고, Getter로 방어된 결과를 출력한다.
 * 
 * [테스트 순서 및 기대되는 정확한 출력 결과]
 * 1. 체력 50 세팅 -> "현재 체력: 50" 출력
 * 2. 독에 걸려 체력 -30 세팅 시도 -> "현재 체력: 0" 출력
 * 3. 특급 물약으로 체력 999 세팅 시도 -> "현재 체력: 100" 출력
 */

public class GameApp {

	public static void main(String[] args) {
		Player pl = new Player();
		
		pl.setHp(50);
		System.out.println("현재 체력: "+pl.getHp());
		
		pl.setHp(-30);
		System.out.println("현재 체력: "+pl.getHp());
		
		pl.setHp(999);
		System.out.println("현재 체력: "+pl.getHp());
	}

}
