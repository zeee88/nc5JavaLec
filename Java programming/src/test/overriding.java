package test;

class Mypoint extends Object {  //자식클래스. Object클래스는 모든 클래스의 조상
	int x;
	int y;

	Mypoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {        // Object클래스의 toString()을 오버라이딩
		return "x: " + x + "Y: " + y;     //부모의 메서드를 자신에 맞게 변경함
	}
}

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint p = new Mypoint(3, 5);

		System.out.println(p.toString());     //자식의 toString() 메소드 출력

	}

}
