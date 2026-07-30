package ch05.sec06;

/*
 * [문제 상황 1: 주차장 자리 할당 및 상태 확인 시스템]
 * 
 * 1. 배열 생성: 크기가 5인 문자열(String) 배열(parkingLot)을 생성한다. (처음에는 아무 값도 넣지 않고 공간만 확보할 것)
 * 2. 차량 주차:
 *    - 첫 번째 자리(인덱스 0)에 "가-1234" 문자열을 대입한다.
 *    - 세 번째 자리(인덱스 2)에 "다-5678" 문자열을 대입한다.
 * 3. 상태 확인 (반복문 활용):
 *    - 반복문과 배열의 '길이 속성'을 사용하여 첫 번째 자리부터 마지막 자리까지 순회한다.
 *    - 각 자리를 검사하여, 차량 번호가 들어있으면 "[주차완료] 차량번호: {차량번호}"를 출력한다.
 *    - 아무 차량도 주차되지 않은 빈자리(문자열 배열의 초기값 상태)라면 "[빈자리] 주차 가능"을 출력한다.
 */

public class ParkingLotPractice {

	public static void main(String[] args) {
		String[] parkingLot = new String[5];
		parkingLot[0] = "가-1234";
		parkingLot[2] = "다-5678";
		
		for(int i=0; i<parkingLot.length;i++) {
			if(parkingLot[i]!=null) System.out.println("[주차완료] 차량번호: "+parkingLot[i]);
			else System.out.println("[빈자리] 주차 가능");
		}

	}

}
