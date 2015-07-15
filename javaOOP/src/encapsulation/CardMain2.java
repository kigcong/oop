package encapsulation;

import java.util.Scanner;

public class CardMain2 {
	public static void main(String[] args) {
		/*
		 [오더]
		 카드 두장을 비교해서 카드 번호가 더 큰 수가 이기는 게임프로그램을 작성하시오.
		 일단, 프로토타임(시제품) 프로그램으로 개발자가 임의의 숫자를 입력하면
		 [출력]
		 [홍길동 : 7] vs [김유신 : 3]
		 홍길동 승리
		 * */
		
		int num=0, num2 = 0;
		String name = "", name2 = ""; // 지변 초기화
		
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		name = scanner.next();
		
		
		System.out.println("이름을 입력하시오2");
		name2 = scanner.next();
		
	
		
		//객체를 생성함
		CardBean3 bean = new CardBean3();
		//스캐너가 받아 놓은 값은 현재 지변에 있다.
		//그런데 연산로직은 객체에 있다.
		//따라서, 지변에 있는 값을 멤변에 던져야 한다.
		bean.setName(name);
		bean.setName2(name2);
		bean.setNum(); // 스캐너로 받지 않는다고 setNum()을 호출 (사용)하지 않으면 랜덤 숫자가 발생하지 않는다.
		bean.setNum2();
		System.out.println(bean.toString());
	
}
}
