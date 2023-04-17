package chap15_usefulClass;

import java.text.DecimalFormat;

public class _23_decimalFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자 자리수 표시
		DecimalFormat df = new DecimalFormat("###,###");
		
		int price1 = 100000;
		int price2 = 1000000000;
		
		System.out.println(df.format(price1));
		System.out.println(df.format(price2));
		
	}

}
