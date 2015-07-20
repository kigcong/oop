package inhabitance;

public class Phone { // 아래에서 위로가 아니라 위에서 아래로 만들기 때문에 바로 베인 안만듬  눈으로 식별가능한 구상클래스
	private String company;
	private String call;
	/*=====생성자=====*/ //생성자를 안만들면 디폴트 set,get만듬
	
	
	/*=====멤버메소드=====*/
	//get/set 단축키 : ALT SHIFT S
	
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public  void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
	
	
	
	
}
