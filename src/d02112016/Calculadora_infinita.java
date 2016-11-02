package d02112016;

import java.util.Scanner;

public class Calculadora_infinita {

	public Calculadora_infinita() {
		// TODO Auto-generated constructor stub
	
	int y, op;
	
	int t = 0;
	int x = 0;
	
	
	
	
	
		
	
	do{	
	
	if (t==0){
		System.out.println("Indique dois números: ");
		x = (new Scanner(System.in)).nextInt();
		y = (new Scanner(System.in)).nextInt();
	}
	else{
		System.out.println("Indique outro número: ");
		y = (new Scanner(System.in)).nextInt();
		}
	
	System.out.println("Indique qual a operação que deseja efectuar: \n 1 - soma\n 2 - subtracção\n 3 - divisão\n 4 - multiplicação \n 0 - Sair");
	op = (new Scanner(System.in)).nextInt();
	
	if(op==1){
		System.out.println("A soma dos numeros indicados é " + (x+y) + "\n");
		x=(x+y);
		t++;
	} else if(op==2){
		System.out.println("A subtração dos numeros indicados é " + (x-y) + "\n");
		x=(x-y);
		t++;
	}else if(op==3){
		System.out.println("A divisão dos numeros indicados é " + (x/y) + "\n");
		x=(x/y);
		t++;
	}else if(op==4){
		System.out.println("A multiplicação dos numeros indicados é " + (x*y) + "\n");
		x=(x*y);
		t++;
	}else if (op==0){
		System.out.println("Obrigada, volte sempre.");
	}else{
		System.out.println("Essa operação não é suportada \n");
	}
	}while(op != 0);
	
}
}
