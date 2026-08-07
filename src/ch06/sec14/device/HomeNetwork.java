package ch06.sec14.device;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec14.device
 * - SmartTV 객체를 생성하여, 전원과 볼륨이 완벽하게 맞물려 돌아가는지 테스트한다.
 * 
 * [테스트 순서 및 기대되는 정확한 출력 결과]
 * // 기본적으로 객체를 생성하면 boolean은 false, int는 0으로 초기화됨
 * 
 * 1. TV가 꺼진 상태에서 볼륨을 20으로 올려본다. -> 문지기에게 차단당해야 함
 * System.out.println("TV 켜짐: " + tv.isPower() + " / 볼륨: " + tv.getVolume());
 * // 기대 출력: TV 켜짐: false / 볼륨: 0
 * 
 * 2. TV 전원을 켠(true) 뒤, 볼륨을 20으로 올려본다. -> 성공해야 함
 * System.out.println("TV 켜짐: " + tv.isPower() + " / 볼륨: " + tv.getVolume());
 * // 기대 출력: TV 켜짐: true / 볼륨: 20
 * 
 * 3. 다시 TV 전원을 끈다(false). -> 볼륨도 같이 0으로 연동되어 떨어져야 함
 * System.out.println("TV 켜짐: " + tv.isPower() + " / 볼륨: " + tv.getVolume());
 * // 기대 출력: TV 켜짐: false / 볼륨: 0
 */

public class HomeNetwork {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		tv.setVolume(20);
		System.out.println("TV 켜짐: " + tv.isPower() + " / 볼륨: " + tv.getVolume());
		
		tv.setPower(true);
		tv.setVolume(20);
		System.out.println("TV 켜짐: " + tv.isPower() + " / 볼륨: " + tv.getVolume());
		
		tv.setPower(false);
		System.out.println("TV 켜짐: " + tv.isPower() + " / 볼륨: " + tv.getVolume());
	}

}
