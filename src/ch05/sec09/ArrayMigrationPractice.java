package ch05.sec09;

/*
 * [문제 상황: 서버 데이터 마이그레이션 및 배열 확장]
 * 
 * 1. 레거시 데이터 이관 (수동 복사):
 *    - 크기가 3인 정수형 배열(oldLogs)을 생성하고 100, 200, 300 을 할당한다.
 *    - 크기가 5인 정수형 배열(newLogs)을 새로 생성한다.
 *    - 반복문을 사용하여 oldLogs의 모든 데이터를 newLogs의 처음부터 순차적으로 복사한다.
 *    - newLogs의 모든 요소를 순회하며 출력한다.
 * 
 * 2. VIP 데이터 이관 (시스템 API 활용):
 *    - 크기가 3인 문자열 배열(oldVip)을 생성하고 "KIM", "LEE", "PARK" 을 할당한다.
 *    - 크기가 6인 문자열 배열(newVip)을 새로 생성한다.
 *    - 자바의 배열 복사 내장 기능을 단 한 줄로 사용하여, oldVip의 모든 데이터를 newVip로 복사한다. 
 *    - 단, 이번에는 newVip의 '세 번째 칸(인덱스 2)'부터 데이터가 들어가도록 시작 위치를 조정하여 복사한다.
 *    - newVip의 모든 요소를 순회하며 출력한다.
 */

public class ArrayMigrationPractice {

	public static void main(String[] args) {
		int[] oldLogos = {100, 200, 300};
		int[] newLogos = new int[5];
		for(int i=0;i<oldLogos.length;i++) {
			newLogos[i] = oldLogos[i];
		}
		for(int i=0;i<newLogos.length;i++) {
			System.out.println(newLogos[i]);
		}
		
		String[] oldVip = {"KIM","LEE","PARK"};
		String[] newVip = new String[6];
		System.arraycopy(oldVip, 0, newVip, 2, 3);
		for(int i=0;i<newVip.length;i++) {
			System.out.println(newVip[i]);
		}
	}

}
