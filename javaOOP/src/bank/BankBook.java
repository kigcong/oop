package bank;

public class BankBook {

	/* ====멤버필드==== */

	private static String BANK; // 대문자는 상수처리를 의미함 ctrl + shift + / => 다중주석
	private int bankbookNo;
	private String name;
	private int money;
	private int pass;
	private String msg;
	// 유효성체크 결과를 알려줘서 고객이 만약 실수로 그렇게 입력했다면 공지해주는 기능

	public BankBook(String name) { // 생성자 // name은 외부에서 박아야 하는데 그러기 위해선 파라미터 밖엔 없음
									
		this.BANK = "아이티뱅크";
		// 계좌번호는 5자리 숫자
		// 9999-10000 - ....-100000
		this.bankbookNo = (int) ((Math.random() * 99999) + 10000); // 끝값과 시작값
		this.name = name;
	}
	// 개발자는 setter 를 쓸지, 생성자로 끝낼지 고민 <= 바꿀수 있어야 하는것 은 setter 없으면 생성자
	// getter setter 단축키 : ALT + SHIFT + S

	/* ===== 멤버메소드 ===== */
	
	public String showAccount() { // 메소드(String) 바로 밑은 지변이고 class 밑에 있는 것은 멤필 멤필로
								// 만들어야지 get set을 쓸수 있음
								// 세번째에 있는 걸 선택하면 파라미터가 선택되는데 외부에서 받아오는 문(매개변수)같은 역활을 한다.
								
		return "=======\n" // 네번째에는 상수가 설정되는데 바꿀 수 없는 값 어떤 값을 고정시킬려고 만들때 사용
				+ "[" + BANK + "]\n" + "계좌번호 :" + bankbookNo + "\n" + "이름 :" + name + "\n" + "잔액 :" + money + "\n"
				+ "===========";

	}

	
	
	public void setPass(int pass) {
		this.pass = pass;
	}

	
	public void withdraw(int money) {

		// 파라미터 값이 정상값이 아닌 상태를
		// 추적해서 필터링하는 로직이 필요해짐
		// ==>  유효성체크
		if (money <= 0) {
			msg = "출금액은 0보다 커야합니다.";
		} else if (this.money > money) {
			msg = "출금액이 잔액보다 큽니다.";
		} else {
			this.money -= money; // 누적된 값에서 마이너스
		}
	}

	
	public void deposit(int money) {
		if (money <= 0) {
			msg = "출금액은 0보다 커야 합니다.";
		} else {
			this.money += money;
		}

	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getPass() {
		return pass;
	}

	public String getMsg() {
		return msg;
	}

	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

	
}
