package ch03.sec07;

/*
 * [문제 상황: 스마트 팩토리 불량품 자동 필터링 시스템]
 * 
 * 1. 데이터 준비: 제품의 무게를 나타내는 int 변수(weight)에 490을, 제품의 상태 코드를 나타내는 int 변수(statusCode)에 14를 할당한다.
 * 2. 무게 정상 판별: 제품의 무게가 500 이상이고, 동시에 550 이하인지 판별하여 boolean 변수(isNormalWeight)에 저장한다. 
 *    (단, 앞의 조건만으로 전체 결과가 이미 확정될 수 있다면, 시스템 자원 절약을 위해 뒤쪽 조건은 아예 실행조차 되지 않도록 가장 최적화된 논리 검사 방식을 적용할 것.)
 * 3. 재검사 대상 판별: 상태 코드가 7의 배수이거나, 또는 10의 배수인 경우 재검사 대상으로 분류한다. 이 조건에 해당하는지 판별하여 boolean 변수(needsRecheck)에 저장한다. 
 *    (이 역시 앞선 조건 검사만으로 결과가 확정된다면, 뒤쪽 수식은 연산하지 않고 건너뛰는 최적화 방식을 적용할 것.)
 * 4. 최종 불합격 판정: 제품의 무게가 정상 범위에 속하는 상태가 '아니거나', 재검사 대상에 속하는 경우 최종 불합격 처리한다. 이 불합격 상태를 판별하는 단일 수식을 작성하여 boolean 변수(isRejected)에 저장한다.
 * 5. 결과 출력: 수식 계산이 끝난 후 isNormalWeight, needsRecheck, isRejected 값을 각각 콘솔에 출력한다. (코드 우측에 주석으로 본인의 예상 값을 반드시 먼저 적어둘 것.)
 */

public class FactoryFilterPractice {

	public static void main(String[] args) {
		int weight = 490;
		int statusCode = 14;
		
		boolean isNormalWeight = (500<=weight && weight<=550);
		
		boolean needsRecheck = (statusCode%7==0)||(statusCode%10==0);
		
		boolean isRejected = (isNormalWeight==false || needsRecheck==true);	//AI 왈 안 좋은 코드 !isNormalWeight || needsRecheck 로 앞으로 하라고 함
		
		System.out.println("isNormalWeight: "+isNormalWeight);	//내 예상 false
		System.out.println("needsRecheck: "+needsRecheck);	//내 예상 true
		System.out.println("isRejected: "+isRejected);	//내 예상 true
		
	}

}
