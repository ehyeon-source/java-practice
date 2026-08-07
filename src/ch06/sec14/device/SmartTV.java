package ch06.sec14.device;

/*
 * [핵심 조건]
 * - 패키지명: ch06.sec14.device
 * - SmartTV 클래스를 설계한다.
 * 
 * [동작 요구사항]
 * - 필드: 전원 상태(power)를 논리형(boolean)으로, 볼륨(volume)을 정수형(int)으로 선언하되 둘 다 철저히 은닉한다.
 * 
 * - Getter:
 *   1. 전원 상태(power)를 반환하는 메서드는 자바의 boolean 관례(is~ 형식)에 맞춰서 이름을 짓고 개방한다.
 *   2. 볼륨(volume)을 반환하는 메서드도 개방한다.
 * 
 * - Setter:
 *   1. 전원 조절 문지기 (setPower): 전원을 끄는 신호(false)가 들어오면, 전원 상태를 끄면서 동시에 볼륨(volume)도 0으로 초기화해 버린다. (TV가 꺼지면 소리도 나면 안 되니까!)
 *   2. 볼륨 조절 문지기 (setVolume): '현재 TV 전원이 켜져 있을 때(true)만' 외부에서 들어온 값으로 볼륨을 변경해 준다. TV가 꺼져 있다면 아무리 볼륨을 높이려 해도 무시(차단)한다.
 */

public class SmartTV {
	private boolean power;
	private int volume;
	
	public boolean isPower() {
		return power;
	}
	public int getVolume() {
		return volume;
	}
	
	public void setPower(boolean power) {
		this.power = power;
		if(power==false) {	//AI왈 세련된 더 좋은코드 if(!power) 상습적으로 또 내가 까먹음
			volume=0;
		}
	}
	public void setVolume(int volume) {
		if(power==true) { //AI왈 세련된 더 좋은코드 if(power) 상습적으로 또 내가 까먹음
			this.volume=volume;
		}
	}
}
