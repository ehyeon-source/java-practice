package ch03.sec06;

/*
 * [문제 상황: 스마트 홈 보안 및 온도 제어 시스템]
 * 
 * 1. 보안 비밀번호 확인: 사용자가 입력한 비밀번호 String 변수(inputPw)에 "home777"을, 저장된 비밀번호 String 변수(savedPw)에 "home777"을 할당한다. 두 문자열이 완전히 같은지 올바른 방식으로 비교하여 boolean 변수(isUnlock)에 저장한다.
 * 2. 온도 센서 정밀 비교: 현재 온도를 나타내는 float 변수(currentTemp)에 23.5f를, 목표 온도를 나타내는 double 변수(targetTemp)에 23.5를 할당한다. 두 값이 같다고 판정될 수 있도록 정밀도 문제를 직접 해결한 비교식을 작성하여 boolean 변수(isTempReached)에 저장한다.
 * 3. 모드 변경 감지: 현재 설정된 모드 String 변수(currentMode)에 "SLEEP"을, 사용자가 요청한 모드 String 변수(requestMode)에 "AWAKE"를 할당한다. 두 문자열이 '다르다'는 것을 판별하는 올바른 수식을 작성하여 boolean 변수(isModeChanged)에 저장한다.
 * 4. 결과 출력: 수식 계산이 끝난 후 isUnlock, isTempReached, isModeChanged 값을 각각 콘솔에 출력한다. (이전처럼 주석으로 예상 값을 미리 적어두고 검증할 것)
 */

public class SmartHomeComparePractice {

	public static void main(String[] args) {
		String inputPw = "home777";
		String savedPw = "home777";
		boolean isUnlock = inputPw.equals(savedPw);
		
		float currentTemp = 23.5f;
		double targetTemp = 23.5;
		boolean isTempReached = (currentTemp == (float)targetTemp);
		
		String currentMode = "SLEEP";
		String requestMode = "AWAKE";
		boolean isModeChanged = !currentMode.equals(requestMode);
		
		System.out.println("isUnlock: "+isUnlock);	//내 예상 true
		System.out.println("isTempReached: "+isTempReached);	//내 예상 true
		System.out.println("isModeChanged: "+isModeChanged);	//내 예상 true
	}

}
