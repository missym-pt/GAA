package d02112016;

public class Ciclos {
	
	String msg = "All you need is love! <3";

	public Ciclos() {

		de_para();
	}

	
	public void enquanto(){
		int i =0;
				
		while (i<4){
			System.out.println(msg);
			i++;
		}
	}
	
	public void fazerenquanto(){
		int i =2;
		
		
		do {
			System.out.println(msg);
			i++;}
		while (i<4);
	
	}
	
	public void de_para(){
		for (int i=0; i<4; i++){
			System.out.println(msg);
		}
	}
	}

