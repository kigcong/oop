package encapsulation;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
	/*
	 [오더] 
	 pay 프로그램은 월급을 입력받아서 세금을 떼고 실급여를 고객에게 알려주는 프로그램입니다.
	 세율은 10% 
	 출력문은 [홍길동 실급여]
	 월급 : 100만원
	 세금 : 10만원
	 실급여 : 90만원
	 * */
	String name = "";
	int salary=0, money=0 ,tax=0;
	
	
	     
Scanner scanner = new Scanner(System.in);

System.out.println("이름을 입력하세요");
name = scanner.next();
System.out.println("급여를 입력하세요");
salary= scanner.nextInt();


PayBean bean = new PayBean();
bean.setName(name);
bean.setSalary(salary);
	
	
		
	System.out.println(bean.toString());
		
	
		
		
		
		
		
		
		
		
}
}
