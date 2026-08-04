package ch06.sec10.exam02;

/*
 * [가동 조건]
 * - 객체 생성을 절대 하지 않고, GameServer 클래스의 '전체서버정보' 필드를 직접 호출하여 출력한다.
 * 
 * [기대되는 정확한 출력 결과]
 * Asia-1-v2.0
 */

public class ServerManagerPractice {

	public static void main(String[] args) {
		System.out.println(GameServer.totalSever);

	}

}
