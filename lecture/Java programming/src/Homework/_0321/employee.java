package Homework._0321;

public abstract class employee {

	public int eno;
	public String name;
	public long pay;
	public int type;  //1. 정규직  2. 계약직  3. 임시직
	
	//생성자. 생성자 이름은 클래스 이름과 같아야 한다. 객체를 초기화하는 메소드이기 때문
	public employee(int eno, String name, long pay, int type){
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	//추상메서드. 월급을 받아오는 메소드. 자식클래스에서 출력
	public abstract double getMonthPay();
	
	//일반메서드. 정보를 출력해주는 메소드. 부모클래스에서 출력
	public void showEmployeeInfo() {
		System.out.println("사번 " + this.eno);
		System.out.println("이름 " + name);
		System.out.println("급여 " + pay);
		System.out.println("월급 " + getMonthPay());
		
	}
	
}
