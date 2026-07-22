package ch02.sec07;

/*
 * [문제 상황: 행성 탐사선 데이터 자동 변환 시스템]
 * 
 * 1. 문자 데이터 변환: 탐사선이 발견한 외계 구역의 등급은 문자 'S'이다. 이 문자를 char 타입 변수(grade)에 저장한 뒤, 다른 연산 없이 새로운 정수형 타입 변수(gradeCode)에 대입하여 'S'의 유니코드 정수값을 구하고 출력한다.
 * 2. 센서 데이터 확장: 탐사선의 초기 배터리 잔량 85를 byte 타입 변수(battery)에 저장한다. 이후 메인 시스템의 메모리 규격에 맞게 이 값을 int 타입 변수(mainBattery)에 그대로 대입하고 출력한다.
 * 3. 정수를 실수로 연달아 변환: 탐사선의 이동 거리 계산을 위해 3000000000L (30억) 값을 long 타입 변수(distance)에 저장한다. 이 값을 실수 연산 시스템에 넘기기 위해 먼저 float 타입 변수(floatDistance)에 대입하고, 이어서 그 값을 다시 double 타입 변수(doubleDistance)에 대입하여 최종 실수값을 출력한다.
 */

public class DataPromotionExample {

	public static void main(String[] args) {
		char grade = 'S';
		int gradeCode = grade;
		System.out.println("'S'의 유니코드 정수값: "+gradeCode);
		
		byte battery = 85;
		int mainBattery = battery;
		System.out.println("mainBattery: "+mainBattery);
		
		long distance = 3000000000L;
		float floatDistance = distance;
		double doubleDistance = floatDistance;
		System.out.println("탐사선의 이동 거리: "+doubleDistance);
	}

}
