package encapsulation;

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부, 이렇게 나누고 
	// Bean 클래스라면 멤버필드 + 멤버메소드 

	private String name; //  멤버필드 변수는 초기화를 하지 않는다.
	private int salary,tax,money;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getTax() {
		int tax=0; // 지변은 초기화 필수
		tax = (int) (salary*0.1);
		return tax;
	}
	/*
	 * this 는 이 클래스 내부에 있는 ~~~의미
	 * */
	public int getMoney() {
		int money = 0; // 지변 초기화
		money = salary - getTax();// 계산된 값을 가져오기 위해선 위에 것을 선언해줘야 한다 그냥 tax하면 멤필변수가 선언됨
		return money;
	}
	
	//멤버메소드 영역이 시작
	@Override
	public String toString() {// 스캐너로 받는 놈은 모두 set, 나머지는 get을 사용해서 표현한다. 
		// TODO Auto-generated method stub
		return "출력문은 ["+this.name+ "실급여] 월급 :" +this.salary+"만원 세금 : "+this.getTax()+"만  실급여 : "+this.getMoney()+"만원";
	}
	

}
