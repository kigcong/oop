package bank;

public class BankBook {

	/* ====����ʵ�==== */

	private static String BANK; // �빮�ڴ� ���ó���� �ǹ��� ctrl + shift + / => �����ּ�
	private int bankbookNo;
	private String name;
	private int money;
	private int pass;
	private String msg;
	// ��ȿ��üũ ����� �˷��༭ ���� ���� �Ǽ��� �׷��� �Է��ߴٸ� �������ִ� ���

	public BankBook(String name) { // ������ // name�� �ܺο��� �ھƾ� �ϴµ� �׷��� ���ؼ� �Ķ���� �ۿ� ����
									
		this.BANK = "����Ƽ��ũ";
		// ���¹�ȣ�� 5�ڸ� ����
		// 9999-10000 - ....-100000
		this.bankbookNo = (int) ((Math.random() * 99999) + 10000); // ������ ���۰�
		this.name = name;
	}
	// �����ڴ� setter �� ����, �����ڷ� ������ ��� <= �ٲܼ� �־�� �ϴ°� �� setter ������ ������
	// getter setter ����Ű : ALT + SHIFT + S

	/* ===== ����޼ҵ� ===== */
	
	public String showAccount() { // �޼ҵ�(String) �ٷ� ���� �����̰� class �ؿ� �ִ� ���� ���� ���ʷ�
								// �������� get set�� ���� ����
								// ����°�� �ִ� �� �����ϸ� �Ķ���Ͱ� ���õǴµ� �ܺο��� �޾ƿ��� ��(�Ű�����)���� ��Ȱ�� �Ѵ�.
								
		return "=======\n" // �׹�°���� ����� �����Ǵµ� �ٲ� �� ���� �� � ���� ������ų���� ���鶧 ���
				+ "[" + BANK + "]\n" + "���¹�ȣ :" + bankbookNo + "\n" + "�̸� :" + name + "\n" + "�ܾ� :" + money + "\n"
				+ "===========";

	}

	
	
	public void setPass(int pass) {
		this.pass = pass;
	}

	
	public void withdraw(int money) {

		// �Ķ���� ���� ������ �ƴ� ���¸�
		// �����ؼ� ���͸��ϴ� ������ �ʿ�����
		// ==>  ��ȿ��üũ
		if (money <= 0) {
			msg = "��ݾ��� 0���� Ŀ���մϴ�.";
		} else if (this.money > money) {
			msg = "��ݾ��� �ܾ׺��� Ů�ϴ�.";
		} else {
			this.money -= money; // ������ ������ ���̳ʽ�
		}
	}

	
	public void deposit(int money) {
		if (money <= 0) {
			msg = "��ݾ��� 0���� Ŀ�� �մϴ�.";
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
