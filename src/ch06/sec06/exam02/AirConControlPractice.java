package ch06.sec06.exam02;

/*
 * [문제 상황 2: 에어컨 가동 및 상태 제어]
 * 
 * 1. 객체 생성:
 *    - SmartAirCon 설계도를 바탕으로 새로운 객체를 생성하고, 변수(myAirCon)에 담는다.
 * 
 * 2. 초기 상태 읽기 (출력):
 *    - 생성된 myAirCon 객체 내부로 접근하여 세 개의 필드(company, targetTemp, currentTemp)에 들어있는 값을 각각 한 줄씩 출력한다.
 * 
 * 3. 데이터 쓰기 (필드값 수정):
 *    - 도트 연산자를 사용하여 myAirCon 객체의 현재 실내 온도(currentTemp) 값을 29로 변경한다.
 *    - 도트 연산자를 사용하여 myAirCon 객체의 목표 온도(targetTemp) 값을 18로 덮어쓰기하여 변경한다.
 * 
 * 4. 변경된 상태 확인 (출력):
 *    - "센서 측정: 현재 실내 온도는 [수정된 currentTemp 값]도 입니다."를 출력한다.
 *    - "사용자 조작: 목표 온도가 [수정된 targetTemp 값]도로 변경되었습니다."를 출력한다.
 */

public class AirConControlPractice {

	public static void main(String[] args) {
		SmartAirCon myAirCon = new SmartAirCon();
		
		System.out.println("company: "+myAirCon.company);
		System.out.println("targetTemp: "+myAirCon.targetTemp);
		System.out.println("currentTemp: "+myAirCon.currentTemp);
		
		myAirCon.currentTemp = 29;
		myAirCon.targetTemp = 18;
		
		System.out.println("센서 측정: 현재 실내 온도는 "+myAirCon.currentTemp+"도 입니다.");
		System.out.println("사용자 조작: 목표 온도가 "+myAirCon.targetTemp+"도로 변경되었습니다.");

	}

}
