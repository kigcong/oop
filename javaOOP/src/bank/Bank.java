package bank;

public class Bank implements BankRole{
//계좌개설
//생성자 
	public Bank() {
		
	}
//멤버메소드
//계좌계설
	@Override
	public void openAccount(String accountNo, String ownerName, String password, int restMoney) {
		
		
	}
//계좌검색 (계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;     //리턴 타입을 이런 형식으로 만들어줌 
		return account;
	}
//계좌검색(이름) -> 리턴결과 : 계좌 여러개
	@Override
	public Account[] seaechAccountByName(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}
//계좌검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		int count =0;
		return count;
	}
//계좌해지  ->리턴결과 : True or false
	@Override
	public boolean closeAcoount(String accountNo) {
		boolean flag = false;
		if (flag) {
			
		} else {

		}
		return flag;
	}

}
