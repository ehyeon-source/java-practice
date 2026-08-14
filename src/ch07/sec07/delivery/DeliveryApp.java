package ch07.sec07.delivery;
/*
 * [가동 조건]
 * - 패키지명: ch07.sec07.delivery
 * - 신선식품(ColdParcel) 객체를 생성하되, 이를 담는 변수(그릇)는 부모인 '일반 택배(Parcel)' 타입으로 선언한다.
 * 
 * [테스트 순서 및 요구사항]
 * 1. 부모 그릇 상태에서 부모의 필드인 address에 "서울"을 저장해 보고, send() 메서드를 호출해 본다.
 * 2. 부모 그릇 상태에서 자식의 고유 기능인 addIcePack()을 호출하려 시도해 본다.
 * 3. 컴파일러가 빨간줄을 그으며 막아서면 주석(//) 처리한다.
 * 4. (가장 중요) 부모 그릇에 갇힌 이 택배를 다시 본래의 '신선식품(ColdParcel)' 그릇으로 억지로 옮겨 담아(강제 타입 변환) 본다.
 * 5. 옮겨 담은 새 변수를 통해 자식 고유 필드인 temperature에 -2를 저장해 보고, 아까 막혔던 addIcePack()을 호출하여 정상 작동하는지 확인한다.
 */
public class DeliveryApp {
	public static void main(String[] args) {
		Parcel p = new ColdParcel();
		
		p.address = "서울";
		p.send();
		
		//p.addIcePack();
		
		ColdParcel c = (ColdParcel)p;
		
		c.temperature = -2;
		c.addIcePack();
	}

}
