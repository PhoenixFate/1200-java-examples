package chapter06;

public class ThreadState124 implements Runnable{
	
	public synchronized void waitForSecond() throws InterruptedException{
		wait(500);
	}
	
	public synchronized void waitForYear() throws InterruptedException{
		wait();
	}
	public synchronized void notifyNow(){
		notify();
	}
	@Override
	public void run() {
		try {
			waitForSecond();
			waitForYear();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
