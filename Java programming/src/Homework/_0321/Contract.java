package Homework._0321;

public class Contract extends employee{

	private int workDay;
	
	public Contract(int eno, String name, long pay, int workDay, int type) {
		super(eno, name, pay, type);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		return this.pay * this.workDay;
		
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println();
		System.out.println();
	}

}
