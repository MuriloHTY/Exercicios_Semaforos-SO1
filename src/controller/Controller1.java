package controller;

public class Controller1 extends Thread{

	String nome;
	String sentido;
	public Controller1(String nome) {
		
		this.nome = nome;
		
	}

	@Override
	public void run() {
			
		if(nome.contains("Cima")) {
			this.sentido = "Baixo";
		}else if (nome.contains("Baixo")) {
			this.sentido = "Cima";
		}else if(nome.contains("Esquerda")) {
			this.sentido = "a Direita";			
		}else {
			this.sentido = "a Esquerda";			
		}
		
		System.out.println("O "+nome+" passou para "+sentido+".");
		
	}
}
