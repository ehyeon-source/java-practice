package ch08.sec10.promotion;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec10.promotion
 * 
 * [테스트 순서 및 요구사항]
 * 1. Vehicle 타입의 참조 변수 v를 하나만 선언한다.
 * 2. 이 변수 v에 Car, Bike, SportsCar, MountainBike 객체를 순서대로 번갈아 꽂아 넣는다.
 * 3. 객체를 갈아 끼울 때마다 v.run()을 호출하여, 1세대와 2세대 객체 모두 인터페이스 타입으로 자동 변환되어 정상 작동하는지 확인한다.
 */
public class PromotionApp {
	public static void main(String[] args) {
		Vehicle v;
		
		v = new Car();
		v.run();
		
		v = new Bike();
		v.run();
		
		v = new SportsCar();
		v.run();
		
		v = new MountainBike();
		v.run();
	}

}
