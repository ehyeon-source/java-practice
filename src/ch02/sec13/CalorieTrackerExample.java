package ch02.sec13;

/*
 * [문제 상황: 스마트 헬스케어 칼로리 누적 계산기]
 * 
 * 1. 준비: Scanner 객체를 생성하고, 총 누적 칼로리를 저장할 int 타입 변수(totalCalories)를 선언하여 0으로 초기화한다.
 * 2. 무한 루프 시작: while(true) 루프를 돌며 사용자에게 "섭취한 음식의 칼로리를 입력하세요 (종료하려면 'q' 입력): "라는 안내 문구를 출력한다.
 * 3. 데이터 입력 및 조건 판별: 사용자의 입력을 String 변수에 저장한다. 만약 입력된 문자열이 "q"와 같다면 break를 사용하여 무한 루프를 빠져나간다.
 * 4. 연산 및 누적: "q"가 아니라면, 입력받은 문자열을 int 타입으로 변환(Integer.parseInt)하여 totalCalories에 누적해서 더한다. 이후 "현재 누적 칼로리: [totalCalories] kcal"를 출력하고 다시 다음 입력을 기다린다.
 * 5. 프로그램 종료: 루프를 무사히 빠져나왔다면, 최종적으로 "오늘의 총 섭취 칼로리: [totalCalories] kcal"를 출력하고 Scanner 객체를 닫아 자원을 해제한다.
 */

import java.util.Scanner;

public class CalorieTrackerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalCalories = 0;
		
		while(true) {
			System.out.print("섭취한 음식의 칼로리를 입력하세요 (종료하려면 'q' 입력): ");
			String select = scanner.next();
			if(select.equals("q")) {
				break;
			}else {
				totalCalories += Integer.parseInt(select);
				System.out.println("현재 누적 칼로리: "+totalCalories+" kcal");
			}
		}
		System.out.println("오늘의 총 섭취 칼로리: "+totalCalories+" kcal");
		scanner.close();
		
	}

}
