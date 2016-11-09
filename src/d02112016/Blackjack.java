package d02112016;

import java.util.Scanner;
import java.util.Random;

public class Blackjack {

	

		int Pcard, Dcard, PFigcard, DFigcard;
		int Pblack=0;
		int Dblack=0;
		int cont=1;
		final int VALORMAX = 12;
		
		public Blackjack() {
			
			Random r = new Random();
			
			System.out.println("Vamos jogar blackjack \n\n");
				
			int t=1;
					
			do {
				
				Pcard = (r.nextInt(VALORMAX))+1;
				Dcard = (r.nextInt(VALORMAX))+1;
				
				if(Pcard>10){
					PFigcard=Pcard;
					Pcard=10;
				}else if(Dcard>10){
					DFigcard=Dcard;
					Dcard=10;
				}
				
				Pblack = Pblack + Pcard;
				Dblack = Dblack + Dcard;
				 							
			if(t==1){
				if(PFigcard==11){
					System.out.println("A sua " + t + "ª carta é Dama\n");
				}else if (PFigcard==12){
					System.out.println("A sua " + t + "ª carta é Valete\n");
				}else if (PFigcard==13){
					System.out.println("A sua " + t + "ª carta é Rei\n");
				}else{			
					System.out.println("A sua " + t + "ª carta é " + Pcard);
				}
			
				System.out.println("\nNa primeira jogada a carta do Dealer é oculta.\n\n");
				
				PFigcard=DFigcard=0;
				t++;
			}else{
				if(PFigcard==11){
					System.out.println("A sua " + t + "ª carta é Dama. O seu total é " + Pblack +"\n");
				}else if (PFigcard==12){
					System.out.println("A sua " + t + "ª carta é Valete. O seu total é " + Pblack +"\n");
				}else if (PFigcard==13){
					System.out.println("A sua " + t + "ª carta é Rei. O seu total é " + Pblack +"\n");
				}else{			
					System.out.println("A sua " + t + "ª carta é " + Pcard + ". O seu total é " + Pblack +"\n");
				}
				if(DFigcard==11){
					System.out.println("A " + t + "ª carta do Dealer é Dama\n\n");
				}else if (DFigcard==12){
					System.out.println("A " + t + "ª carta do Dealer é Valete\n\n");
				}else if (DFigcard==13){
					System.out.println("A " + t + "ª carta do Dealer é Rei\n\n");
				}else{			
					System.out.println("A " + t + "ª carta do Dealer é " + Dcard +"\n\n");
				}
				
				if(Pblack==21){
					System.out.println("Blackjack!!!\nGanhou");
					break;
				}else if(Pblack>21){
					System.out.println("Excedeu 21.\nPerdeu");
					break;
				}
					System.out.println("Deseja continuar?\nse SIM prima a tecla 1\nse NÃO prima a tecla 2");
				
				cont = (new Scanner(System.in)).nextInt();
				
				PFigcard=DFigcard=0;
			}
			
			if(cont==2){
				
				if(Pblack>Dblack){
					System.out.println("As suas cartas totalizam " + Pblack +". As cartas do Dealer totalizam " + Dblack +"\nGanhou!!!");
					break;
				}else if(Pblack<Dblack && Dblack<21){
					System.out.println("As suas cartas totalizam " + Pblack +". As cartas do Dealer totalizam " + Dblack +"\nPerdeu.");
					break;
				}
			}else if(cont>2){
				while(cont>2){
				System.out.println("Não Entendo\n\nDeseja continuar?\nse SIM prima a tecla 1\nse NÃO prima a tecla 2");
				
				cont = (new Scanner(System.in)).nextInt();
				}
			}
			}while (Pblack<21 && cont!=2);
			}
		

		}
		