package ch08.sec11.media;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec11.media
 * 
 * [동작 요구사항]
 * - 반환값이 없는 playMedia() 메서드를 선언한다.
 * - (중요) 이 메서드는 Playable 타입의 매개변수를 하나 받도록 선언한다.
 * - 메서드 내부 로직: 매개변수로 전달받은 객체의 play() 메서드를 호출한다.
 */
public class MediaPlayer {
	void playMedia(Playable p) {
		p.play();
	}
}
