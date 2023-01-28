package test;

import ParallelThread.lettre;
import ParallelThread.numbre;

public class test_thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new lettre());
		Thread t2 = new Thread(new numbre());
		t1.start();
		t2.start();
	}
}
