  package waitnotify;

import java.util.List;

public class Adder implements Runnable {
	List<Integer> list;
	
	public Adder(List<Integer> list)
	{
		this.list = list;
	}

	@Override
	public void run() {
		for(int count = 0;count < 10; count++)
		{
			synchronized (list) {
				list.add(count);
				System.out.println(count+": added");
				list.notify();
			}
		}
	}

}
