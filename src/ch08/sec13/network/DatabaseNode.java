package ch08.sec13.network;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec13.network
 * 
 * [동작 요구사항]
 * - ServerNode를 상속받는 일반 인터페이스로 선언한다.
 * - 반환값과 매개변수가 없는 query() 추상 메서드를 선언한다.
 */
public interface DatabaseNode extends ServerNode{
	void query();
}
