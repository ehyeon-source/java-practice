package ch02.sec04;

/*
 * [문제 상황: 우주 탐사선 궤도 및 센서 데이터 분석]
 * 
 * 1. 정밀도 비교: 탐사선이 측정한 특정 소행성의 중력 상수는 0.9876543210987654321 이다. 이 동일한 값을 float 타입 변수(standardSensor)와 double 타입 변수(highSensor)에 각각 할당한다. 
 * 2. 큰 수의 지수 표현: 탐사선과 지구 사이의 현재 거리는 150,000,000(1.5 곱하기 10의 8승)이다. 지수 리터럴(e)을 사용하여 double 타입 변수(distance)에 할당한다.
 * 3. 작은 수의 지수 표현: 탐사선의 궤도 이탈 오차 범위는 0.00075(7.5 곱하기 10의 -4승)이다. 지수 리터럴(e)을 사용하여 float 타입 변수(errorMargin)에 할당한다.
 * 4. 결과 출력: 4개의 변수를 모두 콘솔에 출력한다. (출력 결과를 통해 float과 double의 정밀도 차이를 눈으로 직접 확인해 볼 것)
 */

public class SpaceProbeExample {

	public static void main(String[] args) {
		float standardSensor = 0.9876543210987654321F;
		double highSensor = 0.9876543210987654321;
		
		double distance = 1.5E8;
		
		float errorMargin = 7.5E-4F;
		
		System.out.println("standardSensor: "+standardSensor);
		System.out.println("highSensor: "+highSensor);
		System.out.println("탐사선과 지구 사이의 현재 거리: "+distance);
		System.out.println("탐사선의 궤도 이탈 오차 범위: "+errorMargin);
	}

}
