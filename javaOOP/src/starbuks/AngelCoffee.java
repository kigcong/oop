package starbuks;
/*
 extends 는 컨트롤 스페이스로 
 @Override를 호풀하라고 했는데 그것은 extends 클래가 일반클래스인 경우이고
 추상클래스는 일반클래스 + 인터페이스 형태이므로 인터페이스의 특징을 갖게 됩니다.
 따라서, extends 이지만 부모클래스가 추상클래스라면 unimplements를 해줘야 합니다.
 * */
public class AngelCoffee extends DrinkRecipe{
private String coffee;



	@Override
	void brew() {
		System.out.println("티백을 내린다.");
		
	}

	@Override
	void select(int option) {
		switch (option) {
		case 1:
			this.coffee = "블랙";

			break;
		case 2:
			this.coffee = "밀크";

			break;

		case 3:
			this.coffee = "선택오류";
			break;
		
		}
	}

	@Override
	void serve() {
		System.out.println("-고객님" + coffee + "커피가 나왔습니다.");
		
	}

}
