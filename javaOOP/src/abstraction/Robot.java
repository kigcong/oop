package abstraction;

public interface Robot {
	/*
	 로봇이 공격하는 기능
	 * */
	public void charge(int energy); //공격
	/*
	 로봇이 움직이는 기능
	 * */
	public void run(int speed);
	/*
	 로봇의 상태 모니터링 
	 * */
	public void status();
	
	
	
	
	/* 출력
	 건로봇은 속도는 10, 에너지는 10, 공격력 50
	 -공격력은 인스턴스 변수로 attackPoint
	 쉴드로봇은 속도는 20, 에너지는 20, 방어력 50
	 - 방어력은 인스턴스 변수로 int shieldPoint
	*/
	
	
	
}
