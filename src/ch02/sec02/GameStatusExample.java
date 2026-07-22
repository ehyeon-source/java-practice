package ch02.sec02;

/*
 * [문제 상황: 레트로 게임 캐릭터 상태 및 서버 데이터 초기화]
 * 
 * 1. byte 범위 제한: 캐릭터의 현재 레벨은 byte 타입이 허용하는 최대치인 127이다. byte 타입 변수(level)를 선언하고 이 값으로 초기화한다.
 * 2. 진수 표현 활용: 캐릭터의 아이템 고유 코드(itemCode)는 16진수 1A로, 접속 권한 코드(accessCode)는 2진수 1101로 int 타입 변수에 각각 초기화한다.
 * 3. long 리터럴 활용: 게임 서버의 전체 누적 골드량(totalGold)은 50억(5000000000)이다. 에러가 나지 않도록 올바른 접미사를 사용하여 long 타입 변수에 초기화한다.
 * 4. 결과 출력: 캐릭터의 레벨, 아이템 고유 코드, 접속 권한 코드, 서버 전체 누적 골드량을 각각 콘솔에 출력한다.
 */

public class GameStatusExample {

	public static void main(String[] args) {
		byte level = 127;
		
		int itemCode = 0x1A;
		int accessCode = 0b1101;
		
		long totalGold = 5000000000L;
		
		System.out.println("캐릭터의 레벨: "+level);
		System.out.println("아이템 고유 코드: "+itemCode);
		System.out.println("접속 권한 코드: "+accessCode);
		System.out.println("서버 전체 누적 골드량: "+totalGold);

	}

}
