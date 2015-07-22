package starbuks;

public class Hong implements Recipe{

	/* 홍차(Tea) 끓이는 순서
		1. 물을 끓인다.
		2. 커피를 내린다
		3. 물을 컵에 붓는다.
		4. 레몬, 자몽 첨가 여부를 손님에게 묻는다.
			-레몬 : 레몬티, 자몽 : 자몽티
		5.홍차를 제공한다.
			- 고객님 레몬티가 나왔습니다. 
	*/
	
	private String tea;
	
	
	
	@Override
	public void boilwater() {
		System.out.println("1.물을 끓인다.");
		
	}

	@Override
	public void brew() {
		System.out.println("2. 커피를 내린다.");
		
	}

	@Override
	public void pourIncup() {
		
		System.out.println("3. 물을 컵에 붓는다.");
	}

	@Override
	public void select(int option) {
		
		switch (option) {
		
		case 1: this.tea = "레몬티";
			
			break;
		case 2 : this.tea = "홍차티";
			break;
		case 5:
			this.tea = "선택오류";
			System.out.println("3번을 선택할시에" + this.tea);
			break;
		
		default:
			break;
		
		}
		
	}

	@Override
	public void serve() {
		System.out.println("홍차를 제공한다.");
		System.out.println("-고객님 "+ tea+ "가 나왔습니다.");
		
		
	}

	
}
