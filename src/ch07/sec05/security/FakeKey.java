package ch07.sec05.security;
/*
 * [핵심 조건]
 * - 패키지명: ch07.sec05.security
 * - 해커가 MasterKey의 기능을 훔치기 위해 상속을 시도하는 가짜 키 클래스다.
 * 
 * [동작 요구사항]
 * - MasterKey를 상속(extends)하려고 시도해 본다.
 * - 컴파일러가 에러를 뿜어내는 것을 확인한 뒤, 에러가 나는 부분을 주석(//) 처리한다.
 * - 주석 옆에 "에러가 발생하는 정확한 이유"를 본인의 언어로 한 줄 적어둔다.
 */
public class FakeKey //extends MasterKey	//final 클래스는 자신을 상속하는 자식클래스 만들지 못하게 막는다.
{

}
