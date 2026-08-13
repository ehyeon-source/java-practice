package ch07.sec04.vehicle;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec04.vehicle
 * - 일반 자동차의 기본기를 담은 부모 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 메서드 1개 선언: run()
 *   - 기능: 콘솔에 "일반 주행을 시작합니다." 를 출력한다.
 */
public class Car {
	void run() {
		System.out.println("일반 주행을 시작합니다.");
	}
}
