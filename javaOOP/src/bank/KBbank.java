package bank;

import java.util.Scanner;

public class KBbank {
	public static void main(String[] args) {
	BankRole bank = new Bank(100); //인터페이스타입 인스턴스 = new 생성자();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("고객님 성함 ?");
	String name = scanner.next();
	System.out.println("비밀번호 4자리 입력 ?");
	int password = scanner.nextInt();
	System.out.println("얼마를 입금하시겠습니까?");
	int money = scanner.nextInt();
	bank.openAccount( name, password, money);
	
	System.out.println("====계좌번호 조회(계좌번호) ====");
	System.out.println("검색하려는 고객명?");
	String searchName = scanner.next();
	int searchCount = bank.searchCountByName(searchName);
	BankBook[] searchArr = new BankBook[searchCount];
	searchArr = bank.seaechAccountByName(searchName);
	for (BankBook bankBook : searchArr) { // : in으로 생각
		bankBook.showAccount();
		
	}
	bank.seaechAccountByName(searchName);
	System.out.println("검색하려는 계좌번호?");
	
	bank.searchAccountByAccountNo(scanner.nextInt()).showAccount();
	
}
}
