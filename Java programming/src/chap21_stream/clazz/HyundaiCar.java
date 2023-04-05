package chap21_stream.clazz;

public class HyundaiCar {

	private String model;
	private int price;

	//생성자
	public HyundaiCar(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	//getter setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
