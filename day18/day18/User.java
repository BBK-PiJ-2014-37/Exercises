package day18;
import java.util.*;

class User implements Runnable {
	private Application app;
	private int patience;
	private int ms;

	public User(Application app, int patience) {
		this.app = app;
		this.patience = patience;
	}

	public void run() {
		try {
			Thread.sleep(ms?);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public static void main(String[] args) {
		Application app = new Application();
		for (int i = 0; i < 10; i++) {
			ExecutorService threadPool = Executors.newFixedThreadPool(4);
			for (int i = 0; i < 10; i++) {
				threadPool.submit(new User(app,??));
			}
			threadPool.shutdown();
	}
}