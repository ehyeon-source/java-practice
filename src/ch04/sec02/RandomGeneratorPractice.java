package ch04.sec02;

/*
 * [문제 상황: RPG 게임 야생 몬스터 랜덤 조우 시스템]
 * 
 * 1. 몬스터 레벨 생성: 10부터 20 사이의 정수 중 하나를 무작위로 뽑아 int 변수(monsterLevel)에 저장한다. (10과 20 모두 포함)
 * 2. 드랍 골드 생성: 500부터 1000 사이의 정수 중 하나를 무작위로 뽑아 int 변수(dropGold)에 저장한다. (500과 1000 모두 포함)
 * 3. 몬스터 속성 번호 생성: 1부터 4 사이의 정수 중 하나를 무작위로 뽑아 int 변수(elementCode)에 저장한다. (1과 4 모두 포함)
 * 4. 결과 출력: 생성된 monsterLevel, dropGold, elementCode 값을 각각 콘솔에 출력한다. (실행할 때마다 값이 다르게 나오는지 테스트해 볼 것)
 */

public class RandomGeneratorPractice {

	public static void main(String[] args) {
		int monsterLevel = (int)(Math.random()*11)+10;
		
		int dropGold = (int)(Math.random()*501)+500;
		
		int elementCode = (int)(Math.random()*4)+1;
		
		System.out.println("monsterLevel: "+monsterLevel);
		System.out.println("dropGold: "+dropGold);
		System.out.println("elementCode: "+elementCode);

	}

}
