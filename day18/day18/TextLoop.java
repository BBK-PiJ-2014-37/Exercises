import java.util.concurrent.*;

public class TextLoop implements Runnable {
	public static final int COUNT = 10;
	private final String name;

	public TextLoop(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}

	public static void main(String args[]) {
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1") && !args[0].equals("2"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println("mode 0: without threads");
			System.out.println("mode 1: with ExecutorService");
			System.out.println("mode 2: with MyExecutor");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
			Runnable r = new TextLoop("Thread " + i);
			r.run();
			}
		} else if (args[0].equals("1")){
			ExecutorService threadPool = Executors.newFixedThreadPool(4);
			for (int i = 0; i < 10; i++) {
				threadPool.submit(new TextLoop("Thread " + i));
			}
			threadPool.shutdown();
		} else {
			MyExecutor executor = new MyExecutor();
			for (int i = 0; i < 10; i++) {
				executor.execute(new TextLoop("Thread " + i));
			}
			executor.shutdown();
		}
	}
}


