
public class StudentNamePrinter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello I m Akash : This was run by thread : " + Thread.currentThread().getName());
	}

}
