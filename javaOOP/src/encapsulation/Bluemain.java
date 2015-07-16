package encapsulation;

import java.util.Scanner;

public class Bluemain {
	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Blue blue = new Blue(dice1, dice2);
			//클래스이름 객체이름 =new 생성자() ==>인스턴스 생성 공식
		int num1=0, num2=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 주사위수");
		num1 = scanner.nextInt();
		System.out.println("두번째 주사위수");
		num2 = scanner.nextInt();
		
		System.out.println(blue.toString());
}
}