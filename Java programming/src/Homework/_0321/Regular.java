package Homework._0321;

public class Regular extends employee {

	private double bonus;

	public Regular(int eno, String name, long pay, double bonus, int type) {
		super(eno, name, pay, type);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		return this.pay / 12 + this.bonus / 12;
		
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("  ");
	}
	
}
