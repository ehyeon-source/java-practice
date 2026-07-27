package ch02.sec10;

/*
 * [문제 상황: 스마트 팩토리 센서 데이터 수신 및 보정 후 서버 전송]
 * 
 * 1. 데이터 수신 (문자열 -> 기본 타입): 외부 API로부터 온도("27.5"), 습도("65"), 장비 가동 상태("true") 데이터를 문자열(String) 형태로 전달받았다. 이를 연산이 가능하도록 각각 double, int, boolean 타입의 변수(temp, humidity, isRunning)에 알맞게 변환하여 저장한다.
 * 2. 데이터 보정 (기본 타입 연산): 센서 캘리브레이션(영점 조절)을 위해 수신된 온도 값에 1.5를 더하고, 습도 값에는 5를 뺀다. 장비 가동 상태 변수는 현재 상태의 반대(부정) 값으로 변경하여 다시 할당한다.
 * 3. 데이터 패키징 (기본 타입 -> 문자열): 보정이 완료된 3개의 데이터를 다시 서버로 전송하기 위해, 3개의 변수를 모두 문자열(String) 타입 변수(strTemp, strHumidity, strIsRunning)로 새롭게 변환하여 저장한다. (단, 꼼수로 빈 문자열("")을 더하는 결합 연산 방식은 사용하지 말고 배운 메서드만을 사용할 것)
 * 4. 결과 출력: 최종적으로 변환 완료된 3개의 문자열 변수를 콘솔에 출력한다.
 */

public class DataConversionExample {

	public static void main(String[] args) {
		String tempApi = "27.5";
		String humidityApi = "65";
		String isRunningApi = "true";
		double temp = Double.parseDouble(tempApi);
		int humidity = Integer.parseInt(humidityApi);
		boolean isRunning = Boolean.parseBoolean(isRunningApi);
		
		temp+=1.5;
		humidity-=5;
		isRunning=!isRunning;
		
		String strTemp = String.valueOf(temp);
		String strHumidity = String.valueOf(humidity); 
		String strIsRunning = String.valueOf(isRunning);
		
		System.out.println("온도: "+strTemp);
		System.out.println("습도: "+strHumidity);
		System.out.println("장비 가동 상태: "+strIsRunning);
	}

}
