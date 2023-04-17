package Homework._0321;

public class Temporary extends employee{

	private int hireYear;

	public Temporary(int eno, String name, long pay, int hireYear, int type) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return this.pay /12;
		
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
	}


	

}
