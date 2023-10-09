package Executor;

public class NumberPrinterWithExec implements Runnable {
	private int numberPrint;
	
	public NumberPrinterWithExec(int numberPrint) {
		this.numberPrint = numberPrint;
		
	}
	
	@Override
	public void run() {
		System.out.println("Printin the number :" + numberPrint +" from thread :" + Thread.currentThread().getName());
	}

}
