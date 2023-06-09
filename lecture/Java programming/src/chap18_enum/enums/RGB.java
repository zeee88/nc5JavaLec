package chap18_enum.enums;

public enum RGB {
	//상수명 RED("red", 255, 0, 0),
	//     GREEN("green", 0, 255, 0),
	//     BLUE("blue", 0, 0, 255)
	
	//열거형의 선언   //공통명칭(상수1, 상수2, 상수3.....)
	RED("red", 255, 0, 0){
		public void makeWhite() {
		String[] color = {"red", "green", "blue"};
		
		int index = 0;
		for(String s : color) {
			if(!s.equals(this.getColor())){
			if(index == 0) {
				System.out.println(s + ", ");
			}else {
				System.out.println(s + ", ");
			}
			
			index++;
		}
		}
		System.out.println("색상이 부족합니다.");
		}
		},
	GREEN("green", 0, 255, 0){
			public void makeWhite() {
				String[] color = {"red", "green", "blue"};
				
				int index = 0;
				for(String s : color) {
					if(!s.equals(this.getColor())){
					if(index == 0) {
						System.out.println(s + ", ");
					}else {
						System.out.println(s + ", ");
					}
					
					index++;
				}
				}
				System.out.println("색상이 부족합니다.");
				}
				},
		
	BLUE("blue", 0, 0, 255){
					public void makeWhite() {
						String[] color = {"red", "green", "blue"};
						
						int index = 0;
						for(String s : color) {
							if(!s.equals(this.getColor())){
							if(index == 0) {
								System.out.println(s + ", ");
							}else {
								System.out.println(s + ", ");
							}
							
							index++;
						}
						}
						System.out.println("색상이 부족합니다.");
						}
						
				};
	
	//상수의 타입 지정  // final은 자동으로 붙여짐. 붙여도 되고 안붙여도 됨.
	private final String color;
	private final int i;
	private final int j;
	private final int k;
	
	//생성자 호출
	RGB(String color, int i, int j, int k) {
		this.color = color;
		this.i = i;
		this.j = j;
		this.k = k;
	}
	//상수는 private이므로 getter.setter만들기
	public String getColor() {
		return color;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	public int getK() {
		return k;
	}
	
	public abstract void makeWhite();
	
}
