package ch04.sec05;

/*
 * [문제 상황 1: 스마트 홈 보일러 온도 조절 시스템]
 * 
 * 1. 데이터 준비: 현재 온도를 나타내는 int 변수(temperature)를 22로 초기화한다.
 *    시스템의 켜짐/꺼짐 상태를 관리할 boolean 변수(powerOn)를 true로 초기화한다.
 *    사용자의 입력을 받을 Scanner 객체를 생성한다.
 * 2. 온도 조절 무한 루프 (while문과 boolean 변수 활용):
 *    - 루프가 시작될 때마다 아래의 메뉴를 콘솔에 출력한다.
 *      "메뉴: 1.온도 올림 | 2.온도 내림 | 3.시스템 종료"
 *    - 사용자로부터 문자열을 입력받아 판별한다.
 *      - "1"을 입력받으면: 온도를 1도 올리고 "현재 온도: [temperature]도" 출력
 *      - "2"을 입력받으면: 온도를 1도 내리고 "현재 온도: [temperature]도" 출력
 *      - "3"을 입력받으면: powerOn 변수를 false로 변경하여 루프를 탈출
 * 3. 시스템 종료: 루프를 완전히 빠져나온 후, "시스템을 종료합니다."를 출력하고 Scanner를 닫아준다.
 */

import java.util.Scanner;

public class SmartBoilerPractice {

	public static void main(String[] args) {
		int temperature = 22;
		boolean powerOn = true;
		Scanner scanner = new Scanner(System.in);
		
		while(powerOn) {
			System.out.println("메뉴: 1.온도 올림 | 2.온도 내림 | 3.시스템 종료");
			String temp = scanner.nextLine();
			switch(temp) {
			case "1":
				temperature++;
				System.out.println("현재 온도: "+temperature+"도");
				break;
			case "2":
				temperature--;
				System.out.println("현재 온도: "+temperature+"도");
				break;
			case "3":
				powerOn=false;
			}
		}
		
		System.out.println("시스템을 종료합니다.");
		scanner.close();

	}

}
