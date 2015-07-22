package abstraction;

public class Gunrobot extends BasicBot {

	private int attack; // 공격력

	/*
	 * 출력 건로봇은 속도는 10, 에너지는 10, 공격력 50 -공격력은 인스턴스 변수로 attackPoint 쉴드로봇은 속도는 20,
	 * 에너지는 20, 방어력 50 - 방어력은 인스턴스 변수로 int shieldPoint
	 */

	
	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public void status() {
		super.status();
		System.out.println("로봇 공격력 : " + this.attack);

		
		
	}

}