package ch02.sec05;

/*
 * [문제 상황: 스마트 홈 공기청정기 자동 제어 시스템]
 * 
 * 1. 상태 제어: 공기청정기의 현재 가동 상태를 나타내는 논리 타입 변수(isRunning)를 선언하고, 값으로 '거짓'을 할당한다.
 * 2. 조건 분기: 제어문(if-else)을 사용하여 isRunning이 참일 경우 "공기청정기를 가동합니다."를 출력하고, 그렇지 않을 경우 "공기청정기가 정지 상태입니다."를 출력하게 한다.
 * 3. 센서 값 비교: 현재 실내 미세먼지 수치(dustLevel)는 45이다. 정수형 변수를 선언해 이를 할당한다.
 * 4. 논리 연산: 미세먼지 수치가 '정상 기준치인 30과 정확히 일치하는지' 여부를 담는 논리 변수(isNormal)와, '정상 기준치 30과 일치하지 않는지' 여부를 담는 논리 변수(isWarning)를 각각 선언하고 관계 연산자를 사용해 값을 할당한다. (비교를 위해 숫자 30을 연산식에 직접 사용할 것)
 * 5. 결과 출력: isNormal과 isWarning 변수가 가진 값을 각각 콘솔에 출력하여 현재 센서의 논리적 상태를 확인한다.
 */

public class SmartAirPurifierExample {

	public static void main(String[] args) {
		boolean isRunning = false;
		
		if(isRunning == true) {		//isRinning 이미 boolean 값이기에 true 가 필요가 없었구나....
			System.out.println("공기청정기를 가동합니다.");
		}else {
			System.out.println("공기청정기가 정지 상태입니다.");
		}
		
		int dustLevel = 45;
		
		boolean isNormal=(dustLevel==30?true:false);	//dustLevel == 30  방법 못 떠올림...
		boolean isWarning=(dustLevel!=30?true:false);	//dustLevel != 30  방법 못 떠올림...
		
		System.out.println("isNormal: "+isNormal+" , isWarning: "+isWarning);
	}

}
