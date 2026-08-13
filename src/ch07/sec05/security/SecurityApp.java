package ch07.sec05.security;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec05.security
 * - 진짜 MasterKey 객체를 하나 생성한다.
 * - 생성된 객체의 시리얼 넘버를 출력하여 확인하고, open() 메서드를 호출하여 보안 장치를 해제한다.
 * - (FakeKey는 에러가 나므로 객체를 생성하지 않는다.)
 */
public class SecurityApp {
	public static void main(String[] args) {
		MasterKey key = new MasterKey();
		
		System.out.println("시리얼 넘버: "+key.serialNumber);
		key.open();
		
	}

}
