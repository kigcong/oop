package abstraction;

public class TV extends Productspec {
	// 주어진 것만 하라고 했으면 ProductSpec 마무리
	// 그런데, 추가정보를 더하라고 했으면 상속
	// 시킨것만 하는 것은 implements 거기에서 추가적으로 작업을 할려면 extends 해줌
	private String screenSize;   
	private String screenType;

	public void writeInfo(String company, String name, String screenSize, String screenType, String serialNo) {// 상속받지
																												// 않겠다는
																												// 의미
		super.writeInfo(company, name, serialNo);
		//부모에게 선언된 public 메소드에 접근, 사용가능
		//super 라는 키워드를 통해서...
		this.screenSize = screenSize;
		this.screenType = screenType;
}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스크린 사이즈 : "+ this.screenSize);
		System.out.println("스크린 타입 : "+ this.screenType);
	}

}
