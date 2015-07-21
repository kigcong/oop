package abstraction;
/*
 @DATE : 2015. 07. 21
 @AUthor : me
 @Story : 추상화 + 다양성의 결합형태 보는 예제 
 * */
public interface Fruitsinterface {
	/*
	 객체 지향 언어에서 다양성의 핵심원리
	 - 인터페이스를 구현하는 클래스들은 그 인터페이스 타입에 포함이 된다.
	 - 아래와 같은 상속의 예에서
	 class child extends Parent가 있다고 하면 
	 Child 가 Parent 의 타입에 포함(종속)된다.
	 이처럼 인터페이스도 그를 구현(implements)한 인터페이스 타입에 포함이 된다.
	 * */
	public void display(String str); // 인터페이스 이기 때문에 get/set 도 안쓰고 필드도 없고 추상만 사용한다. 그렇게 때문에 String 표현
	

}
