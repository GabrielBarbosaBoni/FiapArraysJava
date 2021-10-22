package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.PessoaSalario;

public class Program {
	public static void main(String[]args){
	

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vamos calcular a média? : ");
		int n = sc.nextInt();
		PessoaSalario[] vect = new PessoaSalario[n];
		int count = 0;
		for(int i = 0; i < vect.length; i++ ) {
			
			System.out.println("Escreva o nome e em seguida o salário : ");
			sc.nextLine();
			String name = sc.nextLine();
			double salario = sc.nextDouble();
			
			vect[i] = new PessoaSalario(name,salario);
			
		}
		double sum = 0.0;
		for (int i = 0; i<vect.length ; i++) {
			sum += vect [i].getSalario();
		}
		double avg = sum / vect.length;
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[count].getName() + " ");
			System.out.println(vect[count].getSalario() + " ");
			count = count + 1;
		}
		System.out.printf("A media dos salários é : R$%.2f%n", avg);
		sc.close();
	}
}
