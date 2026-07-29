package ch04.sec07;

/*
 * [문제 상황: 영화관 특정 예약 좌석 탐색 시스템]
 * 
 * 1. 반복문 설계 (중첩 for문 및 레이블(Label) 활용):
 *    - 바깥쪽 반복문은 좌석의 '열(row)'을 담당하며, char 변수 'A'부터 'C'까지 순차적으로 증가한다.
 *      (바깥쪽 반복문에는 반드시 'Search'라는 이름의 레이블을 붙일 것)
 *    - 안쪽 반복문은 열별 '좌석 번호(seatNum)'를 담당하며, int 변수 1부터 5까지 1씩 증가한다.
 * 2. 탐색 로직:
 *    - 안쪽 반복문이 돌 때마다 콘솔에 "좌석 확인 중: [row]-[seatNum]"을 출력한다. (예: 좌석 확인 중: A-1)
 *    - 만약 현재 확인 중인 좌석이 'B'열의 '3'번 좌석이라면(조건문), 
 *      "예약된 좌석 B-3을 찾았습니다!"를 출력하고, 'Search' 레이블을 이용해 중첩 반복문을 '완전히' 탈출한다.
 * 3. 결과 출력: 반복문을 완전히 빠져나온 후, 마지막에 "탐색 종료"를 출력한다.
 */

public class SeatSearchPractice {

	public static void main(String[] args) {
	
		Search: for(char row='A';row<='C';row++) {
			for(int seatNum=1;seatNum<=5;seatNum++) {
				System.out.println("좌석 확인 중: "+row+"-"+seatNum);
				if(row=='B'&&seatNum==3) {
					System.out.println("예약된 좌석 B-3을 찾았습니다!");
					break Search;
				}
			}
		}
		System.out.println("탐색 종료");
	}

}
