

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world: printed by thread : " + Thread.currentThread().getName());
		
		
		StudentNamePrinter st = new StudentNamePrinter();
		Thread thread = new Thread(st);
		thread.start();
	}

}
