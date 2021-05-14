package BasicLambda8;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
	public static class ThreadConsumerTest{

		public static void main(String[] args) {
			List<Integer> main=new ArrayList<Integer>();
			main.add(1);
			main.add(2);
			main.add(3);
			main.add(4);
			new ThreadRunner(main);
		}


}
}