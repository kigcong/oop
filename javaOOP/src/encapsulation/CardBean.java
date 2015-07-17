package encapsulation;
/*
 @Date : 2015.07.15
 @Autor : me
 @Story : 생서자 문법
 생성자는 setter를 통해 값을 할당하는 
 기능을 보강하여, 객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 ★★★메소드 이다.
  */

public class CardBean {
	/*===== Field =====*/

	private String name,name2; //  멤버필드 변수는 초기화를 하지 않는다.  get으로 받는 변수는 지워져야 메모리상 유리하다
	private int num,num2;
/*===== Constructor =====*/	
	// 생성자 위치는 (멤버)필드 와 메소드 영역 사이에 위치 
	// 생성자 모양
	// public 클래스이름(){}
	public CardBean(){
	} //디폴트 생성자
	public CardBean(String name) {//파라미터 생성자
		//setter 역활을 겸용하는 생성자
	this.name = name;
	
}
	//디폴트 생성자는 개발자가 직접 만들지 않아도 
	//프로그램 내부에서는 생성되 있는 것으로 인식한다.
	//그런데, 이것을 꺼내 든 이유는 
	//new 키워드를 통한 객체생성 역활뿐 아니라 
	//생성과 동시에 값을 할당하는 기능을 추가 시키기 위해서...
	
	
/*===== Method =====*/	

public String getName() {
	return name;
}
public int getNum() {
	return num;
}
public String getWinner() {
	//getter에서 문제해결 패턴
	//제일 먼저 리턴타입을 카피
	String winner="";
	if (this.num > this.num2) {
		
		winner = name + "승리";
		
	} else if(this.num2>this.num){
		winner = name2 + "승리";

	}else{
		winner ="비김";
	}
	return winner;
}



@Override
public String toString() {
	// TODO Auto-generated method stub
	return "["+name+" :" +num+"] vs ["+name2+" : "+num2+"]\n"
			 +this.getWinner();
}
}
