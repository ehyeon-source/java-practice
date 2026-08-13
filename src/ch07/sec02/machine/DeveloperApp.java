package ch07.sec02.machine;

/*
 * [가동 조건]
 * - 패키지명: ch07.sec02.machine
 * - Laptop 객체를 하나 생성한다. (제조사는 "Apple", CPU는 "M3"로 전달)
 * 
 * [테스트 순서 및 기대되는 동작]
 * 1. 물려받은 부모의 필드(brand, cpu) 값을 각각 화면에 출력하여 객체 생성 시 값이 잘 세팅되었는지 확인한다.
 * 2. 내 고유 필드인 배터리 잔량(battery)을 직접 화면에 출력해 본다. (기본값 확인)
 * 3. 물려받은 부모의 메서드(boot)를 호출하여 작동시킨다.
 * 4. 내 고유 메서드인 charge()를 호출하여 배터리를 50만큼 충전시킨다.
 * 5. 물려받은 부모의 메서드(shutdown)를 호출하여 종료시킨다.
 */

public class DeveloperApp {
	public static void main(String[] args) {
		Laptop l = new Laptop("Apple","M3");
		
		System.out.println("l의 brand: "+l.brand);
		System.out.println("l의 cpu: "+l.cpu);
		
		System.out.println("l의 battery: "+l.battery);
		
		l.boot();
		
		l.charge(50);
		
		l.shutdown();
	}

}
