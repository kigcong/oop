package starbuks;
/*
 추상클래스
 - 추상메소드를 가지고 있는 것은 인터페이스와 동일하나, 구상메소드({}를 가지고 있는것)
 	도 추가로 가질 수 있고... 객체 생성시 개발자 마음대로 메소드를 추가하여도 문제가 없다. 
 * */
public abstract class DrinkRecipe {
	public void preapare(int option){
	boilwater();
	brew();
	pourIncup();
	select(option);
	serve();
	}

	private void boilwater(){
		System.out.println("물을 끓인다");
	}   // 바디가 있으면 abstract를 없애도 상관없고 마음대로 원하는대로 메소드를 만들수 있다. 
	
	//추상메소드는 private은 허용되지 않는다.
	//외부에서 접근 금지를 하려면 디폴트 상태public 삭제 (기본상태)로 둔다. 
	abstract void brew();
	private  void pourIncup(){
		System.out.println("물을 컵에 붓는다.");
	}; //구상 메소드
	abstract void select(int option);
	abstract void serve();
	
	
}
