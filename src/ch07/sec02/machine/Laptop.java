package ch07.sec02.machine;

/*
 * [핵심 조건]
 * - 패키지명: ch07.sec02.machine
 * - Computer 클래스의 모든 자산을 물려받는 자식 클래스로 선언한다. (상속 관계 설정)
 * 
 * [동작 요구사항]
 * - 필드 1개 추가: 배터리잔량(battery)을 정수형(int)으로 선언.
 * - 생성자: 제조사(brand)와 CPU모델(cpu)을 매개변수로 받아, 물려받은 부모의 필드에 값을 세팅해 준다.
 * - 메서드 1개 추가:
 *   1. charge(int amount): 매개변수로 들어온 충전량(amount)만큼 배터리 잔량을 증가시키고, "배터리를 충전합니다. 현재 잔량: [적용된 배터리값]%"를 출력한다.
 */

public class Laptop extends Computer{
	int battery;
	
	Laptop(String brand, String cpu){
		this.brand = brand;
		this.cpu = cpu;
	}
	
	void charge(int amount) {
		battery += amount;
		System.out.println("배터리를 충전합니다. 현재 잔량: "+battery+"%");
	}
}
