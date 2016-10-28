package dia281016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		
	
		System.out.println("Por favor introduza dois numeros: ");
		
		int x, y;
		
		System.out.println("Primeiro número: ");
		x = (new Scanner(System.in)).nextInt();		
		System.out.println("Segundo numero: ");
		y = (new Scanner(System.in)).nextInt();
		
		System.out.println("Os numeros introduzidos são " + x + " e " + y);
		
		int soma = x+y;
		
		System.out.println("A soma dos numeros introduzidos é: " + soma);

}
}
