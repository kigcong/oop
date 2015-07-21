package abstraction;

public class Apple implements Fruitsinterface{
/*===== 필드 =====*/
	String msg;
	
	
	/*=====생성자 =====*/
	 public Apple() {
		// TODO Auto-generated constructor stub
	}
	
	
	/*=====멤버메소드=====*/
	 
	@Override
	public void display(String str) {        //
		System.out.println(str + "사과입니다.");
		
	}

}
