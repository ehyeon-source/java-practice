package ch08.sec13.network;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec13.network
 * 
 * [동작 요구사항]
 * - 무분별한 상속을 막기 위해 봉인된 인터페이스로 선언한다.
 * - 오직 ServerNode 인터페이스에게만 상속을 허락하도록 통제한다.
 * - 반환값과 매개변수가 없는 connect() 추상 메서드를 선언한다.
 */
public sealed interface NetworkNode permits ServerNode{
	void connect();
}
