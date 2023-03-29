package chap10_abstraction.product;

public abstract class Tv {
	public int lastChannel = 1;
	
	public abstract void powerOn();
	
	
	public abstract void powerOff();
	
	
	public abstract void operate(int channel);
	
	
	public void moveTo(int channel) {
		System.out.println(channel + "로 이동합니다.");
	}
	
	public void channelUp() {
		lastChannel++;
	}
	
	public void channelDown() {
		lastChannel--;
	}
	
	
	
}
