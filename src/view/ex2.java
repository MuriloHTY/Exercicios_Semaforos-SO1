package view;

import java.util.concurrent.Semaphore;
import controller.Controller2;

public class ex2 {
	
	public static Semaphore semaforo;

	public static void main(String[] args) {
		
		int Pessoas = 1;
		
		semaforo = new Semaphore(Pessoas);
		
		for(int i = 0; i <= 4; i++) {
			Thread corredor = new Controller2(i, semaforo);
			corredor.start();
		}

	}

}