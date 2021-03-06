package encapsulation;

import java.util.Scanner;

public class Bankmain {
	public static void main(String[] args) {
		/*
		 * 객체지향프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다. 그 대상이 구체적 물질이든 개념적 추상이든 그대로
		 * 재현하려고 해야 한다. 통장을 이루는 요소를 생각해 보자 그 요소가 결국 인스턴스 변수를 구성하게 된다. 1. 은행이름 =>
		 * 아이티뱅크 bank 2. 통장번호 => 5자리 랜덤숫자 bankbookNo 3. 소유자 이름 => 생성자에 스캐널 입력받는
		 * 값 name 4. 날짜/예금/출금/잔액 => 돈 => 스캐너로 입력받는 값 숫자타입 int => money 5. 비밀번호
		 * => 스캐너로 입력받는 값. 숫자타입 =>pass
		 * 
		 * [출력] =============== [아이티뱅크] 계좌번호 : 12345 이름 : 홍길동 잔액 : 1000원
		 */

		Scanner scanner = new Scanner(System.in);
		/*
		 * 생성자가 가지는 기능 1. 객체를 만드는 기능 2. setter 기능 3. 객체가 만들어지는 데 필수적인 요소가 주어지지
		 * 않으면 아예 생성을 막는 기능 ==>제약, 방어코딩
		 */

		System.out.println("통장주 이름 :");
		BankBook bankbook = new BankBook(scanner.next());

		System.out.println("입금 : ");
		bankbook.deposit(scanner.nextInt());

		System.out.println("출금 : ");// 누적된 값에서 마이너스
		bankbook.withdraw(scanner.nextInt());

		System.out.println("입금 : ");
		bankbook.deposit(scanner.nextInt());

		System.out.println(bankbook.toString());

	}

}
