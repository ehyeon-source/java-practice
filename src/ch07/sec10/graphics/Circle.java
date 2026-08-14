package ch07.sec10.graphics;
/*
 * [핵심 조건]
 * - 두 클래스 모두 Shape를 상속받는 자식 클래스.
 * 
 * [동작 요구사항]
 * - 부모가 강제한 draw() 기능을 반드시 각자의 입맛에 맞게 완성해야 한다.
 * - Circle 클래스는 "동그라미를 그립니다." 출력
 * - Rectangle 클래스는 "사각형을 그립니다." 출력
 */
public class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("동그라미를 그립니다.");
	}
}
