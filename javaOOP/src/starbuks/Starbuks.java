package starbuks;

import java.util.Scanner;

public class Starbuks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자();
		 * */
		
		Recipe Hong = new Hong();
		Recipe coffee = new Coffee(); 
		coffee.boilwater();
		coffee.brew();
		coffee.pourIncup();
		System.out.println("1.블랙커피, 2.설탕커피");
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		
		
		Hong.boilwater();
		Hong.brew();
		Hong.pourIncup();
		System.out.println("1.레몬티, 2.자몽티");
		Hong.select(scanner.nextInt());
		Hong.serve();
		
		
		
	}
}
