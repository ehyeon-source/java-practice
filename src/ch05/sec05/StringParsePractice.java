package ch05.sec05;

/*
 * [문제 상황 1: 회원가입 CSV 데이터 파싱 및 검증]
 * 
 * 1. 초기 데이터: String 변수(csvData)에 "1001,홍길동,,2026" 을 할당한다.
 * 2. 데이터 분리: 쉼표(,)를 기준으로 데이터를 쪼개어 배열에 담는다.
 * 3. 검증 로직 1: 쪼개진 데이터의 총개수(배열의 크기)가 4개인지 확인한다.
 *    - 4개가 맞다면 "데이터 개수 정상"을 출력한다.
 * 4. 검증 로직 2: 세 번째 데이터(인덱스 2)의 내용물이 텅 빈 문자열인지 확인한다. (객체 자체는 존재하지만 글자가 없는 상태를 검증할 것)
 *    - 내용물이 비어있다면 "3번째 항목 누락 발생"을 출력하고, 비어있지 않다면 해당 데이터를 그대로 출력한다.
 */

public class StringParsePractice {
	public static void main(String[] args) {
		String csvData = "1001,홍길동,,2026";
		
		String[] temp = csvData.split(",");
		
		if(temp.length==4) System.out.println("데이터 개수 정상");
		
		if(temp[2].equals("")) {
			System.out.println("3번째 항목 누락 발생");
		}else {
			System.out.println(temp[2]);
		}

	}

}
