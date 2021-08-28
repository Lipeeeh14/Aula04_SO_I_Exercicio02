package controller;

public class ThreadImprimeNum extends Thread {
	
	public ThreadImprimeNum() {}
	
	@Override
	public void run() {
		System.out.println(getId());
	}

}
