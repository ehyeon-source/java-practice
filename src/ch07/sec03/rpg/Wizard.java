package ch07.sec03.rpg;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec03.rpg
 * - Hero 클래스를 상속받는 마법사(자식) 클래스로 선언한다.
 * 
 * [동작 요구사항]
 * - 필드 1개 추가: 마나(mp) - 정수형
 * - 생성자: 닉네임, 체력, 마나 3개를 매개변수로 모두 받는다.
 * - (가장 중요) 부모인 Hero 쪽에 기본 생성자가 없으므로, 컴파일 에러가 나지 않도록 부모가 요구하는 입맛(매개변수)에 맞춰 부모 생성자를 강제 호출(super)하여 닉네임과 체력을 위로 올려보낸다.
 * - 이후 자신의 고유 필드인 마나(mp)를 세팅하고, "자식 클래스 Wizard 객체 생성 완료!" 를 출력한다.
 */
public class Wizard extends Hero{
	int mp;
	
	Wizard(String name, int hp, int mp){
		super(name, hp);
		this.mp = mp;
		System.out.println("자식 클래스 Wizard 객체 생성 완료!");
	}
	
}
