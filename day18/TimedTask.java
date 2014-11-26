import java.util.*;

public class TimedTask implements Runnable {
	private final int ms;

	public TimedTask(int ms) {
		if (ms < 1000) {
			this.ms = ms;
		} else {
			this.ms = 1000;
		}
	}

	public void run() {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public int getDuration(){
		return this.ms;
	}

	public static void main(String[] args) {
		MyExecutor executor = new MyExecutor();
		for (int i = 0; i < 10; i++) {
			System.out.println("Maximum theoretical pending time: " + executor.getMaxPendingTime());
			executor.execute(new TimedTask(900));
		}
		System.out.println("Maximum theoretical pending time: " + executor.getMaxPendingTime());
		executor.shutdown();
	}
}

