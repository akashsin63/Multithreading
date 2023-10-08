package PrintTillHundred;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++) {
			PrintNumber print = new PrintNumber(i);
			Thread thread = new Thread(print);
			thread.start();
		}
	}

}
