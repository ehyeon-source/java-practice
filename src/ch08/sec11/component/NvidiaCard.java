package ch08.sec11.component;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec11.component
 * - 두 클래스 모두 GraphicCard 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - NvidiaCard의 processGraphics() -> "엔비디아 그래픽 카드로 3D 그래픽을 화려하게 렌더링합니다." 출력
 * - AmdCard의 processGraphics() -> "AMD 그래픽 카드로 3D 그래픽을 부드럽게 렌더링합니다." 출력
 */
public class NvidiaCard implements GraphicCard{
	@Override
	public void processGraphics() {
		System.out.println("엔비디아 그래픽 카드로 3D 그래픽을 화려하게 렌더링합니다.");
	}
}
