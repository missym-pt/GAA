package d02112016;

public class Condicionais {

	public Condicionais() {

		comparadormultivariavel();
	}
	
	
	public void comparadorsimples(){
		int num1 = 3;
		int num2 = 4;
		
		if(num1==num2){
			System.out.println("Os numeros são iguais");
		} else if(num1<num2){
			System.out.println("O numero um é menor que o numero dois");
		}else{
			System.out.print("O numero um e maior que o numero dois");
		}

		}
	
	public void comparadormultivariavel(){
		int num1 = 5;
			int num2 = 7;
			int num3 = 3;
			int num4 = 8;
			
		if (num1>num2 && num1>num3 && num1>num4){
			System.out.println("O maior numero de todos é o numero " + num1);
		}
		
		if (!(num2>num3) || num1>num4){
			System.out.println("ganha a equipa 1");
		}else {
			System.out.println("ganha a equipa 2");
			}
		}
		
	}
	

