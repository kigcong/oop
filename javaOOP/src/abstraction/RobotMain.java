package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 
		 
		 GunRobot 
		 ShieldRobot
		 
		 
		 출력
		 건로봇은 속도는 10, 에너지는 10, 공격력 50
		 -공격력은 인스턴스 변수로 attackPoint
		 쉴드로봇은 속도는 20, 에너지는 20, 방어력 50
		 - 방어력은 인스턴스 변수로 int shieldPoint
		 
		 */
		
	
	Gunrobot g = new Gunrobot();
	g.charge(10);
	g.run(10);
	g.setAttack(50);
	g.status();
	
	}
		}

