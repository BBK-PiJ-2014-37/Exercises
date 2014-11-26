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
    }
    
    public void shutdown() {
    	int i = 0;
    	while(i < threadPool.length) {
        	try {
        		queue.put(new Killer());
        	} catch (InterruptedException ex) {
        		ex.printStackTrace();
        	}
        	i++;
        }  		
    }
    

   public int getMaxPendingTime() {
    	int i = 0;
    	int max = 0;
    	while(i < queue.size()) {
    		if (queue.iterator().hasNext()) {
                TimedTask t = (TimedTask)queue.iterator().next();
                max += t.getDuration();
            }
    		i++;
    	}
    	return max;
    }
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
        		if(r instanceof Killer) {
        			return;
        		}
                
			} catch (InterruptedException ex) {
        		ex.printStackTrace();
        	}
        	r.run();
		}
	}
}

class Killer implements Runnable {
    public void run() {}
}

    

