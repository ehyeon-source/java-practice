package ch06.sec13.exam01.admin;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec13.admin
 * - 이 설계도는 외부 패키지에서도 자유롭게 수입(import)해서 쓸 수 있도록 접근 권한을 완전히 개방한다.
 * - 'SecretKey' 객체를 내부에서 생성한 뒤, 그 객체의 `key` 필드 값을 반환하는 메서드(문자열 반환)를 구현한다.
 */

public class KeyManager {
	public String returnKey() {
		SecretKey key = new SecretKey();
		return key.key;
	}
}
