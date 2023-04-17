package chap11_interface;

import chap11_interface.device.ElectronicDevice;
import chap11_interface.device.LgTv;

public class _03_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LgTv tv = new LgTv();
		
		tv.powerOn();
		tv.show();
		tv.powerOff();
		tv.sound();
		
		
		//static메소드를 사용하려면 static메소드가 선언된 클래스를 사용해서 호출한다.
		//static메소드는 상속받은 자식클래스에서 호출은 불가능하다.
		ElectronicDevice.warn();
		
	}

}
