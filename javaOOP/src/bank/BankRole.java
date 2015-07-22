package bank;
/*
 계좌 개설 기능
 * */
public interface BankRole {
	public void openAccount(
			String accountNo,  //계좌번호
			String ownerName, //계좌주 이름
			String password,	//비번
			int restMoney		//잔액
			);
	/*
	 계좌번호를 입력하면 계좌 내용이 출력된다
	 * */
	public abstract Account searchAccountByAccountNo(
			String accountNo
			);
	/*
	 계좌주 이름을 입력하면 그 사람 소유의 계좌가 전부 검색(단, 동일인이 다수의 계좌를 가질 수 있다)
	 * */
	public Account[] seaechAccountByName(
			String ownerName
			);
	/*
	 계좌주 이름을 입력하면 그 사람 소유의 계좌 갯수를 알려줌
	 * */
	public int searchCountByName(
			String name
			);
	/*
	 계좌번호로 특정계좌를 폐기하는 기능
	 * */
	public boolean closeAcoount(
		String accountNo
		);
}
