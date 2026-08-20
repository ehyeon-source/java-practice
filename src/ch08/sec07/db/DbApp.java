package ch08.sec07.db;
/*
 * [가동 조건]
 * - 패키지명: ch08.sec07.db
 * 
 * [테스트 순서 및 요구사항]
 * 1. Database 타입의 변수에 OracleDB 객체를 생성해 꽂아 넣습니다.
 * 2. 이 변수를 통해 backupData()와 restoreData()를 각각 호출하여, 숨겨진 private 도우미 로직이 잘 섞여 나오는지 확인합니다.
 * 3. 객체와 상관없이, 인터페이스 이름으로 다이렉트 접근하여 startDailyBatch()와 startWeeklyBatch()를 호출하고, 숨겨진 private static 도우미 로직이 잘 작동하는지 확인합니다.
 */
public class DbApp {
	public static void main(String[] args) {
		Database db = new OracleDB();
		
		db.backupData();
		db.restoreData();
		
		Database.startDailyBatch();
		Database.startWeeklyBatch();

	}

}
