import java.util.Scanner;

	public static void main(String[] args) {
		
		//sei la
		int fah, cel, op;
		
		 System.out.println("\n\t\t\t --Conversor-- \n");

            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");

            System.out.print("Opção: ");

            Scanner entrada;
			Object op = entrada.nextInt();

			if(op == 1){

		//Criação de instancia do objeto de entrada
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("cel");
			cel = entrada.nextDouble();
		}
		
		//Entrada
		fah = 9 * cel / 5 + 32;
		
		//Saída
		System.err.println("\n\n" + 9 +  "*" + cel + "/" + 5 + "+" + 32 + "=" + fah +"\n");
				
	}

}
