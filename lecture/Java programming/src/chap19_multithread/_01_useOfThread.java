package chap19_multithread;

public class _01_useOfThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i ++) {		//스레드가 처리할 소스코드
					System.out.println(i);
					
					try {
						//현재 실행되는 스레드 중지 0.5초동안
						//멈추면 다음 스레드 동작
						//대기중인 메인스레드로 돌아간다.
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();	
		//.printStackTrace(); 예외 발생 시 예외 정보(예외가 발생한 위치, 예외 메시지, 예외 타입)를 출력하는데 사용
					}
				}
			}
		});
		
		//Thread t1 = new Thread();
		
		//2. 스레드의 실행
		thread.start();
		//t1.start();
		
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
			
			try {
				//현재 실행되는 스레드 중지 0.5초동안
				//멈추면 다음 스레드 동작
				//대기중인 서브스레드로 돌아간다.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
		
		
		