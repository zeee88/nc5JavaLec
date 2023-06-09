package chap19_multithread;

public class _02_anonymousThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스레드에서 익명 클래스를 사용하는 이유는, 스레드 객체를 생성하는데 있어서 코드의 간결성과 가독성을 높일 수 있어서
		//익명 클래스를 사용하면 스레드 객체를 생성하는 과정을 간결하게 표현 가능하게 함.
		
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					
					System.out.println(i);
					
					
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
			}
		};					//서브 스레드 클래스 끝
		
		t.start();
		
		for(int i = 6; i <= 10; i++) {		//메인 스레드
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
