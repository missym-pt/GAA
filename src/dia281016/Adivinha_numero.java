package dia281016;

import java.util.Random;
import java.util.Scanner;

/*
 * Random : V
 */
public class Adivinha_numero {
	
	int escondido;
	final int VALORMAX = 5;
	
	public Adivinha_numero() {
		Random r = new Random();
		
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar() {
		
		int x;
		
		System.out.println("Tente adivinhar um número de 0 a 5. \nTem 3 tentativas. \nBoa sorte!!! \n:)");
		System.out.println("\nIntroduza a sua escolha: ");
		x =(new Scanner(System.in)).nextInt();
					
		int t = 1;			

		while (x != escondido && t<3){
			
			if (x>escondido){
				System.out.println("O número escolhido é muito grande. ");
			}
			else if (x<escondido){
				System.out.println("O número escolhido é muito pequeno.");
			}
								
			System.out.println("\nIntroduza outra escolha: ");
			x =(new Scanner(System.in)).nextInt();
			
			t++;
			
		}
		
		if (x == escondido){
			System.out.println("Viva! Acertou. ");
			
		}
		else {
			System.out.println("Esgotou o numero de tentativas.");
		}

		
	
	}
		
	}

