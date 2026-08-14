package ch07.sec09.shelter;
/*
 * [핵심 조건]
 * - 두 클래스 모두 Animal을 상속받는 자식 클래스. (오버라이딩 없음, 각자 고유 기능만 추가)
 * 
 * [동작 요구사항]
 * - Cat 클래스는 고유 메서드 1개 추가: groom()
 *   -> "고양이가 털을 핥으며 그루밍을 합니다." 출력
 * - Dog 클래스는 고유 메서드 1개 추가: fetch()
 *   -> "강아지가 꼬리를 흔들며 공을 물어옵니다." 출력
 */
public class Cat extends Animal{
	void groom() {
		System.out.println("고양이가 털을 핥으며 그루밍을 합니다.");
	}
}
