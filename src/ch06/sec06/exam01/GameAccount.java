package ch06.sec06.exam01;

/*
 * [문제 상황 1: 게임 계정 설계도 제작 (필드 선언)]
 *
 * 1. 파일 생성: public class로 선언된 클래스를 생성한다.
 * 2. 필드 선언 (초기값 할당 금지): 
 *    - 문자열(String) 타입의 유저 아이디를 저장할 필드(accountId)를 선언한다.
 *    - 논리(boolean) 타입의 계정 정지 여부를 저장할 필드(isBanned)를 선언한다.
 *    - 정수(int) 타입의 보유 골드를 저장할 필드(goldBalance)를 선언한다.
 *    ※ 주의: 이 설계도에서는 절대 변수에 값을 직접 대입(초기화)하지 않고 선언만 해둔다.
 */

public class GameAccount {
	String accountId;	//내 예상 현재값 null
	boolean isBanned;	//내 예상 현재값 false
	int goldBalance;	//내 예상 현재값 0
}
