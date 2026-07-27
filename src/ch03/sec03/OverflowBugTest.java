package ch03.sec03;

/*
 * [문제 상황: 레트로 아케이드 게임의 메모리 버그 테스트]
 * 
 * 1. 쉴드 오버플로우: 우주선의 쉴드 내구도를 나타내는 byte 타입 변수(shield)가 현재 시스템이 허용하는 최댓값인 127 상태이다. 플레이어가 쉴드 강화 아이템을 획득하여 증감 연산자(++)를 통해 내구도를 1 증가시킨 뒤, 그 결과를 콘솔에 출력한다.
 * 2. 미사일 언더플로우: 특수 미사일 개수를 나타내는 byte 타입 변수(missile)가 해킹 오류로 인해 현재 최솟값인 -128 상태이다. 플레이어가 미사일을 1번 발사하여 증감 연산자(--)를 통해 개수를 1 감소시킨 뒤, 그 결과를 콘솔에 출력한다.
 * 3. 결과 출력: 연산이 끝난 후 shield와 missile의 최종 값을 각각 콘솔에 출력한다. (이전처럼 주석으로 출력될 예상 값을 먼저 적어두고 실제 컴파일 결과와 비교해 볼 것!)
 */

public class OverflowBugTest {

	public static void main(String[] args) {
		byte shield = 127;
		++shield;
		System.out.println("shield: "+shield);	//내 예상 -128
		
		byte missile = -128;
		--missile;
		System.out.println("missile: "+missile);	//내 예상 127

	}

}
