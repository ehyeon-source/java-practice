package ch03.sec01;

/*
 * [문제 상황: 스마트 팩토리 온도 제어 및 전력 부하 계산]
 * 
 * 1. 부호 연산과 타입 변환: 현재 외부 온도를 나타내는 byte 타입 변수(outTemp)에 -20을 할당한다. 부호 연산자(-)를 사용하여 이 값을 양수로 반전시킨 뒤, 이 연산 결과를 담기에 가장 알맞은 타입의 변수(absTemp)를 직접 판단하여 선언하고 저장한다.
 * 2. 기본 데이터 준비: 공장의 기본 전력 수치를 나타내는 int 변수(power)에 100을 할당한다. 이후 전력 부하 수치를 계산하여 담을 변수(load)를 알맞은 타입으로 선언만 해둔다.
 * 3. 증감 연산자 복합 활용: load 변수에 다음 수식을 작성하여 할당한다. 
 *    -> power 변수에는 '전위 증가 연산자'를, absTemp 변수에는 '후위 감소 연산자'를 적용하여 두 값을 더한다. (반드시 한 줄의 덧셈 수식으로 작성할 것)
 * 4. 결과 출력: 수식 계산이 모두 끝난 후, 최종적으로 변한 load, power, absTemp의 값을 각각 콘솔에 출력하여 전위/후위 연산자가 의도대로 작동했는지 확인한다.
 */

public class OperatorCombinePractice {

	public static void main(String[] args) {
		byte outTemp = -20;
		int absTemp = -outTemp;
		
		int power = 100;
		int load;
		
		load = ++power + absTemp-- ;	//내 예상 101+20
		
		System.out.println("load : "+load);	//예상 121
		System.out.println("power : "+power);	//예상 101
		System.out.println("absTemp : "+absTemp);	//예상 19
	}

}
