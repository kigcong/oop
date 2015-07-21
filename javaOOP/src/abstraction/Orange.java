package abstraction;

public class Orange implements Fruitsinterface{

	@Override
	public void display(String str) {
		System.out.println(str+"오렌지 입니다.");
		
	}
	
	public int count(){   //  int 리턴 타입
		//리턴 타입이 void가 아니라면
		//반드시 return 키워드를 사용해야 한다.
		//리턴 타입이 존재할 때 코딩하는 방법
		//1.리턴 타입의 지변을 초기화 한다.
		int count = 100;   //인터레이스에 정의된 것만 만들어 주기 위해서 
	//	String c = "";
	//	Account acc = null; //클래스타입 리턴 타입
		//2.return 키워드 뒤에 지변을 둔다.
		return count;
	}
	
}
