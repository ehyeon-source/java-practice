package ch06.sec13.exam01.admin;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec13.admin
 * - 보안을 위해 오직 '같은 패키지 내부'에서만 이 설계도를 열어볼 수 있도록 접근 권한을 철저히 잠가둔다. (특정 키워드 활용 혹은 생략)
 * - 문자열 필드 `key`를 선언하고 "TOP-SECRET-777"로 초기화한다.
 */

class SecretKey {
	String key = "TOP-SECRET-777";
}
