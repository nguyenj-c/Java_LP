package waitThread;

import java.util.ArrayList;
import java.util.Random;

public class waitThread {
	public static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            Random generator = new Random();
            for (int i = 0; i < 10; ++i) {
                try {
                    Thread.sleep(generator.nextInt(200));
                    System.out.println(this.name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 3; ++i)
            threads.add(new Thread(new Task("Task n°" + (i+1))));

        for (Thread thread : threads)
            thread.start();

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All done.");
    }

}
