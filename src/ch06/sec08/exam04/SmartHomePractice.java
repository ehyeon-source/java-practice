package ch06.sec08.exam04;

/*
 * [가동 조건]
 * - PowerManager 객체를 생성한 뒤, 다음 세 가지 상황에 대한 전력 소비량을 각각 계산하고 출력한다.
 * 
 * [입력 데이터]
 * - 거실 기본 전등: 8.5시간 사용
 * - TV: 4.0시간 사용, 150.0W
 * - 에어컨: 2.5시간 사용, 2000.0W, 2대
 * 
 * [기대되는 정확한 출력 결과]
 * 거실 전등 소비 전력: 127.5W
 * TV 소비 전력: 600.0W
 * 에어컨 소비 전력: 10000.0W
 */

public class SmartHomePractice {

	public static void main(String[] args) {
		PowerManager pm = new PowerManager();
		
		double lamp = pm.calcPower(8.5);
		double TV = pm.calcPower(4.0, 150.0);
		double aircon = pm.calcPower(2.5, 2000.0, 2);
		
		System.out.println("거실 전등 소비 전력: "+lamp);
		System.out.println("TV 소비 전력: "+TV);
		System.out.println("에어컨 소비 전력: "+aircon);

	}

}
