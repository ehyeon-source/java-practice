package ch06.sec07.exam04;

/*
 * [문제 상황 2: 다양한 생성자를 활용한 게시글 등록]
 * 
 * 1. 객체 생성 (4가지 방식):
 *    - post1: 매개변수 없는 생성자로 객체 생성
 *    - post2: "공지사항" 이라는 제목만 전달하여 객체 생성
 *    - post3: "가입인사", "반갑습니다!" 두 개의 값을 전달하여 객체 생성
 *    - post4: "질문있습니다", "자바 오버로딩 재밌네요", "자바킹" 세 개의 값을 전달하여 객체 생성
 * 
 * 2. 데이터 확인 (출력):
 *    - 각 post1, post2, post3, post4 객체에 접근하여 내부의 title, content, writer 값이 각각 어떻게 세팅되었는지(혹은 null로 비어있는지) 자유로운 양식으로 출력하여 확인한다.
 */

public class PostManagerPractice {

	public static void main(String[] args) {
		
		BoardPost post1 = new BoardPost();
		
		BoardPost post2 = new BoardPost("공지사항");
		
		BoardPost post3 = new BoardPost("가입인사","반갑습니다!");
		
		BoardPost post4 = new BoardPost("질문있습니다","자바 오버로딩 재밌네요","자바킹");
		
		System.out.println("post1: "+post1.title+" "+post1.content+" "+post1.writer);
		System.out.println("post2: "+post2.title+" "+post2.content+" "+post2.writer);
		System.out.println("post3: "+post3.title+" "+post3.content+" "+post3.writer);
		System.out.println("post4: "+post4.title+" "+post4.content+" "+post4.writer);

	}

}
