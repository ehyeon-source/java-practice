package ch05.sec05;

/*
 * [문제 상황: 서버 접속 로그에서 순수 유저 ID만 정밀 추출하기]
 * 
 * 1. 초기 데이터: String 변수(logData)에 "[GUEST_java_master] has entered the room." 을 할당한다.
 * 2. 시작 기호 찾기: 해당 문자열에서 언더스코어('_') 기호가 위치한 곳의 번호(인덱스)를 찾아서 int 변수에 저장한다.
 *    (주의: indexOf는 맨 처음 발견되는 기호의 위치만 찾아줍니다. 즉, 'GUEST' 뒤에 있는 첫 번째 '_'의 위치를 찾게 됩니다.)
 * 3. 종료 기호 찾기: 문자열에서 닫는 대괄호(']') 기호가 위치한 곳의 번호를 찾아서 int 변수에 저장한다.
 * 4. 정밀 추출 로직: 
 *    - 위에서 찾은 두 개의 위치값을 활용하여 문자열을 잘라낸다.
 *    - 단, 기호 자체가 포함되어서는 안 되며, '_' 기호 바로 '다음' 글자부터 ']' 기호 바로 '앞' 글자까지만 정확히 뽑아내어 String 변수(userId)에 저장한다. 
 *      (예상되는 추출 결과: "java_master")
 * 5. 검증 및 출력:
 *    - 추출해 낸 userId가 "java_master" 문자와 완벽히 똑같은지 판별한다.
 *    - 똑같다면 "순수 유저 ID 추출 성공: [userId]" 를 출력한다.
 *    - 다르다면 "추출 실패: [userId]" 를 출력한다.
 */

public class LogDataExtractPractice {

	public static void main(String[] args) {
		String logData = "[GUEST_java_master] has entered the room.";
		
		int tempStart = logData.indexOf("_");
		
		int tempEnd = logData.indexOf("]");
		
		String userId = logData.substring(tempStart+1,tempEnd);	//tempEnd 부분 틀려서 결과 보고 고침
		
		if(userId.equals("java_master")) {
			System.out.println("순수 유저 ID 추출 성공: "+userId);
		}else {
			System.out.println("추출 실패: "+userId);
		}
	}

}
