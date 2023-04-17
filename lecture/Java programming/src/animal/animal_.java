package animal;

public class animal_ {

	public boolean baby;
	public int legCnt;
	public int weight;

	public animal_() {
	}
	
	public animal_(boolean baby, int legCnt, int weight) {
		this.baby = baby;
		this.legCnt = legCnt;
		this.weight = weight;
		
	}

//	public static void legCnt(){
//		System.out.println("다리는 " + this.legCnt + "개 입니다.");
//	}

	public static void baby() {
		System.out.println("새끼를 낳습니다.");
	}
	
	public void grooming() {
	}
	public void eat() {
	}
}
