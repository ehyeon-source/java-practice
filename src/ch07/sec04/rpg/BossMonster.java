package ch07.sec04.rpg;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec04.rpg
 * - Monster 클래스를 상속받는 보스 몬스터 클래스로 선언한다.
 * 
 * [동작 요구사항]
 * - 부모가 물려준 일반 공격(attack)이 보스에게는 너무 약하므로, 이 메서드를 '재정의'하여 강력하게 바꾼다.
 * - (필수) 컴파일러가 오버라이딩 규칙을 제대로 지켰는지 검사하도록 안전장치(어노테이션)를 반드시 부착한다.
 * - 재정의된 기능: 콘솔에 "[target]에게 광역 불태우기 스킬을 시전합니다!! (데미지: 100)"을 출력한다.
 */
public class BossMonster extends Monster{
	@Override
	void attack(String target) {
		System.out.println(target+"에게 광역 불태우기 스킬을 시전합니다!! (데미지: 100)");
	}
}
