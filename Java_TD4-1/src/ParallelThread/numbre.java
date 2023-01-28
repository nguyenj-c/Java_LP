package ParallelThread;

public class numbre implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 26; i++) {
			System.out.println(i);
		}
	}

}
