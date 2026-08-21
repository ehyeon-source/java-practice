package ch08.sec11.media;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec11.media
 * - 두 클래스 모두 Playable 인터페이스를 구현한다.
 * 
 * [동작 요구사항]
 * - AudioFile의 play() -> "음원 파일을 재생합니다." 출력
 * - VideoFile의 play() -> "영상 파일을 재생합니다." 출력
 */
public class VideoFile implements Playable{
	@Override
	public void play() {
		System.out.println("영상 파일을 재생합니다.");
	}
}
