package ch06.sec15.office;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec15.office
 * - 김사원(emp1)과 이대리(emp2)가 각각 프린터를 사용하려고 한다.
 * 
 * [테스트 순서 및 기대되는 동작]
 * 1. new 키워드로 SharedPrinter 객체를 직접 생성하려고 시도해 보고, 에러(차단)가 발생하는 코드를 주석으로 묶어둔다.
 * 2. 싱글톤의 정적 메서드를 호출하여 프린터 객체를 두 개(emp1Printer, emp2Printer) 얻어온다.
 * 3. emp1Printer로 "주간업무보고서"를 출력하는 메서드를 호출한다.
 * 4. emp2Printer로 "결산내역서"를 출력하는 메서드를 호출한다.
 * 5. 조건문(==)을 사용해 emp1Printer와 emp2Printer가 진짜로 같은 프린터 본체(객체)인지 확인하는 문자열을 출력한다.
 */

public class EmployeeApp {

	public static void main(String[] args) {
		//SharedPrinter emp1 = new SharedPrinter();
		//SharedPrinter emp2 = new SharedPrinter();
		
		SharedPrinter emp1Printer = SharedPrinter.getInstance();
		SharedPrinter emp2Printer = SharedPrinter.getInstance();
		
		emp1Printer.printDocument("주간업무보고서");
		emp2Printer.printDocument("결산내역서");
		
		System.out.println(emp1Printer==emp2Printer);	//내 예상 true
	}

}
