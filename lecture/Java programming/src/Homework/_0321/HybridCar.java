package Homework._0321;

public class HybridCar implements ElectronicCar, FuelCar{


	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("가속합니다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("감속합니다.");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료가 필요합니다.");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("충전이 필요합니다.");
	}

}
