import java.util.Scanner;

public class conversor {
	public static void main(String[] args) {
		 
		//declare 
		double cel, fah;
		
		//Criação de instancia do objeto de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Entrada
		System.out.print("cel");
		cel = entrada.nextDouble();
				

		//processamento 
		fah = 9 * cel / 5 + 32;
		
		//Saída
		System.err.println("\n\n" + 9 +  "*" + cel + "/" + 5 + "+" + 32 + "=" + fah +"\n");
				
	}

}
