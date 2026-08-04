package ch06.sec11.exam01;

/*
 * [가동 조건]
 * - BankAccount 객체를 생성하고, 요구사항에 맞춰 값을 변경해 본 뒤 결과를 출력한다.
 * 
 * [입력 데이터 및 순서]
 * 1. 계좌번호 "111-222-3333", 예금주명 "김코딩"으로 객체를 생성한다.
 * 2. 예금주명을 "이개발"로 변경(재할당)한다.
 * 3. 출력 결과와 같이 세 필드의 값을 순서대로 모두 출력한다.
 * 
 * [기대되는 정확한 출력 결과]
 * 은행명: JavaBank
 * 계좌번호: 111-222-3333
 * 예금주명: 이개발
 */

public class BankPractice {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("111-222-3333","김코딩");
		acc.name = "이개발";
		
		System.out.println("은행명: "+acc.bankName);
		System.out.println("계좌번호: "+acc.num);
		System.out.println("예금주명: "+acc.name);
	}

}
