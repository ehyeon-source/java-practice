package ch05.sec09;

/*
 * [문제 상황: 마스터 서버의 특정 구간 데이터만 선택적으로 백업하기]
 * 
 * 1. 원본 데이터:
 *    - 크기가 5인 문자열 배열(masterServer)을 생성하고 "SV01", "SV02", "SV03", "SV04", "SV05" 를 순서대로 할당한다.
 * 
 * 2. 백업 배열 생성:
 *    - 크기가 4인 새로운 문자열 배열(backupServer)을 생성한다.
 * 
 * 3. 선택적 데이터 복사 (시스템 API 활용):
 *    - 자바의 배열 복사 내장 기능을 단 한 줄로 사용하여 아래의 조건에 맞게 복사한다.
 *    - 조건 1: masterServer에 있는 데이터 중 '세 번째 데이터'부터 시작하여 정확히 '2개'의 데이터만 복사해 온다.
 *    - 조건 2: 가져온 데이터들을 backupServer의 '두 번째 칸'부터 차례대로 채워 넣는다.
 * 
 * 4. 결과 출력:
 *    - 반복문을 사용하여 backupServer의 모든 요소를 처음부터 끝까지 순서대로 출력한다.
 */

public class SystemArrayCopyPractice {

	public static void main(String[] args) {
		String[] masterServer = {"SV01", "SV02", "SV03", "SV04", "SV05"};
		String[] backupSever = new String[4];
		
		System.arraycopy(masterServer, 2, backupSever, 1, 2);
		
		for(int i=0;i<backupSever.length;i++) {
			System.out.println(backupSever[i]);
		}
	}

}
