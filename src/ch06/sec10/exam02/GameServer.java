package ch06.sec10.exam02;

/*
 * [핵심 조건]
 * - GameServer 클래스를 설계한다.
 * - 생성자를 절대 사용하지 않고, 정적 멤버 전용 초기화 구역을 활용해 복잡한 필드 세팅을 완료한다.
 * 
 * [동작 요구사항]
 * - 정적 필드 선언: 서버이름(문자열, 기본값 "Asia-1"), 게임버전(문자열, 기본값 "v2.0"), 전체서버정보(문자열, 초기값 없음)
 * - 초기화 로직: '전체서버정보' 필드는 직접 값을 대입하지 않고, 별도의 정적 초기화 구역에서 "서버이름-게임버전" 형태로 조합되어 자동으로 저장되도록 구현한다.
 */

public class GameServer {
	static String severName = "Asia-1";
	static String gameVer = "v2.0";
	static String totalSever;
	
	static {
		totalSever = severName+"-"+gameVer;
	}
}
