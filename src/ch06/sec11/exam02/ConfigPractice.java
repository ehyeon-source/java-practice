package ch06.sec11.exam02;

/*
 * [가동 조건]
 * - 객체 생성을 절대 하지 않고, GameConfig 클래스의 상수들을 다이렉트로 호출하여 출력한다.
 * 
 * [기대되는 정확한 출력 결과]
 * 게임 최고 레벨: 99
 * 캐릭터 기본 체력: 50
 * 캐릭터 최대 체력: 4950
 */

public class ConfigPractice {

	public static void main(String[] args) {
		System.out.println("게임 최고 레벨: "+GameConfig.MAX_LEVEL);
		System.out.println("캐릭터 기본 체력: "+GameConfig.BASE_HP);
		System.out.println("캐릭터 최대 체력: "+GameConfig.MAX_HP);

	}

}
