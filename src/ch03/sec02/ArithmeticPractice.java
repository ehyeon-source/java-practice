package ch03.sec02;

/*
 * [문제 상황: 대규모 제과점 생산 및 포장 관리 시스템]
 * 
 * 1. 기본 생산량 누적: 오전반에서 구운 빵 35개(batch1), 오후반에서 구운 빵 42개(batch2)를 각각 byte 타입 변수에 저장한다. 두 변수를 더한 총 생산량을 연산 규칙에 맞는 알맞은 타입의 변수(totalBread)를 직접 선언하여 저장한다.
 * 2. 대규모 납품 수량 합산: 전국 체인점 납품을 위한 기본 할당량이 20000000000L (200억)이다. 이 값을 long 타입 변수(chainOrder)에 저장한다. 앞서 구한 totalBread와 chainOrder를 더하여, 최종 누적 수량을 담기에 가장 알맞은 타입의 변수(finalProduction)를 선언해 저장한다.
 * 3. 정확한 분배: 오전/오후반에서 구운 빵(totalBread)을 4명의 근무자가 똑같이 나누어 가져가려고 한다. 소수점 이하 몫까지 정확히 나눈 분량을 계산하여, 알맞은 실수 타입 변수(averageBread)에 저장한다. (숫자 4를 직접 활용할 것)
 * 4. 포장 후 잔여 수량: 오전/오후반에서 구운 빵(totalBread)을 8개씩 들어가는 상자에 포장하려고 한다. 완전히 포장하고 '남은 빵의 개수'만 산출하여 알맞은 정수 타입 변수(leftoverBread)에 저장한다. (숫자 8을 직접 활용할 것)
 * 5. 결과 출력: 수식 계산이 끝난 후 totalBread, finalProduction, averageBread, leftoverBread 값을 각각 콘솔에 출력한다. (이전처럼 주석으로 예상 값을 먼저 적어보고 실제 결과와 비교해 볼 것!)
 */

public class ArithmeticPractice {

	public static void main(String[] args) {
		byte batch1 = 35;
		byte batch2 = 42;
		int totalBread = batch1 + batch2;
		
		long chainOrder = 20000000000L;
		long finalProduction = totalBread + chainOrder;
		
		double averageBread = (double)totalBread / 4;
		
		int leftoverBread = totalBread % 8;
		
		System.out.println("totalBread: "+totalBread);	//내 예상 77
		System.out.println("finalProduction: "+finalProduction);	//내 예상 20000000077
		System.out.println("averageBread: "+averageBread);	//내 예상 19.25
		System.out.println("leftoverBread: "+leftoverBread);	//내 예상 5
	}

}
