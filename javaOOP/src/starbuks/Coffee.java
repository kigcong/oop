package starbuks;

public class Coffee implements Recipe {

	private String black;
	private String sugar;
	private String milk;
	/* ===== 필드 ===== */
	private String coffee;

	/* === 생성자 === */
	/* === 멤버메소드 === */ // 이 안에서 하기위해서 멤버메소드 사용필요 없음(implement)
	@Override
	public void boilwater() {

		System.out.println("물을 끓인다.");

	}

	@Override
	public void brew() {
		System.out.println("커피를 내린다.");
	}

	@Override
	public void pourIncup() {
		System.out.println("물을 컵에 붓는다.");
	}

	@Override
	public void select(int option) {
		System.out.println("성탕 첨가 여부를 손님에게 묻는다.");
		switch (option) {
		case 1:
			this.coffee = "블랙";

			break;
		case 2:
			this.coffee = "밀크";

			break;

		case 3:
			this.coffee = "선택오류";
			System.out.println("3번을 선택할시에" + this.sugar);
			break;
		default:
			break;
		}
	}

	@Override
	public void serve() {
		System.out.println("커피를 제공한다.");

		System.out.println("-고객님" + coffee + "커피가 나왔습니다.");
	}

}
