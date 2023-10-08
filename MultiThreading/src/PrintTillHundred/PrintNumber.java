package PrintTillHundred;

public class PrintNumber implements Runnable {
	
	private int numberToPrint;
	
	public PrintNumber(int numberToPrint) {
		this.numberToPrint = numberToPrint;
	}
	@Override 
	public void run() {
		
		System.out.println("priniting number : " + this.numberToPrint + "By this thread : " + Thread.currentThread().getName());
		
	}
}
