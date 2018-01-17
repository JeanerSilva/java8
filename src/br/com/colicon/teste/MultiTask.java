package br.com.colicon.teste;

public class MultiTask {
	public static void main(String[] args) throws InterruptedException {
		Tarefa1 tarefa1 = new Tarefa1();
		Thread t1 = new Thread (tarefa1);
		t1.start();
		
		
		Tarefa2 tarefa2 = new Tarefa2();
		Thread t2 = new Thread (tarefa2);
		t2.start();
		
		t1.join();
		t2.join();
		
	}
}

class Tarefa1 implements Runnable {

	@Override
	public void run() {
		conta1();
		conta2();

	}
	
	 void conta1 () {
		synchronized (this) {
			for (int x = 0; x < 1000; x++) {
				System.out.println("111111");
			}
		}
		 
	}
	 
	 synchronized void conta2 () {
			synchronized (this) {
				for (int x = 0; x < 1000; x++) {
					System.out.println("2222222");
				}
			}
			 
		}

}

class Tarefa2 implements Runnable {

	@Override
	public void run() {
		for (int x = 0; x < 1000; x++) {
			System.out.println("3333");
		}

	}
}