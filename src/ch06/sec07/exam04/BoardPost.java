package ch06.sec07.exam04;

/*
 * [문제 상황 1: 게시글 설계도 제작 및 생성자 오버로딩]
 *
 * 1. 필드 선언:
 *    - 문자열(String) 타입의 제목 필드(title)를 선언한다.
 *    - 문자열(String) 타입의 내용 필드(content)를 선언한다.
 *    - 문자열(String) 타입의 작성자 필드(writer)를 선언하고, 기본값으로 "익명"을 대입해 둔다.
 * 
 * 2. 생성자 오버로딩 (총 4개 작성, this 키워드 활용):
 *    - 생성자 ①: 매개변수가 없는 기본 생성자 (중괄호 내부 비워둠)
 *    - 생성자 ②: 제목(title) 하나만 매개변수로 받는 생성자
 *    - 생성자 ③: 제목(title)과 내용(content) 두 개를 매개변수로 받는 생성자
 *    - 생성자 ④: 제목(title), 내용(content), 작성자(writer) 세 개를 모두 매개변수로 받는 생성자
 */

public class BoardPost {
	String title;
	String content;
	String writer = "익명";
	
	BoardPost(){
	}
	
	BoardPost(String title){
		this.title = title;
	}
	
	BoardPost(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	BoardPost(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
}
