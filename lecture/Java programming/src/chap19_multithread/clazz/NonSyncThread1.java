package chap19_multithread.clazz;

public class NonSyncThread1 extends Thread{
	private printNumWithoutSync pns;

	public NonSyncThread1() {
		pns.setNum(10);
	}
	
	public void setPns(printNumWithoutSync pns) {
		this.pns = pns;
	}
	
	@Override
	public void run() {
		pns.printNum1(10);
	}
}
