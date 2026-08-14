package ch07.sec07.delivery;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec07.delivery
 * - Parcel을 상속받는 신선식품(냉장/냉동) 택배 클래스.
 * 
 * [동작 요구사항]
 * - 자식 전용 고유 필드 1개 추가: 유지온도(temperature)를 정수형으로 선언.
 * - 자식 전용 고유 메서드 1개 추가: addIcePack()
 *   - 기능: "아이스팩을 동봉하여 신선도를 유지합니다." 출력
 */
public class ColdParcel extends Parcel{
	int temperature;
	void addIcePack() {
		System.out.println("아이스팩을 동봉하여 신선도를 유지합니다.");
	}
}
