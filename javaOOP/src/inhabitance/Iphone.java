package inhabitance;

public class Iphone extends CelPhone{
	/*==== 필드 =====*/
	private String data;
	private String os; // 운영체제
	public static boolean TRUE = true;// 오로지 이동전화만 만드는 회사
	public static String BRAND = "아이폰"; //static 이 붙으면 get set을 만들필요가 없고 널리 공개하는 의미   변수를 초기화했고 생성자를 만들지 않겠다는 의미
	//브랜드를 static 이라는 키워드를 사용해서 클래스변수로 만들고
	//고정값으로 설정함
	
	public String getData() { //외부에서 들어오는게 없어서 읽어만 옴
		return data;
	}
	//get/set 이 되었던 파라미터 추가하는 정도의 변화는 개발자 재량
	public void setData(String name,String data) {
		this.data = name + "에게"+"메세지로" +data+"를 전달";
	}
	
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os ="ios";
	}
	
	/*==== 생성자 =====*/
	/*=====멤버메소드 =====*/
	
	
	
}
