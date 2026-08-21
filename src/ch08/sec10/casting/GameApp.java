package ch08.sec10.casting;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec10.casting
 * 
 * [테스트 순서 및 요구사항]
 * 1. Role 타입의 변수에 Wizard 객체를 대입한다.
 * 2. 이 변수를 통해 attack()을 호출한다. (이때 고유 메서드인 castSpell()을 호출하면 어떻게 되는지 주석으로 짤막하게 남긴다.)
 * 3. 강제 타입 변환(Casting)을 사용하여 이 객체를 다시 Wizard 타입 변수에 담아낸다.
 * 4. 변환된 변수를 통해 attack()과 고유 메서드 castSpell()을 차례대로 호출하여 정상 작동을 확인한다.
 */
public class GameApp {
	public static void main(String[] args) {
		Role r = new Wizard();
		
		r.attack();
		//r.castSpell();	인터페이스인 참조타입변수에 있는 메소드만 사용이 가능
		
		Wizard wizard = (Wizard)r;
		
		wizard.attack();
		wizard.castSpell();
	}

}
