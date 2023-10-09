package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i =0; i<200; i++) {
			NumberPrinterWithExec numberpri = new NumberPrinterWithExec(i);
			executor.execute(numberpri);
			}
		
		executor.shutdown();
	}

}
