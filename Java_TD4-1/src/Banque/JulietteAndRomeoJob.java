package Banque;

import ParallelThread.lettre;
import ParallelThread.numbre;

public class JulietteAndRomeoJob implements Runnable {
	private int amount;
	private String name;

	public void doWithdraw(int amount) {
		Account compte = new Account();
		System.out.println(compte.getBalance());
		try {
			Thread.sleep(500);
			int restant = compte.getBalance() - amount;
			compte.setBalance(restant);
			System.out.println(this.name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void run() {
		// TODO
		Account compte = new Account();
		for (int i = 0; i < 10; ++i) {
			int restant = compte.getBalance() - 10;
			compte.setBalance(restant);
			System.out.println(restant);

		}
	}

	public static void main(String[] args) {
			JulietteAndRomeoJob romeoJob = new JulietteAndRomeoJob();
			JulietteAndRomeoJob julietteJob = new JulietteAndRomeoJob();
			Thread t1 = new Thread(julietteJob);
			Thread t2 = new Thread(romeoJob);
			t1.start();
			t2.start();
	}
}
