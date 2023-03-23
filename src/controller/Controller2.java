package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Controller2 extends Thread {

	Random rd = new Random();

	private int numPessoa;
	private Semaphore semaforo;
	private static int distancia = 0;

	public Controller2(int numPessoa, Semaphore semaforo) {
		this.numPessoa = numPessoa;
		this.semaforo = semaforo;
	}

	public void run() {
		try {
			percorrerCorredor();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cruzarPorta() {
		try {
			semaforo.acquire();
			Thread.sleep((rd.nextInt(2) + 1) * 1000);
			System.out.println("A "+numPessoa+"° pessoa passou pela porta.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
		
	}

	public void percorrerCorredor() {
		if (distancia < 200) {
			for (int i = 0; i < 200; i++) {
				distancia = distancia + rd.nextInt(3) + 4;
			}
		} else {
			cruzarPorta();
		}

	}

}