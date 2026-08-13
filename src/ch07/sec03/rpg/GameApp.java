package ch07.sec03.rpg;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec03.rpg
 * - Wizard 객체를 하나 생성한다. (닉네임: "간달프", 체력: 100, 마나: 500)
 * - 객체 생성이 끝난 후, 부모에게 물려받은 필드(닉네임, 체력)와 자신의 필드(마나)가 모두 정상적으로 세팅되었는지 각각 출력하여 확인한다.
 */
public class GameApp {
	public static void main(String[] args) {
		Wizard w = new Wizard("간달프", 100, 500);
		System.out.println("w name: "+w.name);
		System.out.println("w hp: "+w.hp);
		System.out.println("w mp: "+w.mp);

	}

}
