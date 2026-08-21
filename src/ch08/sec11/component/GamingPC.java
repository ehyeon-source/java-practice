package ch08.sec11.component;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec11.component
 * 
 * [동작 요구사항]
 * - GraphicCard 타입의 필드(변수명: vga)를 선언하고, 기본값으로 NvidiaCard 객체를 연결해 둔다.
 * - 반환값과 매개변수가 없는 playGame() 메서드를 선언한다.
 *   -> 내부 로직: "게임을 시작합니다." 출력 후, vga 필드를 활용해 그래픽 처리 메서드를 호출한다.
 */
public class GamingPC {
	GraphicCard vga = new NvidiaCard();
	
	void playGame() {
		System.out.println("게임을 시작합니다.");
		vga.processGraphics();
	}
}
