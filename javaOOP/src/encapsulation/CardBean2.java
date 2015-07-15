package encapsulation;

public class CardBean2 {

	private String name,name2; //  멤버필드 변수는 초기화를 하지 않는다.  get으로 받는 변수는 지워져야 메모리상 유리하다
	private int num,num2;

public void setName(String name) {  
	// () 안에 값을 파라미터라하고 소속은 지변
	this.name = name;
	//this.name 은 인스턴스(멤변)이고
	//=name 은 파라미터로 넘어온 지변(스캐너가 받은값)
	//스캐너가 받아 논 값을 가진 지변 값을
	//멤변 name에 할당하라
	//파라미터 값과 멤변값의 이름은 달라도 상관없다.
	//단, 데이터타입(String,int)은 반드시 일치해야 한다.
	}
public void setNum(int num) {
	this.num = num;
}
public void setName2(String name2) {
	this.name2 = name2;
}
public void setNum2(int num2) {
	this.num2 = num2;
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
