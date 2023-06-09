package chap18_enum.enums;

public enum ValueMonth {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8),
	SEP(9), OCT(10), NOV(11), DEC(12);
	
	private int monthVal;
	
	ValueMonth(int monthVal) {
		this.monthVal = monthVal;
	}

	public int getMonthVal() {
		return monthVal;
	}
}
