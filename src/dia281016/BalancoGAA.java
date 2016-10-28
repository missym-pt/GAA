package dia281016;

import java.util.Scanner;

public class BalancoGAA {
	
	int totalReceitas, totalDespesas, balanco;

	public BalancoGAA() {
		
		System.out.println("Vamos calcular o balan�o. ");
				
		calcularReceitas();
		calcularDespesas();
		calcularBalanco();
					
	}
	
public int calcularReceitas() {
	
		System.out.println("Por favor introduza em � os montantes das receitas indicadas: ");
		
		int quotas , recBaile , recBar;
		
		System.out.println("Receitas provenientes de quotas: ");
		quotas = (new Scanner(System.in)).nextInt();		
		System.out.println("Receitas provenientes dos bailes: ");
		recBaile = (new Scanner(System.in)).nextInt();
		System.out.println("Receitas provenientes do bar: ");
		recBar = (new Scanner(System.in)).nextInt();
		
		totalReceitas = quotas + recBaile + recBar;

		return totalReceitas;
}
public int calcularDespesas() {
	
	System.out.println("\n1Por favor introduza em � os montantes das despesas indicadas: ");
	
	int agua, luz, telefone;
	
	System.out.println("Despesas com agua: ");
	agua = (new Scanner(System.in)).nextInt();		
	System.out.println("Despesas com luz: ");
	luz = (new Scanner(System.in)).nextInt();
	System.out.println("Despesas com telefone: ");
	telefone = (new Scanner(System.in)).nextInt();
	
	totalDespesas = agua + luz + telefone;
	
	return totalDespesas;
	
}
public int calcularBalanco() {
	
	balanco = totalReceitas - totalDespesas;
	
	System.out.println("O total de receitas �: " + totalReceitas + "�");
	System.out.println("O total de despesas �: " + totalDespesas + "�");
	
	if ( balanco > 0 ){
		System.out.println("O seu saldo corrente nesta data � positivo no montante de: " + balanco + "�");
	}
	else if ( balanco < 0 ){
		System.out.println("O seu saldo corrente nesta data � negativo no montante de: " + balanco + "�");
	}
	else {
		System.out.println("O seu saldo corrente nesta data � nulo (" + balanco + " �)");
	}
	return balanco;

}
}
