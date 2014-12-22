package day18;
public class Application {
	private MyExecutor executor;


	public request(int duration) {
		executor.execute(new TimedTask(duration))
	}

	public int getMaxWait() {
		return executor.getMaxPendingTime();
	}
}