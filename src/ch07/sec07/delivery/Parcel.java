package ch07.sec07.delivery;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec07.delivery
 * - 모든 일반 택배의 기본이 되는 부모 클래스.
 * 
 * [동작 요구사항]
 * - 필드 1개: 배송지(address)를 문자열로 선언.
 * - 메서드 1개: send()
 *   - 기능: "일반 택배를 발송합니다." 출력
 */
public class Parcel {
	String address;
	void send() {
		System.out.println("일반 택배를 발송합니다.");
	}
}
