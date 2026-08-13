package ch07.sec02.machine;

/*
 * [핵심 조건]
 * - 패키지명: ch07.sec02.machine
 * - 부모 역할을 할 기본 컴퓨터 설계도를 만든다.
 * 
 * [동작 요구사항]
 * - 필드 2개 선언 (어디서든 접근 가능하게 개방): 제조사(brand) - 문자열, CPU모델(cpu) - 문자열
 * - 메서드 2개 선언:
 *   1. boot(): "컴퓨터를 부팅합니다." 출력
 *   2. shutdown(): "컴퓨터를 종료합니다." 출력
 */

public class Computer {
	public String brand;
	public String cpu;
	
	void boot() {
		System.out.println("컴퓨터를 부팅합니다.");
	}
	
	void shutdown() {
		System.out.println("컴퓨터를 종료합니다.");
	}
}
