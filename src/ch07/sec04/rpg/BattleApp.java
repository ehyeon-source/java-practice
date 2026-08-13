package ch07.sec04.rpg;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec04.rpg
 * - 일반 Monster 객체 하나와 BossMonster 객체 하나를 각각 생성한다.
 * - 두 객체 모두 "용사"를 타겟으로 하여 공격(attack) 메서드를 호출한다.
 * 
 * [기대되는 정확한 출력 결과]
 * 용사에게 일반 공격을 시전합니다! (데미지: 10)
 * 용사에게 광역 불태우기 스킬을 시전합니다!! (데미지: 100)
 */
public class BattleApp {
	public static void main(String[] args) {
		Monster m = new Monster();
		BossMonster bm = new BossMonster();
		
		m.attack("용사");
		bm.attack("용사");
	}

}
