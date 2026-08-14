package ch07.sec07.cafe;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec07.cafe
 * - 자식인 EspressoMachine 객체를 생성하되, 담는 변수(그릇)의 타입은 '부모(CoffeeMachine)'로 선언하여 자동 타입 변환(업캐스팅)을 일으킨다.
 * 
 * [테스트 순서 및 요구사항]
 * 1. 부모 타입 변수를 통해 brew()를 호출해 본다. (부모의 기본 커피가 나오는지, 자식의 에스프레소가 나오는지 출력으로 확인)
 * 2. 부모 타입 변수를 통해 자식 고유의 steamMilk() 기능을 호출해 본다.
 * 3. 에러(빨간줄)가 발생하면 해당 줄을 주석(//) 처리하고, "본체는 에스프레소 머신인데 왜 스팀 우유 기능을 쓸 수 없는지" 적어주신 주석의 원리를 활용해 본인의 언어로 적어둔다.
 */
public class CafeApp {
	public static void main(String[] args) {
		CoffeeMachine cm = new EspressoMachine();
		
		cm.brew();  // 내 예상 자식의 에스프레소가 출력
		
		//cm.steamMilk();	//부모타입 참조변수가 가르키고있는건 자식객체, 거기에 결합된 부모객체에만 접근이 가능해서
	}

}
