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
	//g.status();
	Shieldrobot s = new Shieldrobot();
	s.charge(20);
	s.run(20);
	s.setShieldPoint(50);
	//s.status();
	//확장 for문
	Robot[] robots = new Robot[2]; //캠슐화 
	robots[0] = g;
	robots[1] = s;
	
	for (Robot robot  : robots) {   //robots를 배열로 보고 배열안에 있는 객체로 보면 헷갈리지 않는다 
		robot.status();
		
	}
	}
		}

