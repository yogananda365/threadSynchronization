package waitnotify;

import java.util.ArrayList;
import java.util.List;

public class threads {
	
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		Thread thread1 = new Thread(new Adder(list));
		Thread thread2 = new Thread(new Remover(list));
		thread1.start();
		thread2.start();
	}
}
