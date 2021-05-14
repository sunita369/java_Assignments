package BasicLambda8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class ThreadRunner implements Runnable {
	Thread t;
	List<Integer> list=new ArrayList<Integer>();
	ThreadRunner(List<Integer> list){
		t=new Thread(this);
		t.start();
		this.list=list;
	}
	public void run(){
		Consumer<Integer> consumer = (x) -> System.out.println(x);
		this.list.forEach(consumer);
	}
	
}

