package ch08.sec07.db;
/*
 * [핵심 조건]
 * - 패키지명: ch08.sec07.db
 * 
 * [동작 요구사항]
 * - 은밀한 도우미 1 (객체 필요): 외부에서 볼 수 없는 반환값 없는 메서드(connectDatabase)를 만들고 "DB 연결을 설정하고 보안을 체크합니다." 출력.
 * - 디폴트 메서드 1: backupData() -> "데이터 백업을 시작합니다." 출력 후 도우미 1 호출.
 * - 디폴트 메서드 2: restoreData() -> "데이터 복구를 시작합니다." 출력 후 도우미 1 호출.
 * 
 * - 은밀한 도우미 2 (객체 불필요): 외부에서 볼 수 없는 정적 메서드(verifySystemState)를 만들고 "시스템 상태 및 디스크 용량을 확인합니다." 출력.
 * - 정적 메서드 1: startDailyBatch() -> "일일 배치 작업을 시작합니다." 출력 후 도우미 2 호출.
 * - 정적 메서드 2: startWeeklyBatch() -> "주간 배치 작업을 시작합니다." 출력 후 도우미 2 호출.
 */
public interface Database {
	private void connectDatabase() {
		System.out.println("DB 연결을 설정하고 보안을 체크합니다.");
	}
	default void backupData() {
		System.out.println("데이터 백업을 시작합니다.");
		connectDatabase();
	}
	default void restoreData() {
		System.out.println("데이터 복구를 시작합니다.");
		connectDatabase();
	}
	
	
	private static void verifySystemState() {
		System.out.println("시스템 상태 및 디스크 용량을 확인합니다.");
	}
	static void startDailyBatch() {
		System.out.println("일일 배치 작업을 시작합니다.");
		verifySystemState();
	}
	static void startWeeklyBatch() {
		System.out.println("주간 배치 작업을 시작합니다.");
		verifySystemState();
	}
	
}
