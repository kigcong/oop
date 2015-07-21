package abstraction;

/*
 인터페이스인 product를 구현한 클래스
 */
public class Productspec implements product
{
	/*=== 필드 ===*/
	private String company; // 제조사
	private String name;// 제품명
	private String serialNo; // 시리얼 넘버

	/* === 생성자 === */

	/* === 멤버메소드 === */
	@Override
	public void showInfo() {
		System.out.println("제조사 :" + this.company);
		System.out.println("제품명 :" + this.name);
		System.out.println("시리얼넘버 :" + this.serialNo);
	}
	@Override                                                  // 주어진 작업만 하고 추가적인 일은 하지 마라
	public void writeInfo(String company, String name, String serialNo) {

		// 청색글씨 = 인스턴스 변수, 밤색글씨 = 파라미터로 넘어온 지변

		this.company = company;
		this.name = name;
		this.serialNo = serialNo;

	}

}

