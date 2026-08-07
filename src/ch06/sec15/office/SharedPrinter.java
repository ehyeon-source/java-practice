package ch06.sec15.office;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec15.office
 * - 이 클래스를 완벽한 '싱글톤 패턴'으로 설계한다. (인스턴스 생성, 생성자 잠금, 반환 메서드 구현)
 * 
 * [동작 요구사항]
 * - 싱글톤 패턴의 뼈대 외에 다음 기능을 추가한다.
 * - 메서드: `printDocument(String docName)` 
 *   - 기능: "프린터가 [문서이름]을(를) 출력합니다." 라는 메시지를 화면에 찍는 메서드를 하나 개방해 둔다.
 */

public class SharedPrinter {
	private static SharedPrinter printer = new SharedPrinter();
	
	private SharedPrinter() {
	}
	
	public static SharedPrinter getInstance() {
		return printer;
	}
	
	void printDocument(String docName) {
		System.out.println("프린터가 "+docName+"을(를) 출력합니다.");
	}
	
	
}
