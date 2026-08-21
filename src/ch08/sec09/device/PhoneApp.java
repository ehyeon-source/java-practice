package ch08.sec09.device;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec09.device
 * 
 * [테스트 순서 및 요구사항]
 * 1. GalaxyPhone 객체를 생성하여 자식 인터페이스인 SmartPhone 타입 변수에 대입한다.
 * 2. 이 변수를 통해 통화, 음악 재생, 앱 실행 3가지 메서드를 모두 호출해 본다.
 * 3. 동일한 객체를 부모 인터페이스인 Callable 타입 변수에 대입한다. (별도의 생성 없이 변수만 갈아끼우거나 강제 타입 변환 등 자유롭게 활용)
 * 4. 이 변수를 통해 call()을 호출해 보고, runApp()을 호출하려고 하면 어떻게 되는지 주석으로 남긴다.
 */
public class PhoneApp {
	public static void main(String[] args) {
		SmartPhone sp = new GalaxyPhone();
		
		sp.call();
		sp.playMusic();
		sp.runApp();
		
		Callable c = sp;
		c.call();
		//c.runApp(); 참조타입변수가 부모인 Callable 이기에 자식에 있는 메소드를 사용할 수 없다. 
	}

}
