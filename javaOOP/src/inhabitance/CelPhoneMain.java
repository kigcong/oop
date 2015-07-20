package inhabitance;

import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		CelPhone nokia = new CelPhone();//클래스이름 인스턴스 뉴 생성자
		
		
		
		nokia.setCompany("노키아 휴대전화기");
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람 : ");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCompany() + "를 사용해서...");
		
		nokia.setPortable(true);// 휴대폰은 이동성이 존재하므로
		//bolean 타입의 set 메소드를 이용하여 
		//setMove 를 자동 설정하게끔 유도하고
		//출력은 isPortable()이 아니라 
		//getMove()를 호출하게 하는 패턴
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCall());
		
		
		
		
		/*
		 [콘솔 출력문]
		 노키아 휴대전화를 사용해서
		 폰을 가지고 다닐 수 있음 
		 홍길동에게 전화를 검 
		 * */
		
		
	}
}
