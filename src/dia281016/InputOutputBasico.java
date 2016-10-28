package dia281016;

public class InputOutputBasico {

	public InputOutputBasico() {
		// Instrumento de escrita em consola
				System.out.println("Bom dia!\nComo se chama?");
				
				// Cria variável para armazenar nome
				String name;
				
				// Instrumento para leitura do teclado, em linha de comandos
				// Leityura de linha : (new Scanner(System.in)).nextLine();
				// Leitura de número : (new Scanner(System.in)).nextInt();
				name = (new Scanner(System.in)).nextLine();
				
				System.out.println("Como tem passado " + name + "?");	
	}

}
