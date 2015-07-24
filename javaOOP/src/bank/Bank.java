package bank;

public class Bank implements BankRole {

	// 필드
		// 은행은 통장을 여러개를 관리한다/
		// 따라서 필드에 인스턴스변수 하나를 지정하지 않고
		// 여러개를 담을 수 있는 배열을 지정한다.
		// 아래 배열은 은행에서 보면 계좌를 관리하는 DB
	private BankBook[] bankBookList;
	private int count;// 은행에서 관리하는 통장 갯수
	// 생성자
		// 배열,자료구조(컬렉션)을 보유하는
		// 객체를 만들고자 할 때는 그 객체의 생성자에 배열,자료구조의 객체를 생성해준다.

	public Bank(int count) {
		bankBookList = new BankBook[count];
	}

	// 멤버메소드
		// getter/ setter

	public BankBook[] getBankBookList() {
		return bankBookList;
	}

	public int getCount() {
		return count;
	}

	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 계좌계설
		/*
		 * 계좌번호, 계좌주, 비번, 잔액 만 입력하면 통장을 만들어 준다.
		 */
	@Override
	public void openAccount(String ownerName, int password, int restMoney) {
		BankBook bankBook = (BankBook) new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney);
		// 통장을 개설하자마자 은행전산 DB 에 통장정보 저장 개념
		bankBookList[count] = (BankBook) bankBook;
		this.count++; // 전쳬 은행에 개설된 통장 갯수 1 증가

	}

	// 계좌검색 (계좌번호) -> 리턴결과 : 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {   //BankBook �̶�� ���� ŸĨ�� �����ϸ� null���̶�� �ʱⰪ�� �ְ� ���߿� �������ش�
		BankBook account = null;// // ���� Ÿ���� �̷� �������� �������
		// String -> int
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			/*
			 * 문자타입(String)서로 같은지 여부. equals() 숫자타입(int) 서로 같은지 여부 ==
			 */
			if (bankBookList[i].getBankbookNo() == searchAccountNo) {
				account = bankBookList[i];

			}
		}
		return account;
	}

	// 계좌검색(이름) -> 리턴결과 : 계좌 여러개
	@Override
	public BankBook[] seaechAccountByName(String ownerName) {
	
		// searchAccountByname()이 메소드를 호출하면 자동으로 Searchcountname()을 먼저 호출하라

		int tempCount = this.searchCountByName(ownerName);
		if (tempCount ==0) {
			return null;
		}
		//���⼭ tempCount�� ������ �ǹ��ϴ� ���̰�
		
		// ��ó�� ���͸��� �ϴ� ������ �� �˰����� Ÿ�� ���� �ʿ���� ���¶�� �˰����� ȣ������ �ʱ� ���ؼ���.
		// �׷��� ������ �ڿ�(���ҽ� : �޸�, DB)�� ���� �ʷ��Ѵ�
		BankBook[] accounts = new BankBook[tempCount];
		
		tempCount = 0; //0���� �ʱ�ȭ ���Ѽ� �迭�� �ε����� ����ؾ� ��
		for (int i = 0; i < accounts.length; i++) {
			if (bankBookList[i].getName().equals(ownerName)) {
				accounts[tempCount] = bankBookList[i];
				//���⼭ tempcount�� �迭�� ���� ����Ų�� ���� �� ������ 3���� �����ϸ� 3��° �迭 �� 4��° ���� ����Ų��
				tempCount++;
			}
			
		}

		return accounts;
	}

	// 계좌검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		/*
		 * for문을 돌면서 파라미터로 받은 이름과 동일한 통장(계좌)가 있다면 count를 0에서 1씩 증가시켜라
		 */
		int count = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {

			}

		}
		return count;
	}

	// 계좌해지 ->리턴결과 : True or false
	@Override
	public boolean closeAcoount(String accountNo) {
		// flag는 삭제가 성공적으로 이뤄지면 true를 리턴하고 삭제할게 없으면 false리턴
		boolean CloseOk  = false;
		// String(문자열)로 들어온 값을 숫자로 바꿔서 비교
		BankBook bankBook = this.searchAccountByAccountNo(accountNo);
		//���͸������� if-else ������ ������� �ʰ� if ���� ����Ѵ�.
		if (bankBook == null) {
			System.out.println("�ش� ���°� �������� �ʽ��ϴ�.");
			return CloseOk;
		}
		int searAccountNO = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo() == searAccountNO) {
			
				/*
				 * j=i로 바꾼 이유는 홍길동의 계좌가 은행 전쳬계좌의 50번째 라면... 내부 for 문에서 다시 처음부터
				 * 0부터 회전하지 않고 홍길동의 계좌가 있는 인덱스 번호부터 뒤에 있는 계좌번호를 덮어쓰는 방식으로 진행한 후
				 * 맨 마지막 인덱스번호를 제거하면 은행에서 전쳬 계좌가 100개가 있는 상황이라면 홍길동이 삭제된 후
				 * 전쳬계좌수는 99개가 될것이다. 그래서 this.count-1 을 해주었음.
				 */
				for (int j = i; j < this.count - 1; j++) {
					bankBookList[i] = bankBookList[j + 1];

				}
				count--;
				// �� �˰����� Ŀģ �Ŀ��� ���� ������ �Ͼ�ٰ� ����.
				CloseOk = true;
			}

		}

		return CloseOk;
	}

	@Override
	public BankBook searchAccountByAccountNo(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
