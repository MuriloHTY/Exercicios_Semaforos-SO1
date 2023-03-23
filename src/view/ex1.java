package view;

import controller.Controller1;

public class ex1 {

	public static void main(String[] args) {

			Controller1 idCarro1 = new Controller1("Carro de Baixo");
			Controller1 idCarro2 = new Controller1("Carro de Cima");
			Controller1 idCarro3 = new Controller1("Carro da Esquerda");
			Controller1 idCarro4 = new Controller1("Carro da Direita");				
			idCarro1.start();
			idCarro2.start();
			idCarro3.start();
			idCarro4.start();

	}

}
