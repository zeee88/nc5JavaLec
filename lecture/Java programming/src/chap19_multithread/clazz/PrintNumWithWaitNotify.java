package chap19_multithread.clazz;

public class PrintNumWithWaitNotify {

	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	//동기화 메소드
	public synchronized void printNum1(int num) {
		this.setNum(num);
		for(int i = 1; i <= this.num; i++) {
			System.out.println("스레드 1: " + (i*2-1));  //스레드1에는 홀수 출력
			notify();   //다른 스레드를 실행 대기 상태로 변경
						//wait()가 호출되어 일시 정지 상태로 변경되기 전에 호출해야 한다.
			try {
				wait();  //자신을 일시 정지 상태로 변경
			}catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	
	public synchronized void printNum2(int num) {
		//동기화 블록 : 선점한 스레드의 작업이 끝날때까지 실행안되도록
		//동기화 블록 선언
		synchronized(this) {
			this.setNum(num);
		}
		for(int i = 1; i <= (this.num * 2); i++) {
			System.out.println("스레드 2: " + (i*2));  //스레드2에는 짝수 출력
			
			notify();   //다른 스레드를 실행 대기 상태로 변경
			//wait()가 호출되어 일시 정지 상태로 변경되기 전에 호출해야 한다.
				try {
						wait();  //자신을 일시 정지 상태로 변경
					}catch(InterruptedException ie) {
							System.out.println(ie.getMessage());
						
		}
	}
	
	
}

}
