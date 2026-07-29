package ch04.sec02;

/*
 * [문제 상황 1: 모바일 게임 아이템 확률형 뽑기 시스템]
 * 
 * 1. 난수 생성: 1부터 100까지의 정수 중 하나를 무작위로 뽑아 int 변수(drawNumber)에 저장하고 콘솔에 출력한다.
 * 2. 등급 판정: 뽑힌 숫자의 범위에 따라 아이템 등급을 결정하여 String 변수(itemGrade)에 저장한다.
 *    - 뽑힌 숫자가 1~5 인 경우: "전설(Legendary)"
 *    - 뽑힌 숫자가 6~20 인 경우: "영웅(Epic)"
 *    - 뽑힌 숫자가 21~50 인 경우: "희귀(Rare)"
 *    - 뽑힌 숫자가 51~100 인 경우: "일반(Common)"
 * 3. 결과 출력: 최종 결정된 itemGrade 값을 "획득 아이템 등급: [값]" 형태로 콘솔에 출력한다.
 */

public class GachaSystemPractice {

	public static void main(String[] args) {
		int drawNumber = (int)(Math.random()*100)+1;	//코드 짤 때 random 문법 까먹어서 찾아 풀었으니 다음부터 주의! 
		System.out.println("drawNumber: "+drawNumber);
		
		String itemGrade;
		
		if(drawNumber <= 5) {
			itemGrade = "Lengendary";
		}else if(drawNumber <= 20){
			itemGrade = "Epic";
		}else if(drawNumber <= 50){
			itemGrade = "Rare";
		}else {
			itemGrade = "Common";
		}
		
		System.out.println("획득 아이템 등급: "+itemGrade);
		
	}

}
