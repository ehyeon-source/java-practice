package ch07.sec10.graphics;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec10.graphics
 * - 모든 도형의 뼈대가 되는 부모 클래스 (스스로 객체 생성 불가).
 * 
 * [동작 요구사항]
 * - 일반 메서드 1개: move()
 *   - 기능: "좌표를 이동합니다." 출력
 * - (가장 중요) 미완성 메서드 1개: draw()
 *   - 기능: 실행 내용(body)이 전혀 없으며, 이 클래스를 물려받는 모든 자식들이 무조건 자신만의 방식으로 그리도록 강제성을 부여한다.
 */
public abstract class Shape {
	void move() {
		System.out.println("좌표를 이동합니다.");
	}
	
	abstract void draw();
}
