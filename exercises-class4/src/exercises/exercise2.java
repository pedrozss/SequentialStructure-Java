package exercises;
import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double area, r, raio, pi;
		
		raio = sc.nextInt();
		pi = 3.141569;
		
		r = Math.pow(raio, 2);
		
		area = pi * r;
		System.out.println("O valor da área é de: " + area);
		

	}

}
