package ch06.sec07.exam03;

/*
 * [문제 상황 2: 회원 가입 처리 및 데이터 검증]
 * 
 * 1. 객체 생성 (회원 가입):
 *    - WebMember 설계도를 바탕으로 객체를 생성하되, 아이디는 "javaKing", 비밀번호는 "pass1234", 나이는 25를 생성자에 전달한다.
 *    - 생성된 객체를 변수(user1)에 담는다.
 * 
 * 2. 가입 정보 출력:
 *    - user1 객체 내부로 접근하여 아래와 같은 양식으로 출력한다.
 *      가입된 아이디: javaKing
 *      가입된 비밀번호: pass1234
 *      가입된 나이: 25
 */

public class MemberRegisterPractice {

	public static void main(String[] args) {
		WebMember user1 = new WebMember("javaKing","pass1234",25);
		
		System.out.println("가입된 아이디: "+user1.memberId);
		System.out.println("가입된 비밀번호: "+user1.password);
		System.out.println("가입된 나이: "+user1.age);

	}

}
