import dia281016.*;
import d02112016.*;

import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	
	}
	
	public static void main(String[]args){
		System.out.println("Escolha uma Opção: ");
		System.out.println("1-Calculadora Simples ");
		System.out.println("2-Total Receitas");
		System.out.println("3-Jogo do adivinha");
		System.out.println("4-Comparadores");
		System.out.println("5-Ciclos");
		System.out.println("6-Calculadora infinita");
		System.out.println("7-Blackjack");

		System.out.println("0-Sair");

		
		Scanner reader = new Scanner(System.in);
		int op=reader.nextInt();
	

		switch(op){
		case 1 : new CalculadoraSimples();break; 
		case 2 : new BalancoGAA();break;
		case 3 : new Adivinha_numero();break;
		case 4 : new Condicionais();
		case 5 : new Ciclos();break;
		case 6 : new Calculadora_infinita();break;
		case 7 : new Blackjack();break;

		/*
		 * 	System.out.println("Escolha uma Opção: ";
		*	System.out.println("1-While ";
		*	System.out.println("2-Do While";
		*	int op_cicles=reader.nextInt();
		*
		*	switch(op_cicles){
		*	 case 1 : new CalculadoraSimples();break; 
		case 2 : new BalacoGAA();break;	
		*	}
		*/
		case 0 : System.out.println("Adeus!!");break;
		default: System.out.println("Valor invalido");break;
		}
		}
		
		
	}

