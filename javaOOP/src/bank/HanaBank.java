package bank;

import java.util.Scanner;

public class HanaBank {
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		Scanner scanner = new Scanner(System.in);
		int input = 0, key = 0; // �������� �ʱ�ȭ
		while (true) {
			System.out.println("1.���°��� 2.������ȸ 3.������ȸ(�̸�) 4.��ü���� 0.����");
			input = scanner.nextInt();
			// ������ �޼ҵ带 ȣ���ϸ� ��Ŭ������ �ڵ����� �޼ҵ带 ������ִ� create method �޴��� ��Ÿ����
			// �װ��� �̿��ؼ� ���� �޼ҵ带 ��Ÿ����
			key = inputCheck(input, 0, 5);
			if (input != 0) {
				switch (key) {
				case 1:
					System.out.println("���� ���� ?");
					String name = scanner.next();
					System.out.println("��й�ȣ 4�ڸ� �Է� ?");
					int password = scanner.nextInt();
					System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ�?");
					int money = scanner.nextInt();
					bank.openAccount(name, password, money);

					break;
				case 2:
					System.out.println("�˻��Ϸ��� ���¹�ȣ?");

					BankBook bankBook = bank.searchAccountByAccountNo(scanner
							.nextInt());
					System.out.println(bankBook.showAccount());

					break;
				case 3:
					System.out.println("�˻��Ϸ��� ����?");
					String searchName = scanner.next();
					int searchCount = bank.searchCountByName(searchName);
					BankBook[] searchArr = new BankBook[searchCount];//�迭�� ��쿡�� �̷��� ����
					searchArr = bank.seaechAccountByName(searchName);
					for (BankBook bankBook2 : searchArr) { // : in���� ����
						System.out.println(bankBook2.showAccount());
						
					}

					break;
				case 4:
					System.out.println("��ü���� ��ȸ");
					BankBook[] list = bank.getBankBookList();
					if (bank.getCount()!=0) {
						for (int i = 0; i < bank.getCount(); i++) {
							System.out.println(list[i].showAccount());
						}
					} else {
						System.out.println("���࿡ ���°� �ϳ��� �����ϴ�. ");
					}

					break;
				case 5:
					System.out.println("�����Ϸ��� ���¹�ȣ?");

				boolean CloseOk = bank.closeAcoount(scanner.next());
				if (CloseOk==true) {
					System.out.println("�����Ǿ����ϴ�.");
				}else{
					System.out.println("�ش� ���°� �����ϴ�.");
				}
				
					break;

				default:
					break;
				}

			}
			if (input != 0) {

			} else {
				System.out.println("�ý��� ���� !");
				break; // �������� �������� �ý��� �����û��
				// ���ǿ� �հ��ϸ� break ó���� ����
				// switch caes ������ �����ϰ� ���
			}

		}
	}

	private static int inputCheck(int input, int i, int j) {
		if (input < i || input > j) {
			System.out.println("���ø޴����� ������ ���� ���� �Է��߽��ϴ�. ");
			return 0; //�ý��� ���� .. ���������� ����Ʈ���� �����߱� ����
		} else {
			return input;
		}
		
	}
}
