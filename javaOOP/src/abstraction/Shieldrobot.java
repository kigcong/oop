package abstraction;

public class Shieldrobot extends BasicBot {
	
	//쉴드로봇은 속도는 20, 에너지는 20, 방어력 50  쉴드로봇은 속도는 20,
	 //- 방어력은 인스턴스 변수로 int shieldPoint
	/*=====필드=====*/
	private int shieldPoint;  
	/*=====생성자 =====*/
	/*===== 멤버메소드 =====*/
	
	public int getShieldPoint() {
		return shieldPoint;
	}
	public void setShieldPoint(int shieldPoint) {
		this.shieldPoint = shieldPoint;
	}
	
	
	
	@Override
	public void status() {
		// TODO Auto-generated method stub
		super.status();
		System.out.println("방어력 :" + this.shieldPoint);
	}
	
	

}
