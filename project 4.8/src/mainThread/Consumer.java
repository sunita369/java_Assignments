package mainThread;


class SeqRunnable extends Consumer{
	Demo sp;
	  int result;
	  static Object sharedObj = new Object();
	  SeqRunnable(Demo sp, int result){
	    this.sp = sp;
	    this.result = result;
	  }
	  public void run() {
	    sp.printNum(result);
	  }
	}
	public class Consumer {
	  final static int NUMBERS_IN_SEQUENCE = 10;
	  final static int NUMBER_OF_THREADS = 3;
	  public static void main(String[] args) {
	    
		  Demo sp = new Demo(NUMBERS_IN_SEQUENCE, NUMBER_OF_THREADS);
	    
	    Thread t1 = new Thread("Thread1");
	    Thread t2 = new Thread("Thread2");
	    Thread t3 = new Thread("Thread3");

	    t1.start();
	    t2.start();
	    t3.start();
	  }
	}

