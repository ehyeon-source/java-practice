package ch07.sec03.rpg;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec03.rpg
 * - 모든 직업의 기본이 되는 부모 클래스(영웅)를 설계한다.
 * 
 * [동작 요구사항]
 * - 필드 2개 선언 (접근 제한 없이 개방): 닉네임(name) - 문자열, 체력(hp) - 정수형
 * - 생성자: 닉네임과 체력을 매개변수로 받아 필드에 세팅하는 생성자를 선언한다. (주의: 매개변수가 없는 기본 생성자는 절대 만들지 않는다!)
 * - 생성자 내부에서 "부모 클래스 Hero 객체 생성 완료!" 를 출력한다.
 */
public class Hero {
	public String name;
	public int hp;
	
	Hero(String name, int hp){
		this.name = name;
		this.hp = hp;
		System.out.println("부모 클래스 Hero 객체 생성 완료!");
	}
}
