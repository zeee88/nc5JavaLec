package chap19_multithread.clazz;

public class NonSyncThread2 extends Thread{
	private printNumWithoutSync pns;

	public void setPns(printNumWithoutSync pns) {
		this.pns = pns;
	}
	
	public printNumWithoutSync getPns() {
		return pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(20);
	}
}
