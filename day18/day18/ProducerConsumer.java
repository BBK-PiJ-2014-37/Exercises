package day18;
import java.util.*;
import java.util.concurrent.*;

	class Producer implements Runnable {
		private MyQueue queue;

		public Producer(MyQueue queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			try {
				for(int i=0; i <= 100; i++) {
					Date d = new Date();
					String s = d.toString();
					queue.add(s);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	class Consumer implements Runnable {
		private MyQueue queue;

		public Consumer(MyQueue queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			try {
				for(int i=0; i < 100; i++) {
					String s = queue.remove();
					System.out.println(s);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

public class ProducerConsumer {
	
	public static void main (String[] args) {
		MyQueue queue = new MyQueue();
		Runnable producer = new Producer(queue);
		Runnable consumer = new Consumer(queue);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}
}