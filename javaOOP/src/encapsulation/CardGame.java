package encapsulation;
/*
 버전업
 현재는 홍길동 승 이라고 나오는데
 개선을 해달라고 함
 ===========
 홍길동 : 6
 김유신 : 4
 홍길동 승리
 ===========
 * */

public class CardGame {
	/*======Field=====*/
	 
	private String winner, looser;
	private int winScore, looseScore; //멤변선언
	/*=====Constructor=====*/
	//생성자 단축키
	//ctrl + space
	public CardGame(){} // 디폴트 생성자
	
	public CardGame(CardBean bean1, CardBean bean2 ){ //괄호안에 파라미터까지 넣으면 setter역활까지 함
		
		//getter에서 문제해결 패턴
		//제일 먼저 리턴타입을 카피
		String winner ="",looser = "";
		int  winScore=0, looseScore=0;
		// 지역변수(로컬변수) 는 메모리 영역중에서 (콜)스택에 저장
		// 인스턴스변수(멤버변) 메모리 중에서 힘에 저장
		if (bean1.getNum() > bean2.getNum()) {
			winner = bean1.getName();
			looser = bean2.getName();
			winScore =bean1.getNum();
			looseScore=bean2.getNum();
			
		} else if(bean2.getNum()>bean1.getNum()){
			winner = bean2.getName();
			looser = bean1.getName();
			winScore =bean2.getNum();
			looseScore=bean1.getNum();
			
		}else{
			winner ="비김";
		}
		this.winner =winner;
		this.looser = looser;
		this.winScore = winScore;
		this.looseScore = looseScore;
	}
	
/*=====멤버메소드=====*/	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "===========\n" 
				+this.winner+": "+this.winScore+"\n"
				+this.looser+" : "+this.looseScore+"\n"
				+this.winner+" 승리\n"
				+"===========";
	}
	
}
