package waitnotify;

import java.util.List;

public class Remover implements Runnable {

	List<Integer> list;

	public Remover(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		for (int count = 0; count < 10; count++) {
			synchronized (list) {
			if (list.isEmpty()) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					/* e.printStackTrace(); */}
			}
			System.out.println(list.remove(0) + ": removed");
			 }
		}
	}

}
