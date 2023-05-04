package pct;
import java.util.Scanner;

public class testemenordetres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Declare
		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		System.out.print("Digite o terceiro número: ");
		int num3 = sc.nextInt();
		
		
		//processamento
		int menor = num1;

		if (num2 < menor) {

			menor = num2;

}

		if (num3 < menor) {

			menor = num3;

}
		//Saída
		System.out.println("O menor número é: " + menor);

		sc.close();

}

}