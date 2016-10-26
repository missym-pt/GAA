
public class Exercicio {
	
	int totalReceitas, totalDespesas;

	public Exercicio() {
		// TODO Auto-generated constructor stub
	
	String mensagem = "Vamos calcular e imprimir o total de receitas :p";
			System.out.println(mensagem);
					
			calcularReceitas();
			calcularDespesas();
			
			int balanco = totalReceitas - totalDespesas;
			
			System.out.println("Total Receitas: " + totalReceitas + "€");
			System.out.println("Total Despesas: " + totalDespesas + "€");
			System.out.println("Balanço: " + balanco + "€");
			
		
}
	public void calcularReceitas() {
		
		int quotas = 300, recBaile = 200, recBar = 250;
		
		totalReceitas = quotas + recBaile + recBar;
		
	}
	
	public void calcularDespesas() {
		
		int agua = 80, luz = 60, telefone = 70;
		
		totalDespesas = agua + luz + telefone;
		
	}
}
