package starbuks;

public class AngelTea extends DrinkRecipe {
	private String tea;

	@Override
	void brew() {
		// TODO Auto-generated method stub

	}

	@Override
	void select(int option) {
switch (option) {
		
		case 1: this.tea = "레몬티";
			
			break;
		case 2 : this.tea = "홍차티";
			break;
		case 5:
			this.tea = "선택오류";
			System.out.println("3번을 선택할시에" + this.tea);
			break;
		
	}
	}

	@Override
	void serve() {
		System.out.println("-고객님 " + tea + "가 나왔습니다.");

	}

}
