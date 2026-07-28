package ch03.sec08;

/*
 * [문제 상황: IoT 디바이스 센서 데이터 통신 시스템]
 * 
 * 1. 데이터 수신: 센서에서 전송된 데이터가 byte 타입 변수(rawData)에 -100 으로 수신되었다.
 * 2. 수동 복원: 수신된 rawData 값을 '비트 논리 연산'만을 활용하여 원래의 부호 없는 양수(정수) 값으로 복원하고, 그 결과를 int 타입 변수(recoveredData1)에 저장한다.
 * 3. API 복원: 동일한 rawData 값을 자바 기본 내장 메서드를 활용하여 부호 없는 양수 값으로 복원하고, 그 결과를 int 타입 변수(recoveredData2)에 저장한다.
 * 4. 데이터 송신 테스트: 반대로, 서버에서 디바이스로 보낼 제어 값 200을 int 타입 변수(controlValue)에 저장한 뒤, 이를 네트워크 규격에 맞게 byte 타입 변수(sendData)로 변환하여 저장한다.
 * 5. 결과 출력: recoveredData1, recoveredData2, sendData 값을 각각 콘솔에 출력한다. 
 */

public class BitLogicPractice {

	public static void main(String[] args) {
		byte rawData = -100;
		
		int recoveredData1 = ((int)rawData)&255;	//AI 왈 (int) 캐스팅 필요없다고 자동으로 되는데 왜헀냐고 함
		
		int recoveredData2 = Byte.toUnsignedInt(rawData);
		
		int controlValue = 200;
		byte sendData = (byte)controlValue;
		
		System.out.println("recoveredData1: "+recoveredData1);
		System.out.println("recoveredData2: "+recoveredData2);
		System.out.println("sendData: "+sendData);
	}

}
