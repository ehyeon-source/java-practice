package ch06.sec07.exam02;

/*
 * [문제 상황 1: 사원증 설계도 제작]
 *
 * 1. 필드 선언:
 *    - 문자열(String) 타입의 회사명 필드(company)를 선언하고, "글로벌IT"라는 값으로 미리 초기화해 둔다. (모든 사원의 공통 소속)
 *    - 문자열(String) 타입의 사원이름 필드(name)를 선언하되 초기화하지 않는다.
 *    - 정수(int) 타입의 사원번호 필드(empNo)를 선언하되 초기화하지 않는다.
 * 
 * 2. 생성자 선언:
 *    - 사원이름(String)과 사원번호(int) 두 개를 매개변수로 입력받는 생성자를 만든다.
 *    - 생성자 내부({})에서, 외부로부터 입력받은 매개변수 값들을 객체의 name 필드와 empNo 필드에 각각 저장하도록 코드를 작성한다.
 */

public class EmployeeCard {
	String company = "글로벌IT";
	String name;
	int empNo;
	
	EmployeeCard(String name2, int empNo2){	//company 는 모두에게 해당하는 속성이기에 생성자로 객체마다 초기화 불필요 
		name = name2;
		empNo = empNo2;
	}
}
