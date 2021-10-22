package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MatrizUni {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[15];
		System.out.println("Declare os 15 números:");
		
		for (int i = 0 ; i <= 14 ; i++ ) {			
			vect[i] = sc.nextInt();
		}
		for (int count = 0 ; count <=14; count++) {
			System.out.println(vect[count]);		
		}
		sc.close();
	}
}
