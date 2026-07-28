package ch03.sec04;

/*
 * [문제 상황: RPG 게임 보스 몬스터 독 데미지 정산]
 * 
 * 1. 오차가 발생하는 엉터리 계산: 보스 몬스터의 초기 체력은 500(bossHp)이다. 플레이어가 건 독 스킬은 1틱당 0.3(poisonDamage)의 데미지를 입힌다. 독 데미지가 총 411번(tickCount) 들어갔을 때, 남은 체력을 실수 연산으로 직접 계산하여 double 타입 변수(wrongHp)에 담고 콘솔에 출력해 본다. (미세한 쓰레기값이 붙는 것을 확인한다.)
 * 2. 정수 스케일링(보정) 변환: 위와 동일한 조건에서, 소수점 오차가 절대 발생하지 않도록 초기 체력과 틱당 데미지를 모두 '정수' 단위로 변환(스케일업)하여 계산을 수행한다. 과정에 필요한 변수들은 직접 판단하여 알맞은 정수 타입으로 선언하고 연산한다.
 * 3. 정확한 결과 출력: 정수 연산으로 도출된 최종 남은 체력을 바탕으로, 맨 마지막 단계에서만 다시 원래의 실수 값으로 복원하여 콘솔에 "정확한 남은 체력: [값]" 형태로 출력한다.
 */

public class DamageAccuracyPractice {

	public static void main(String[] args) {
		int bossHp = 500;
		double poison = 0.3;
		int tickCount = 411;
		double wrongHp = bossHp - poison * tickCount;
		System.out.println("wrongHp: "+wrongHp);
		
		int upBossHp = bossHp * 10;
		int upPoison = (int)(poison * 10);
		int upTickCount = tickCount;
		int okHp = upBossHp - upPoison * upTickCount;
		
		System.out.println("정확한 남은 체력: "+(okHp/10.0));

	}

}
