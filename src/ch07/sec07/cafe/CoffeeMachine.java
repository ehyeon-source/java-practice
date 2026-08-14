package ch07.sec07.cafe;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec07.cafe
 * - 모든 커피 머신의 기본이 되는 부모 클래스.
 * 
 * [동작 요구사항]
 * - 메서드 1개: brew()
 *   - 기능: "원두를 내려 기본 커피를 추출합니다." 출력
 */
public class CoffeeMachine {
	void brew() {
		System.out.println("원두를 내려 기본 커피를 추출합니다.");
	}
}
