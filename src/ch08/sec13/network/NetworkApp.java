package ch08.sec13.network;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec13.network
 * 
 * [테스트 순서 및 요구사항]
 * 1. SystemImpl 객체를 하나 생성한다.
 * 2. 이 동일한 객체를 NetworkNode, ServerNode, DatabaseNode 타입의 변수에 각각 번갈아 대입해 본다.
 * 3. 각 부모 타입의 변수를 통해 접근할 수 있는 메서드의 범위가 어디까지인지(다형성의 한계) 주석으로 간단히 남기고, 호출 가능한 모든 메서드를 실행한다.
 */
public class NetworkApp {
	public static void main(String[] args) {
		SystemImpl si = new SystemImpl();
		
		NetworkNode n = si;
		n.connect();
		//n.processData(); 	NetworkNode 에게는 없는 추상메소드들이기에 사용 X
		//n.query();
		
		ServerNode s = si;
		s.connect();	//ServerNode 부모가 지닌 추상 메소드이기에 사용가능
		s.processData();
		//s.query();	ServerNode에게는 없는 추상메소드이기에 사용 X
		
		DatabaseNode d = si;
		d.connect();
		d.processData();
		d.query();
	}

}
