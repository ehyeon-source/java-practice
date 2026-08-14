package ch07.sec09.shelter;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec09.shelter
 * 
 * [동작 요구사항]
 * - main 메서드 밖에, 동물을 돌보는 정적 메서드(static void care(Animal animal))를 하나 선언한다.
 * - care 메서드 내부 로직:
 *   1. 일단 들어온 동물에게 공통 기능인 eat()을 지시한다.
 *   2. (가장 중요) 방금 들어온 동물의 진짜 본체가 고양이인지 강아지인지 안전하게 검사한다.
 *   3. 만약 고양이라면, 고양이로 폼을 되돌려(다운캐스팅) groom()을 실행시킨다.
 *   4. 만약 강아지라면, 강아지로 폼을 되돌려(다운캐스팅) fetch()를 실행시킨다.
 * 
 * - main 메서드 내부 로직:
 *   1. Cat 객체를 하나 생성하여 care() 메서드에 집어넣는다.
 *   2. Dog 객체를 하나 생성하여 care() 메서드에 집어넣는다.
 */
public class ShelterApp {
	public static void main(String[] args) {
		care(new Cat());
		care(new Dog());
	}
	static void care(Animal animal) {
		animal.eat();
		if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.groom();
		}else if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.fetch();
		}
	}
}
