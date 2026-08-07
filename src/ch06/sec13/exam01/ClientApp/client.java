package ch06.sec13.exam01.ClientApp;

/*
 * [가동 조건]
 * - 패키지명: ch06.sec13.client
 * - KeyManager 객체를 생성하여 메서드를 호출한 뒤 반환받은 비밀 키를 출력한다.
 * - (주의) SecretKey 설계도는 철저히 내수용으로 잠겨 있으므로, 다른 동네인 이곳(client 패키지)에서 직접 SecretKey 타입으로 변수를 선언하거나 객체를 생성하려고 하면 무조건 차단(에러) 당한다는 사실을 주석으로 명시해 둔다.
 * 
 * [기대되는 정확한 출력 결과]
 * 발급받은 보안 키: TOP-SECRET-777
 */
import ch06.sec13.exam01.admin.*;
public class client {

	public static void main(String[] args) {
		KeyManager key = new KeyManager();
		System.out.println("발급받은 보안 키: "+key.returnKey());
		
		//SecretKey secret = new SecretKey();	// default (다른 패키지에서는 사용못하게 막는) 이기에 import 로 집 문을 두드려도 안 열어주는 것과도 같다. 
	}

}
