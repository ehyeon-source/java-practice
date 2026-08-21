package ch08.sec13.network;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec13.network
 * - DatabaseNode 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - 상속 계층에 의해 누적된 모든 추상 메서드를 재정의한다.
 * - connect() -> "네트워크에 연결합니다." 출력
 * - processData() -> "데이터를 처리합니다." 출력
 * - query() -> "DB 쿼리를 실행합니다." 출력
 */
public class SystemImpl implements DatabaseNode{
	@Override
	public void connect() {
		System.out.println("네트워크에 연결합니다.");
	}
	
	@Override
	public void processData() {
		System.out.println("데이터를 처리합니다.");
	}
	
	@Override
	public void query() {
		System.out.println("DB 쿼리를 실행합니다.");
	}
}
