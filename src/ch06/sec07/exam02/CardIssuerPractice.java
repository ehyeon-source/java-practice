package ch06.sec07.exam02;

/*
 * [문제 상황 2: 사원증 객체 생성 및 데이터 검증]
 * 
 * 1. 첫 번째 사원증 발급:
 *    - EmployeeCard 설계도를 바탕으로 객체를 생성하되, 생성자의 매개변수로 "제임스"와 1001 을 전달한다.
 *    - 생성된 객체를 변수(emp1)에 담는다.
 * 
 * 2. 두 번째 사원증 발급:
 *    - 동일한 설계도를 사용하여 새로운 객체를 생성하되, 생성자의 매개변수로 "앨리스"와 1002 를 전달한다.
 *    - 생성된 객체를 변수(emp2)에 담는다.
 * 
 * 3. 사원증 정보 출력:
 *    - emp1 객체에 접근하여 소속 회사, 사원 이름, 사원 번호를 출력한다.
 *    - emp2 객체에 접근하여 소속 회사, 사원 이름, 사원 번호를 출력한다.
 *    - (출력을 통해 두 객체가 '회사명'은 똑같이 공유하면서도, '이름'과 '사원번호'는 각자 다르게 가지고 있는지 확인한다.)
 */

public class CardIssuerPractice {

	public static void main(String[] args) {
		EmployeeCard emp1 = new EmployeeCard("제임스",1001);
		
		EmployeeCard emp2 = new EmployeeCard("앨리스",1002);

		System.out.println("emp1 소속회사: "+emp1.company);
		System.out.println("emp1 사원이름: "+emp1.name);
		System.out.println("emp1 사원번호: "+emp1.empNo);
		
		System.out.println("emp2 소속회사: "+emp2.company);
		System.out.println("emp2 사원이름: "+emp2.name);
		System.out.println("emp2 사원번호: "+emp2.empNo);
	}

}
