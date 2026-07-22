package ch02.sec03;

/*
 * [문제 상황: 요원의 비밀 단어 해독]
 * 
 * 1. 본부로부터 4글자로 된 비밀 영단어의 단서가 도착했다.
 * 2. 첫 번째 글자의 단서는 유니코드 정수값 74, 두 번째 글자의 단서는 유니코드 정수값 65이다. 이를 각각 독립된 char 변수에 정수 형태로 할당한다.
 * 3. 세 번째 글자의 단서는 문자 'V', 네 번째 글자의 단서는 문자 'A'이다. 이를 각각 독립된 char 변수에 문자 리터럴 형태로 할당한다.
 * 4. 4개의 char 변수를 조합하여 해독된 전체 단어가 무엇인지 콘솔에 '한 줄로 이어서' 출력한다.
 */

public class SecretCodeExample {

	public static void main(String[] args) {
		char firstWord = 74;
		char secondWord = 65;
		
		char thirdWord = 'V';
		char fourthWord = 'A';
		
		System.out.println(firstWord+""+secondWord+""+thirdWord+""+fourthWord);
		//char 도 엄연한 정수이기에 char 변수끼리 + 연산이 되어버리는 경우 방지하려고 "" 넣음
		
		

	}

}
