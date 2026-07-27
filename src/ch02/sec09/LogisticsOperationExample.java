package ch02.sec09;

/*
 * [문제 상황: 물류 센터 재고 및 배송 지표 산출]
 * 
 * 1. 기본 연산 타입 변환: A구역 재고(zoneA)는 50, B구역 재고(zoneB)는 100이다. 둘 다 byte 타입 변수에 할당한다. 두 변수를 더하여 총 재고량(totalStock)을 구하되, 연산 결과에 맞는 올바른 정수 타입 변수에 할당한다.
 * 2. 정수와 실수 연산: 총 재고량(totalStock)을 4개의 배송 트럭에 똑같이 나누어 실으려고 한다. 정확한 평균 적재량을 구하기 위해 정수 나눗셈(소수점 버림)이 발생하지 않도록 실수 나눗셈으로 처리하여 double 타입 변수(averageStock)에 할당한다. (트럭 수 4는 변수 선언 없이 수식에 직접 사용할 것)
 * 3. 문자열 결합 연산: 배송 코드(deliveryCode)를 생성한다. 배송 코드는 문자열 "CODE_" 뒤에 구역 번호 1과 2를 산술적으로 '더한' 값인 3이 붙어 최종적으로 "CODE_3"이 되어야 한다. 반드시 문자열 "CODE_"와 숫자 1, 2만을 사용하여 한 줄의 식으로 작성하되, 의도한 대로 덧셈이 먼저 수행되도록 처리하여 String 변수에 할당한다.
 * 4. 결과 출력: 총 재고량, 평균 적재량, 배송 코드를 각각 콘솔에 출력한다.
 */

public class LogisticsOperationExample {
	public static void main(String[]args) {
		//리터럴이 피연산자이면 컴파일단계에서 연산을 수행
		//변수가 피연산자이면 실행시 연산을 수행
		
		byte zoneA = 50;
		byte zoneB = 100;
		int totalStock = zoneA + zoneB;
		
		double averageStock = (double)totalStock/4;
		
		String deliveryCode = "CODE_"+(1+2);
		
		System.out.println("총 재고량: "+totalStock);
		System.out.println("평균 적재량: "+averageStock);
		System.out.println("배송 코드: "+deliveryCode);
	}
}
