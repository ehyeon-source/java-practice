package ch07.sec05.security;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec05.security
 * - 이 클래스는 절대 다른 곳에서 상속받아 변조할 수 없도록 '최종(final) 클래스'로 설계한다.
 * 
 * [동작 요구사항]
 * - 필드 1개: serialNumber(문자열)를 선언하고 "VIP-001"로 초기화. (접근 개방)
 * - 메서드 1개: open()
 *   - 기능: 콘솔에 "마스터 키가 작동합니다. 모든 보안 장치를 해제합니다." 출력
 */
public final class MasterKey {
	public String serialNumber = "VIP-001";
	
	void open() {
		System.out.println("마스터 키가 작동합니다. 모든 보안 장치를 해제합니다.");
	}
}
