package chap11_interface.device;

public class SamsungTv implements TV{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 화면을 켭니다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비 스피커를 켭니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("삼성티비" + channel + "로 변경합니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비를 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비를 끕니다.");
	}
}
