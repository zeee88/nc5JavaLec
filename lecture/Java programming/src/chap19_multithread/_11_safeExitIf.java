package chap19_multithread;

import chap19_multithread.clazz.whileThread;

public class _11_safeExitIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		whileThread wt = new whileThread();
		
		wt.start();
		
		try {
			//main 스레드 1초 동안 일시 정지
			//whileThread가 1초 반복 실행
			Thread.sleep(1000);
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		wt.setStop(true);
	}

}
