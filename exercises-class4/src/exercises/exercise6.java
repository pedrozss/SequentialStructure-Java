package exercises;
import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, A, B, C, D, E, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		A = a * c / 2.0;
		B = pi * c * c;
		C = (a + b) / 2.0 * c;
		D = b * b;
		E = a * b;
		
		System.out.println("Triangulo: " + A);
		System.out.println("Circulo: " + B);
		System.out.println("Trapézio: " + C);
		System.out.println("Quadrado: " + D);
		System.out.println("Retangulo: " + E);
		

	}

}
