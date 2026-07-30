package ch05.sec08;

/*
 * [문제 상황: 닉네임 중복 검사 및 메모리 참조 분석]
 * 
 * 1. 배열 생성: 크기가 3인 문자열 배열(nicknames)을 생성한다.
 * 2. 데이터 할당:
 *    - 첫 번째 칸(인덱스 0)에 "플레이어1" 이라는 문자열을 대입한다.
 *    - 두 번째 칸(인덱스 1)에 "플레이어1" 이라는 문자열을 대입한다.
 *    - 세 번째 칸(인덱스 2)에 "플레이어1" 이라는 문자열을 대입하되, 기존 메모리를 공유하지 않고 완전히 독립된 새로운 메모리 공간을 강제로 할당받는 방식을 사용하여 대입한다.
 * 3. 참조 및 내용 비교 (출력):
 *    - 첫 번째 칸과 두 번째 칸이 메모리상에서 '완전히 동일한 주소'를 가리키는지 비교하고 그 결과(boolean)를 출력한다. (예상 결과: true)
 *    - 첫 번째 칸과 세 번째 칸이 '완전히 동일한 주소'를 가리키는지 비교하고 그 결과(boolean)를 출력한다. (예상 결과: false)
 *    - 첫 번째 칸과 세 번째 칸의 주소가 비록 다르더라도, '내부 문자열의 내용 자체'는 완벽히 똑같은지 깐깐하게 검증하는 로직을 사용하여 비교하고 그 결과(boolean)를 출력한다. (예상 결과: true)
 */

public class ArrayReferencePractice {

	public static void main(String[] args) {
		String[] nicknames = new String[3];
		
		nicknames[0] = "플레이어1";
		nicknames[1] = "플레이어1";
		nicknames[2] = new String("플레이어1");
		
		boolean index0to1 = nicknames[0]==nicknames[1];
		System.out.println(index0to1);
		
		boolean index0to2 = nicknames[0]==nicknames[2];
		System.out.println(index0to2);
		
		System.out.println(nicknames[0].equals(nicknames[2]));
	}

}
