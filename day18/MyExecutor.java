import java.util.*;
import java.util.concurrent.*;


public class MyExecutor implements Executor {
	private BlockingQueue<Runnable> queue;
	private Thread[] threadPool;

	public MyExecutor(int queueSize, int poolSize) {
		this.queue = new  LinkedBlockingQueue<Runnable>(queueSize); 
		this.threadPool = new Thread[poolSize];
	}

	public MyExecutor() {
		this(1000, 5);
	}
  	
 
    public void execute(Runnable r) {
        try {
        	queue.put(r);
        } catch (InterruptedException ex) {
        	ex.printStackTrace();
        }
        if (threadPool[0] == null) {
        	int i = 0;
        	while(i < threadPool.length) {
        		threadPool[i] = new Thread(new Worker(queue));
        		threadPool[i].start();
        		i++;
        	}
        }
        
        /* put(E e)
    	Inserts the specified element at the tail of this queue, 
    	waiting if necessary for space to become available.
 		*/
    }
    //the queue doesn't take null. Create a different class of workers?
    public void shutdown() {
    	int i = 0;
    	while(i < threadPool.length) {
        	try {
        		queue.put(null);
        	} catch (InterruptedException ex) {
        		ex.printStackTrace();
        	}
        	i++;
        }  		
    }

   /* public int getMaxPendingTime() {
    	int i = 0;
    	int max = 0;
    	while(i < queue.size()) {
    		if (queue.iterator().hasNext()) {
    			int d = queue.iterator().next().getDuration(); //is in TimedTask, but not in TextLoop. 
    			//Should I create a new executable???
    			max += d;
    		}
    		i++;
    	}
    	return max;
    }
    */


}

class Worker implements Runnable {
	private BlockingQueue<Runnable> queue;

	public Worker(BlockingQueue<Runnable> queue) {
		this.queue = queue;
	}

	public void run() {
		while (true) {
			Runnable r = null;
			try {
        		r = queue.take();
        		if(r == null) {
        			return;
        		}
			} catch (InterruptedException ex) {
        		ex.printStackTrace();
        	}
        	r.run();
		}
	}

    /* take()
	Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
	*/
}
