package ch06.sec06.exam01;

/*
 * [문제 상황 2: 신규 계정 생성 및 기본값 검증]
 * 
 * 1. 객체 생성:
 *    - GameAccount 설계도를 바탕으로 'new' 연산자를 사용하여 새로운 객체를 생성하고, 변수(newUser)에 담는다.
 * 
 * 2. 필드 기본값 확인 (출력):
 *    - 생성된 newUser 객체 안에 있는 세 개의 필드(accountId, isBanned, goldBalance)에 각각 접근하여 그 안에 무슨 값이 들어있는지 출력한다.
 *    - (출력 양식 예시)
 *      신규 유저 아이디: [값]
 *      계정 정지 여부: [값]
 *      보유 골드: [값]
 */

public class AccountTestPractice {

	public static void main(String[] args) {
		GameAccount newUser = new GameAccount();
		
		System.out.println("신규 유저 아이디: "+newUser.accountId);
		System.out.println("계정 정지 여부: "+newUser.isBanned);
		System.out.println("보유 골드: "+newUser.goldBalance);

	}

}
