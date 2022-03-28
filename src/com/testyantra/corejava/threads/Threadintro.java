package com.testyantra.corejava.threads;

public class Threadintro extends Thread {

	int max;

	public Threadintro(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		while (max > 0) {
			if (max % 2 == 0) {
				System.out.println(max);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			max--;
		}
	}

	public static void main(String[] args) {
		Threadintro ti1 = new Threadintro(10);
		ti1.start();
		Threadintro ti2 = new Threadintro(20);
		ti2.start();

	}

}
