package ch07.sec10.graphics;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec10.graphics
 * 
 * [동작 요구사항]
 * - main 메서드 밖에, 도형을 화면에 렌더링하는 정적 메서드(static void render(부모타입 그릇))를 하나 선언한다.
 * - render 메서드 내부 로직: 넘겨받은 도형 객체의 move()를 호출한 뒤, draw()를 호출한다.
 * - main 메서드 내부 로직: Circle 객체와 Rectangle 객체를 각각 생성하여 render() 메서드에 던져본다.
 */
public class EditorApp {
	public static void main(String[] args) {
		render(new Circle());
		render(new Rectangle());

	}
	static void render(Shape shape) {
		shape.move();
		shape.draw();
	}
}
