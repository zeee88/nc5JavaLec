package animal;

public class Cat extends animal_ {

	public String color;
	public boolean isFast;
	public String food;

	public Cat() {	
	}
	
	public Cat(boolean baby, int legCnt, int weight, String color, boolean isFast, String food) {
		super(baby, legCnt, weight);

		this.color = color;
		this.isFast = isFast;
		this.food = food;
	}
	
	public void grooming() {
		System.out.println("고양이과 동물은 그루밍을 합니다.");
	}

	public void eat() {
		System.out.println("고양이과 동물은" + this.food + "를 먹습니다.");
	}
}
