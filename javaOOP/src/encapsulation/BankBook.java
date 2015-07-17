package encapsulation;

import abstraction.Account;

/*
 객체지향프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다.
 그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야 한다.
 통장을 이루는 요소를 생각해 보자
 그 요소가 결국 인스턴스 변수를 구성하게 된다.
 1. 은행이름 => 아이티뱅크 bank
 2. 통장번호 => 5자리 랜덤숫자 bankbookNo
 3. 소유자 이름 => 생성자에 스캐널 입력받는 값 name
 4. 날짜/예금/출금/잔액 => 돈  => 스캐너로 입력받는 값 숫자타입 int => money 
 5. 비밀번호 => 스캐너로 입력받는 값. 숫자타입 =>pass
 
 인터페이스
 1. void withdraw(int money):void
 2. void deposit(int money):void
 
 [출력]
 ===============
 [아이티뱅크]
 계좌번호 : 12345
 이름 : 홍길동
 잔액 : 1000원
 ===============
 BankBook 이라는 클래스 라이브러리를
 NDriver 에서 다운받아서 사용하세요.
 비번은 돈 먼저 입금하세요
 * */

public class BankBook implements Account{   //객체가 하는 액션을 추상화로써 표현해줌  

	// 상수 : fianl 을 붙여서 절대 불변의 값을 만듬
	// 스태틱 : final 을 빼버리면 절대 분변의 값이 아니라 바꿀수 있지만, 고정된 값 스태틱 값이 된다.
	// 스태틱 = 클래스 변수
	// BankBook b = new Bankbook();
	// b.bank --> 인변이 값을 호출한 것
	// BankBook.bank --> 클래스변수 호출하는 모양
	// 위치 : 필드 ----> {인변,상수,클래스변수} < 멤변
	//

	/* ===== 멤버필드 ===== */
	private static String BANK; // 대문자는 상수처리를 의미함 CTRL + Shift+ / =>다중 주석
	private int bankbookNo;
	private String name;
	private int money;
	private int pass;
	private String msg;// 유효성체크 결과를 알려줘서 고객이 만약 실수로 그렇게 입력했다면 공지해주는 기능

	public BankBook(String name) { // 생성자 // name은 외부에서 받아야 하는데 그러기 위해선 파라미터 밖엔
									// 없음
		this.BANK = "아이티뱅크";
		// 계좌번호는 5자리 숫자
		// 9999-10000 - ....-100000
		this.bankbookNo = (int) ((Math.random() * 99999) + 10000); // 끝값과 시작값
		this.name = name;
	}
	// 개발자는 setter 를 쓸지, 생성자로 끝낼지를 고민 <= 바꿀수 있어야 하는것 은 setter 없으면 생성자
	// getter setter 단축키 : ALT + SHIFT + S

	/* ===== 멤버메소드 ===== */
	@Override
	public String toString() { // 메소드(String) 바로 밑은 지변이고 class 밑에 있는 것은 멤필 멤필로
								// 만들어야지 get set 쓸수 있음
								// 세번째에 있는 걸 선택하면 파라미터가 선택되는데 외부에서 받아오는
								// 문(매게변수)같은 역활을 한다.
		return "=======\n" // 네번째에는 상수가 설정되는데 바꿀수 없는 값 어떤 값을 고정시킬려고 만들때 사용
				+ "[" + BANK + "]\n" + "계좌번호 :" + bankbookNo + "\n" + "이름 :" + name + "\n" + "잔액 :" + money + "원\n"
				+ "===========";

	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() { // get은 상관이 없지만 set의 경우에는 외부에 영향을 미칠수 있으므로 고정된 값이
							// 아니면 지워주어야 한다
		return money;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}
	@Override
	public void withdraw(int money) {
		
		
		// 파라미터 값이 정상값이 아닌 상태를
		// 추적해서 필터링하는 로직이 필요해짐
		// ==> 유효성체크
		if (money <= 0) {
			msg = "출금액은 0보다 커야 합니다.";
		} else if (this.money > money) {
			msg = "출금액이 잔액보다 큽니다.";
		} else {
			this.money -= money; // 누적된 값에서 마이너스
		}
	}
	@Override
	public void deposit(int money) {
		if (money <= 0) {
			msg = "출금액은 0보다 커야 합니다.";
		} else {
			this.money += money;
		}
		
	}

	

	
}
