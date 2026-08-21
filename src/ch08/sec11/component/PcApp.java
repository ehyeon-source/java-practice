package ch08.sec11.component;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec11.component
 * 
 * [테스트 순서 및 요구사항]
 * 1. GamingPC 객체를 생성한다.
 * 2. playGame()을 호출하여 기본 장착된 그래픽 카드의 성능을 확인한다.
 * 3. PC의 그래픽 카드(vga 필드)를 AmdCard 객체로 교체한다.
 * 4. 다시 playGame()을 호출하여, PC 클래스의 수정 없이 부품 교체만으로 실행 결과가 달라지는 다형성을 확인한다.
 */
public class PcApp {
	public static void main(String[] args) {
		GamingPC pc = new GamingPC();
		
		pc.playGame();
		
		pc.vga = new AmdCard();
		
		pc.playGame();

	}

}
