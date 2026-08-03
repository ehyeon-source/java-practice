package ch05.sec12;

/*
 * [문제 상황 2: 등급 판별 및 혜택 부여 로직]
 * 
 * 1. 변수 초기화:
 *    - Grade 열거 타입 변수(userGrade)를 선언하고, 초기값으로 아무것도 가리키지 않는 상태를 대입한다.
 *    - 정수형 변수(dbCode)를 선언하고 숫자 2를 대입한다. (서버에서 가져온 회원 식별 코드라고 가정)
 * 
 * 2. 등급 매핑 (switch문 활용):
 *    - switch문을 사용하여 dbCode의 값에 따라 userGrade 변수에 알맞은 열거 상수를 연결한다.
 *    - dbCode가 1일 때: VVIP 연결
 *    - dbCode가 2일 때: VIP 연결
 *    - dbCode가 3일 때: NORMAL 연결
 * 
 * 3. 혜택 판별 및 출력 (if-else if문 활용):
 *    - userGrade 변수가 VVIP 열거 상수와 정확히 일치하는지 비교하고, 맞다면 "VVIP 전용 라운지 입장 가능"을 출력한다.
 *    - userGrade 변수가 VIP 열거 상수와 정확히 일치하는지 비교하고, 맞다면 "VIP 10% 할인 쿠폰 발급"을 출력한다.
 *    - 그 외의 경우(NORMAL)에는 "일반 회원 포인트 적립"을 출력한다.
 */

public class GradeBenefitPractice {

	public static void main(String[] args) {
		Grade userGrade = null;
		int dbCode = 2;
		
		switch(dbCode) {
		case 1:
			userGrade = Grade.VVIP;
			break;
		case 2:
			userGrade = Grade.VIP;
			break;
		case 3:
			userGrade = Grade.NORMAL;
			break;
		}
		
		if(userGrade == Grade.VVIP) {
			System.out.println("VVIP 전용 라운지 입장 가능");
		}else if(userGrade == Grade.VIP) {
			System.out.println("VIP 10% 할인 쿠폰 발급");
		}else {
			System.out.println("일반 회원 포인트 적립");
		}

	}

}
