package animal;

public class Tiger extends animal_{

	public String meat;
	public boolean isSwimming;
	public boolean hasPattern;
	
	
	public Tiger(boolean baby, int legCnt, int weight, String meat, boolean isSwimming, boolean hasPattern) {
		
		super(baby, legCnt, weight);
		
		this.meat = meat;
		this.isSwimming = isSwimming;
		this.hasPattern = hasPattern;
	}
	
	public void type() {
		System.out.println("호랑이는 육식동물 입니다.");
	}
	
	public void eat() {
		System.out.println("호랑이는 " + this.meat + "를 먹습니다.");
	}
	
}
