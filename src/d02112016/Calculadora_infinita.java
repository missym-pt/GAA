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
		System.out.println("Indique dois n�meros: ");
		x = (new Scanner(System.in)).nextInt();
		y = (new Scanner(System.in)).nextInt();
	}
	else{
		System.out.println("Indique outro n�mero: ");
		y = (new Scanner(System.in)).nextInt();
		}
	
	System.out.println("Indique qual a opera��o que deseja efectuar: \n 1 - soma\n 2 - subtrac��o\n 3 - divis�o\n 4 - multiplica��o \n 0 - Sair");
	op = (new Scanner(System.in)).nextInt();
	
	if(op==1){
		System.out.println("A soma dos numeros indicados � " + (x+y) + "\n");
		x=(x+y);
		t++;
	} else if(op==2){
		System.out.println("A subtra��o dos numeros indicados � " + (x-y) + "\n");
		x=(x-y);
		t++;
	}else if(op==3){
		System.out.println("A divis�o dos numeros indicados � " + (x/y) + "\n");
		x=(x/y);
		t++;
	}else if(op==4){
		System.out.println("A multiplica��o dos numeros indicados � " + (x*y) + "\n");
		x=(x*y);
		t++;
	}else if (op==0){
		System.out.println("Obrigada, volte sempre.");
	}else{
		System.out.println("Essa opera��o n�o � suportada \n");
	}
	}while(op != 0);
	
}
}
