package day18;
import java.util.*;
import java.util.concurrent.*;

public class MyQueue {
	private LinkedList<String> queue;

	public MyQueue() {
		this.queue = new LinkedList<String>();
	}

	public synchronized void add (String s) throws InterruptedException {
		while (queue.size() >= 10) {
			wait();
		}
		queue.addLast(s);
		if (queue.size() == 1) {
			notifyAll();
		}
	}

	public synchronized String remove() throws InterruptedException {
		while(queue.isEmpty()) {
			wait();
		}
		String result = queue.removeFirst();
		if (queue.size() == 9) {
			notifyAll();
		}
		return result;
	}
}