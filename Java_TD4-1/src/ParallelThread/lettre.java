package ParallelThread;

public class lettre implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}
	}
}
