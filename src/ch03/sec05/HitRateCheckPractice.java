package ch03.sec05;

/*
 * [문제 상황: FPS 게임 플레이어의 명중률 데이터 검증]
 * 
 * 1. 초기 데이터: 플레이어의 명중 횟수를 나타내는 int 변수(hits)에 50을 할당하고, 발사 횟수를 나타내는 double 변수(shots)에 0.0을 할당한다. (시스템 오류로 발사 횟수가 0으로 기록된 상황 가정)
 * 2. 명중률 계산: hits를 shots로 나누어 명중률을 계산하고, 그 결과를 알맞은 타입의 변수(hitRate)에 저장한다.
 * 3. 데이터 검증 및 분기 처리: hitRate 값이 무한대(Infinity)이거나 숫자가 아닌 값(NaN)인지 검사한다.
 *    - 만약 둘 중 하나라도 해당한다면, 콘솔에 "데이터 오류: 명중률을 계산할 수 없습니다."라고 출력한다.
 *    - 정상적인 수치라면, hitRate에 기본 보너스 수치 10.5를 더하여 "최종 명중률 점수: [값]" 형태로 출력한다.
 */

public class HitRateCheckPractice {

	public static void main(String[] args) {
		int hits = 50;
		double shots = 0.0;
		
		double hitRate = hits / shots;
		
		if(Double.isInfinite(hitRate)||Double.isNaN(hitRate)) {	//내 예상 Infinite 임
			System.out.println("데이터 오류: 명중률을 계산할 수 없습니다.");
		}else {
			hitRate += 10.5;
			System.out.println("최종 명중률 점수: "+hitRate);
		}
	}

}
