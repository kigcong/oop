package bank;

import java.util.Scanner;

public class KBbank {
	public static void main(String[] args) {
	BankRole bank = new Bank(100); //�������̽�Ÿ�� �ν��Ͻ� = new ������();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("���� ���� ?");
	String name = scanner.next();
	System.out.println("��й�ȣ 4�ڸ� �Է� ?");
	int password = scanner.nextInt();
	System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
	int money = scanner.nextInt();
	bank.openAccount( name, password, money);
	
	System.out.println("====���¹�ȣ ��ȸ(���¹�ȣ) ====");
	System.out.println("�˻��Ϸ��� ����?");
	String searchName = scanner.next();
	int searchCount = bank.searchCountByName(searchName);
	BankBook[] searchArr = new BankBook[searchCount];//�迭�� ��쿡�� �̷��� ����
	searchArr = bank.seaechAccountByName(searchName);
	for (BankBook bankBook : searchArr) { // : in���� ����
		System.out.println(bankBook.showAccount());
		
	}

	System.out.println("�˻��Ϸ��� ���¹�ȣ?");
	//��ü�� �޼ҵ带 ȣ���� �� ������ ���� ����� �����Ͽ�����
	//�� ���ϰ��� �޴� ����ó���� �����ڰ� ������ ����� �Ѵ�.
	// �� ����� �޼ҵ尡 �����ϴ� ����Ÿ���� �˾Ƴ���
	//�� Ÿ������ �����ϳ��� ���� ���� �� ������ ���ϰ��� �Ҵ��Ѵ�.
	BankBook bankBook = bank.searchAccountByAccountNo(scanner.nextInt()); //�Ϲ������� �տ����� void �����̾��� ������ �̷��� ���� �ʿ䰡 ������
	System.out.println(bankBook.showAccount());
	System.out.println("�����Ϸ��� ���¹�ȣ?");
//	String delet = scanner.next(); //"12345" �� 12345 �� �񱳰� �Ұ�
	//int �� String�� ���� ���� ���Ϸ��� String Ÿ���� int�� �ٲ���� �Ѵ�.
	//int one = String.vlueOF("12345"); �� ������� 12345
//	String deletAccount = String.valueOf(delet);
	boolean CloseOk = bank.closeAcoount(scanner.next());
	if (CloseOk==true) {
		System.out.println("�����Ǿ����ϴ�.");
	}else{
		System.out.println("�ش� ���°� �����ϴ�.");
	}
	
	}
}
