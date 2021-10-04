class ThreadInterface implements Runnable {
	public void run() {
		try {
	        	Thread.sleep(1000);
			System.out.println("I am thread 1");
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class ThreadClass extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("I am thread 2");
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class MyThread {
	public static void main(String[] args) {
		ThreadInterface interfaceThread = new ThreadInterface();
		Thread thread1 = new Thread(interfaceThread);
		ThreadClass thread2 = new ThreadClass();
		
		thread1.start();
		thread2.start();
	}
}
