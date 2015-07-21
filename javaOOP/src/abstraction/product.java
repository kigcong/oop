package abstraction;
/*
 @Story : 추상적인 "제품"이라는 개념을 인터페이스로 만듦
 * */
public interface product {
	public void showInfo();
	public void writeInfo(String company, String name, String serialNo);
}
