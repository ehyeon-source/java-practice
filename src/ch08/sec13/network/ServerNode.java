package ch08.sec13.network;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec13.network
 * 
 * [동작 요구사항]
 * - NetworkNode를 상속받는다.
 * - 이 인터페이스부터는 누구나 하위 상속을 받을 수 있도록 봉인을 전면 개방(해제)한다.
 * - 반환값과 매개변수가 없는 processData() 추상 메서드를 선언한다.
 */
public non-sealed interface ServerNode extends NetworkNode{
	void processData();
}
