package ch03.sec09;

/*
 * [문제 상황: 2D 게임 그래픽 엔진의 픽셀 색상 데이터 분리 및 조작]
 * 
 * 1. 픽셀 데이터 준비: 하나의 픽셀 색상 및 투명도 정보를 담고 있는 int 변수(pixelData)에 287454020을 할당한다. 
 *    (이 값은 내부적으로 1바이트씩 Alpha, Red, Green, Blue 총 4개의 채널로 쪼개져서 합쳐진 값이다.)
 * 2. 색상 채널 분리: pixelData에서 각각의 1바이트 데이터를 추출하여 부호 없는 양수 정수(int) 형태로 alpha, red, green, blue 변수에 각각 저장한다.
 * 3. 밝기 조절 (산술 연산자 금지): 분리된 red 값에 8을 곱한 결과를 int 변수(brightenedRed)에 저장하고, 분리된 blue 값을 4로 나눈 결과를 int 변수(dimmedBlue)에 저장한다. 
 *    (단, 산술 연산자(*, /) 및 Math.pow() 메서드는 절대 사용할 수 없으며 다른 방식의 연산을 사용해야 한다.)
 * 4. 결과 출력: alpha, red, green, blue, brightenedRed, dimmedBlue의 값을 각각 콘솔에 출력한다.
 */

public class BitShiftPractice {

	public static void main(String[] args) {
		int pixelData = 287454020;
		
		int alpha = (pixelData>>24)&255;
		int red = (pixelData>>16)&255;
		int green = (pixelData>>8)&255;
		int blue = pixelData&255;
		
		int brightenedRed = red<<3;
		int dimmedBlue = blue>>2;
		
		System.out.println("alpha: "+alpha);
		System.out.println("red: "+red);
		System.out.println("green: "+green);
		System.out.println("blue: "+blue);
		System.out.println("brightenedRed: "+brightenedRed);
		System.out.println("dimmedBlue: "+dimmedBlue);
	}

}
