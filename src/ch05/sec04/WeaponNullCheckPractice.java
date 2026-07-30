package ch05.sec04;

/*
 * [문제 상황: 게임 캐릭터 무기 장착 및 해제 시스템]
 * 
 * 1. 데이터 준비:
 *    - String 변수(mainWeapon)를 선언하고 "전설의 검"을 할당(생성)한다.
 *    - String 변수(subWeapon)를 선언하고 mainWeapon의 참조값을 대입(공유)한다.
 * 2. 무기 해제 및 가비지 컬렉션(GC) 방어:
 *    - mainWeapon에 null을 할당하여 메인 무기 장착을 해제한다. 
 *      (하지만 subWeapon이 여전히 참조하고 있으므로 "전설의 검" 객체는 메모리에서 지워지지 않음)
 * 3. NullPointerException 방어 로직 (if-else문 활용):
 *    - mainWeapon이 null과 '같지 않은지(!=)' 검사한다.
 *      - null이 아니면: "메인 무기 이름 길이: " + mainWeapon.length() 출력
 *      - null이면: "메인 무기가 장착 해제되어 사용할 수 없습니다." 출력
 *    - subWeapon이 null과 '같지 않은지(!=)' 검사한다.
 *      - null이 아니면: "서브 무기 이름 길이: " + subWeapon.length() 출력
 *      - null이면: "서브 무기가 없습니다." 출력
 * 4. 검증: mainWeapon은 예외(에러) 없이 해제 메시지가 출력되어야 하고, subWeapon은 무사히 "전설의 검"의 글자 수(5)를 출력해야 한다.
 */

public class WeaponNullCheckPractice {

	public static void main(String[] args) {
		String mainWeapon = "전설의 검";
		String subWeapon = mainWeapon;
		
		mainWeapon = null;
		
		if(mainWeapon!=null) {
			System.out.println("메인 무기 이름 길이: " + mainWeapon.length());
		}else {
			System.out.println("메인 무기가 장착 해제되어 사용할 수 없습니다.");
		}
		
		if(subWeapon!=null) {
			System.out.println("서브 무기 이름 길이: " + subWeapon.length());
		}else {
			System.out.println("서브 무기가 없습니다.");
		}
		

	}

}
