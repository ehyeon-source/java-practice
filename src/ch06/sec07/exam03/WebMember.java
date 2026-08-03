package ch06.sec07.exam03;

/*
 * [문제 상황 1: 웹 회원 설계도 제작 및 this 키워드 적용]
 *
 * 1. 필드 선언:
 *    - 문자열(String) 타입의 회원 아이디 필드(memberId)를 선언한다.
 *    - 문자열(String) 타입의 비밀번호 필드(password)를 선언한다.
 *    - 정수(int) 타입의 회원 나이 필드(age)를 선언한다.
 * 
 * 2. 생성자 선언:
 *    - 세 개의 필드 데이터를 모두 전달받아 초기화할 수 있는 생성자를 선언한다.
 *    - (핵심) 생성자의 매개변수 3개의 이름은 반드시 필드명과 100% 동일하게 작성한다. (memberId, password, age)
 *    - 생성자 내부({})에서 `this` 키워드를 사용하여, 전달받은 매개변수의 값을 객체의 필드에 각각 정확하게 대입하는 코드를 작성한다.
 */

public class WebMember {
	String memberId;
	String password;
	int age;
	
	WebMember(String memberId, String password, int age){
		this.memberId = memberId;	//this 는 자기자신을 가르키는 것
		this.password = password;
		this.age = age;
	}
}
