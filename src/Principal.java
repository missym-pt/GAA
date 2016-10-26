
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensagem = "Vamos calcular e imprimir o total de receitas :p";
		System.out.println(mensagem);

		
		int quotas = 300, recBaile = 200, recBar = 250;
		
		int totalReceitas = quotas + recBaile + recBar;
				
		int agua = 80, luz = 60, telefone = 70;
		
		int totalDespesas = agua + luz + telefone;
		
		int balanco = totalReceitas - totalDespesas;
		
		System.out.println("Total Receitas: " + totalReceitas + "€");
		System.out.println("Total Despesas: " + totalDespesas + "€");
		System.out.println("Balanço: " + balanco + "€");
		
		
		
		
		

	}

}
