package ch05.sec05;

/*
 * [문제 상황 2: 제품 코드 스캐너 및 카테고리 추출]
 * 
 * 1. 초기 데이터: String 변수(productCode)에 "ELEC-TV-9876" 을 할당한다.
 * 2. 카테고리 탐색: 제품 코드 내에 "TV"라는 단어가 존재하는지 그 유무만 우선 확인한다.
 *    - 존재한다면 아래 3~4번 로직을 수행하고, 존재하지 않는다면 "TV 관련 제품이 아닙니다."를 출력한다.
 * 3. 텍스트 추출: 첫 번째 하이픈(-)이 위치한 곳의 번호(위치값)를 찾아낸다. 
 *    - 그 위치값을 활용하여 하이픈 바로 다음 글자부터 끝까지의 문자열만 잘라내어 새로운 변수(subCode)에 저장한다. 
 *      (예상되는 subCode 값: "TV-9876")
 * 4. 문자 판별: 추출된 subCode에서 제일 첫 번째 글자 단 하나만 뽑아낸다.
 *    - 해당 문자가 'T' 라면 "T-Class 제품군 확인 완료"를 출력한다.
 */

public class StringExtractPractice {
	public static void main(String[] args) {
		String productCode = "ELEC-TV-9876";
		if(productCode.contains("TV")) {
			int temp=productCode.indexOf("-");	//indexOf 까먹어서 삽질하다가 결국 찾아봄
			String subCode = productCode.substring(temp+1);	//+1 안해서 삽질 오래함
			if(subCode.charAt(0)=='T') {
				System.out.println("T-Class 제품군 확인 완료");
			}
		}else {
			System.out.println("TV 관련 제품이 아닙니다.");
		}

	}

}
