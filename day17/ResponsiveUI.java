import java.util.*;

class Waiter implements Runnable {
	private final int ms;
	private final int taskNo;
	private final Finisher finisher;

	public Waiter(int taskNo, int ms, Finisher finisher) {
		this.taskNo = taskNo;
		this.ms = ms;
		this.finisher = finisher;
	}

	public void run() {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		finisher.finish(taskNo);
	}
}

class Finisher {
	private List<Integer> done;

	public Finisher() {
		done = new ArrayList<Integer>();
	}

	public synchronized void finish(int taskNo) {
		done.add(new Integer(taskNo));
	}

	public synchronized String getObits() {
		if (done.size() == 0) {
			return null;
		}
		List<Integer> l = done;
		done = new ArrayList<Integer>();
		return l.toString();
	}
}

public class ResponsiveUI {
	public static void main(String[] args) {
		Finisher finisher = new Finisher();
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the duration in ms of task " + i + ": ");
			int ms = Integer.parseInt(System.console().readLine());
			Waiter waiter = new Waiter(i, ms, finisher);
			Thread thread = new Thread(waiter);
			thread.start();
			String finished = finisher.getObits();
			if (finished != null) {
				System.out.println("Finished tasks: " + finished);
			}
		}
	}
}