package ch07.sec11.agency;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec11.agency
 * 
 * [테스트 순서 및 요구사항]
 * - Solo, Group, SubUnit 객체를 각각 생성하고, 각 객체의 perform() 메서드를 호출하여 정상 작동하는지 확인한다.
 */
public class AgencyApp {
	public static void main(String[] args) {
		Solo s = new Solo();
		Group g = new Group();
		SubUnit su = new SubUnit();
		
		s.perform();
		g.perform();
		su.perform();
	}

}
