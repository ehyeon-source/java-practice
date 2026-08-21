package ch08.sec09.device;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec09.device
 * - SmartPhone 인터페이스를 구현(implements)하는 클래스.
 * 
 * [동작 요구사항]
 * - 상속 구조에 의해 누적된 총 3개의 추상 메서드를 모두 오버라이딩한다.
 * - call() -> "갤럭시 폰으로 전화를 겁니다." 출력
 * - playMusic() -> "갤럭시 폰으로 음악을 재생합니다." 출력
 * - runApp() -> "갤럭시 폰에서 앱을 실행합니다." 출력
 */
public class GalaxyPhone implements SmartPhone{
	@Override
	public void call() {
		System.out.println("갤럭시 폰으로 전화를 겁니다.");
	}
	
	@Override
	public void playMusic() {
		System.out.println("갤럭시 폰으로 음악을 재생합니다.");
	}
	
	@Override
	public void runApp() {
		System.out.println("갤럭시 폰에서 앱을 실행합니다.");
	}
}
