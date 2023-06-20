package com.bit.springboard.coupling;

public class CarOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//의존성이 두개가 생기면서 결합도가 높아진다.
		
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();
		
		kCar.engineOn();
		kCar.speedUp();
		kCar.speedDown();
		kCar.engineOff();
		
		
		hCar.engineOn();
		hCar.speedUp();
		hCar.speedDown();
		hCar.engineOff();
		
	}

}
