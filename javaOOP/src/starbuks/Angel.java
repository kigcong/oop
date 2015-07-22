package starbuks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {

		AngelCoffee kim = new AngelCoffee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.블랙커피, 2.설탕커피");
		kim.preapare(scanner.nextInt());
		AngelTea lee = new AngelTea();
		System.out.println("1.레몬티, 2.자몽티");
		lee.preapare(scanner.nextInt());

	}

}
