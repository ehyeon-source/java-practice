package ch04.sec06;

/*
 * [문제 상황: 비밀 금고 잠금 해제 시스템]
 * 
 * 1. 데이터 준비: 사용자의 입력을 받을 Scanner 객체를 생성한다.
 *    사용자가 입력한 비밀번호를 저장할 String 변수(inputPassword)를 선언한다.
 * 2. 잠금 해제 시도 (반드시 do-while문 활용):
 *    - 루프 내부에서 먼저 "비밀번호를 입력하세요: "를 콘솔에 출력하고, 사용자의 문자열 입력을 받아 inputPassword에 저장한다.
 *    - 입력받은 비밀번호가 "java123"이 '아닐' 동안 계속해서 루프를 반복한다. (즉, 틀린 비밀번호를 입력하면 계속 다시 물어봄)
 * 3. 결과 출력: 사용자가 "java123"을 정확히 입력하여 루프를 탈출하면, "금고가 열렸습니다!"를 출력하고 Scanner를 닫아준다.
 */

import java.util.Scanner;
public class SafeUnlockPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputPassword;
		
		do {
			System.out.print("비밀번호를 입력하세요: ");
			inputPassword = scanner.nextLine();
		}while(!inputPassword.equals("java123"));
		
		System.out.println("금고가 열렸습니다!");
		scanner.close();
	}

}
