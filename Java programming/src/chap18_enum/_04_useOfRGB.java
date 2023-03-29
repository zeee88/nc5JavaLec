package chap18_enum;

import chap18_enum.enums.RGB;

public class _04_useOfRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = RGB.valueOf(RGB.class, "BLUE");
		
		System.out.println("빨간색은 " + red.getI() + ", " + red.getJ() + ", " + red.getK());
		System.out.println("초록색은 " + green.getI() + ", " + green.getJ() + ", " + green.getK());
		System.out.println("파란색은 " + blue.getI() + ", " + blue.getJ() + ", " + blue.getK());
		
		red.makeWhite();
		green.makeWhite();
		blue.makeWhite();
	}

}
