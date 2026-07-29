package ch04.sec04;

/*
 * [문제 상황 2: 신축 아파트 동호수 자동 출력 시스템]
 * 
 * 1. 요구사항: 중첩 for문을 사용하여 1층부터 3층까지, 각 층마다 1호부터 4호까지 있는 아파트의 모든 호수를 출력한다.
 * 2. 반복문 설계:
 *    - 바깥쪽 반복문은 '층(floor)'을 담당하며 1부터 3까지 1씩 증가한다.
 *    - 안쪽 반복문은 '호(room)'를 담당하며 1부터 4까지 1씩 증가한다.
 * 3. 출력 형식: 안쪽 반복문 내부에서 호수를 출력한다.
 *    (출력 예시: "101호", "102호" ... "304호")
 *    * 주의: 숫자 계산(floor * 100 + room)을 활용하거나 문자열 결합을 활용하여 정확한 호수 형태를 만들어낼 것.
 */

public class ApartmentRoomPractice {

	public static void main(String[] args) {
		int floor;
		int room;
		
		for(floor=1;floor<=3;floor++) {
			for(room=1;room<=4;room++) {
				System.out.println(floor+"0"+room+"호");
			}
		}

	}

}
