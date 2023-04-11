package test;

//부모 클래스
class Tv{
	
	//부모 멤버 5개
	boolean power;
	int channel;
	
	void power() { power =! power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}	


//자식 클래스
class SmartTv extends Tv{
	//자식 멤버 2개, 부모 멤버 5개 => 총 7개
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}



public class inherit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello, World");
		stv.caption = true;
		
	}

}

