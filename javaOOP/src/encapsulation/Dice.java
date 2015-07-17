package encapsulation;

public class Dice {
/*=====Field=====*/
 
	

private int num; // 주사위는 하나의 숫자만 갖는다.  // 이곳 에 숫자가 들어가는 부분

/*=====Constructor=====*/
//생성자 단추키는 CTRL + SPACE
public Dice(){
	this.num = (int) ((Math.random()*6)+1);
} 

	
/*===== MemberMethod =====*/
public int getNum() {    // 맨 위에 필드에있는 num을 가르킴
	return num;
}

}


	

	
	
	






