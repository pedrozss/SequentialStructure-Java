package exercises;
import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double pay, salary;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		pay = sc.nextDouble();
		
		salary = hours * pay;
		
		System.out.println("Number: " + number);
		System.out.printf("Salary = U$%.2f",salary);
		
		

	}

}