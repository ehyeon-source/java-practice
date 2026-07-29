package ch04.sec08;

/*
 * [문제 상황: 공장 컨베이어 벨트 불량품 스킵 시스템]
 * 
 * 1. 반복문 설계: for문을 사용하여 1번부터 10번까지의 제품 번호(itemNum)를 순차적으로 검사한다.
 * 2. 필터링 로직 (continue문 활용):
 *    - 제품 번호가 3의 배수(3, 6, 9)인 경우: 불량품으로 간주하여 아무것도 출력하지 않고, 즉시 다음 제품 검사로 넘어간다. (반드시 continue 키워드를 사용할 것)
 *    - 그 외의 정상 제품인 경우: "정상 제품 통과: [itemNum]번"을 콘솔에 출력한다.
 * 3. 검증: 콘솔에 3, 6, 9번을 제외한 1, 2, 4, 5, 7, 8, 10번 제품만 "정상 제품 통과" 메시지와 함께 출력되어야 한다.
 */

public class DefectFilterPractice {

	public static void main(String[] args) {
		
		for(int itemNum=1; itemNum<=10; itemNum++) {
			if(itemNum%3==0)continue;
			
			System.out.println("정상 제품 통과: "+itemNum+"번");
		}

	}

}
