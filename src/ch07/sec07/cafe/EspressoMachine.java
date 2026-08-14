package ch07.sec07.cafe;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec07.cafe
 * - CoffeeMachine을 상속받는 고급 에스프레소 머신.
 * 
 * [동작 요구사항]
 * - 부모의 brew() 메서드를 재정의(오버라이딩)한다. (안전장치 부착)
 *   -> "고압으로 쫀쫀한 에스프레소를 추출합니다." 출력
 * - 자신만의 고유 메서드 1개를 추가한다: steamMilk()
 *   -> "뜨거운 스팀으로 우유 거품을 만듭니다." 출력
 */
public class EspressoMachine extends CoffeeMachine{
	@Override
	void brew() {
		System.out.println("고압으로 쫀쫀한 에스프레소를 추출합니다.");
	}
	
	void steamMilk() {
		System.out.println("뜨거운 스팀으로 우유 거품을 만듭니다.");
	}
}
