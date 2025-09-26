package pekan3;

import java.util.Scanner;

public class hitungvolume {

	public static void main(String[] args) {
		double a;
		double t; //tinggi segitiga 
		double T; //tinggi limas
		double V;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan alas segitiga: ");
		a = keyboard.nextDouble();
		System.out.print("Masukkan tinggi segitiga: ");
		t = keyboard.nextDouble();
		System.out.print("Masukkan tinggi limas: ");
		T = keyboard.nextDouble();
		keyboard.close();
		V = (1.0/3)*(1.0/2) *a *t *T;
		System.out.println("Volume limas segitiga = "+V);

	}

}
