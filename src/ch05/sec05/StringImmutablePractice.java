package ch05.sec05;

/*
 * [문제 상황 3: 보안 문서 필터링 및 참조 완전성 검증]
 * 
 * 1. 초기 데이터: String 변수(doc1)에 "보안문서: 해당 프로젝트는 파기되어야 합니다." 를 할당한다.
 * 2. 문서 변환: doc1에서 "파기"라는 단어를 "보류"로 바꾼 결과를 새로운 String 변수(doc2)에 저장한다.
 * 3. 메모리 독립성 증명: doc1과 doc2가 메모리상에서 '같은 곳'을 가리키는지 연산자를 통해 비교한다.
 *    - "doc1과 doc2 참조 비교: [비교결과 true/false]" 형태로 출력한다. 
 *    - (String은 내용이 바뀌면 아예 새로운 객체를 뱉어낸다는 점을 스스로 증명할 것)
 * 4. 내용 동일성 증명: 
 *    - 완전히 새로운 메모리 공간을 확보하는 키워드를 사용하여 "보안문서: 해당 프로젝트는 보류되어야 합니다."를 담은 String 변수(doc3)를 생성한다.
 *    - doc2와 doc3가 가리키는 주소는 신경 쓰지 말고, '내부 문자열 내용 자체'가 완벽히 똑같은지를 검증하는 로직을 사용한다.
 *    - "doc2와 doc3 내용 비교: [비교결과 true/false]" 형태로 출력한다.
 */

public class StringImmutablePractice {

	public static void main(String[] args) {
		String doc1 = "보안문서: 해당 프로젝트는 파기되어야 합니다.";
		
		String doc2 = doc1.replace("파기", "보류");
		
		boolean result1 = doc1 == doc2;
		System.out.println("doc1과 doc2 참조 비교: "+result1);	//내 예상 false
		
		String doc3 = new String("보안문서: 해당 프로젝트는 보류되어야 합니다.");
		boolean result2 = doc2.equals(doc3);
		System.out.println("doc2와 doc3 내용 비교:: "+result2);	//내 예상 true
		

	}

}
