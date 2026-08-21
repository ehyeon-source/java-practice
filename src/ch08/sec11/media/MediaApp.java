package ch08.sec11.media;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec11.media
 * 
 * [테스트 순서 및 요구사항]
 * 1. MediaPlayer 객체를 생성한다.
 * 2. AudioFile 객체와 VideoFile 객체를 각각 생성한다.
 * 3. MediaPlayer 객체의 playMedia() 메서드를 호출하되, 매개값으로 AudioFile과 VideoFile 객체를 번갈아 전달하여 '매개변수의 다형성'이 정상 작동하는지 확인한다.
 */
public class MediaApp {
	public static void main(String[] args) {
		MediaPlayer mp = new MediaPlayer();
		
		AudioFile af = new AudioFile();
		VideoFile vf = new VideoFile();
		
		mp.playMedia(af);
		mp.playMedia(vf);
	}

}
