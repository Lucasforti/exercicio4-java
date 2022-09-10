import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int func, horas;
		double valorHora, salario;
		
		func = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("NUMBER = " + func);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}
}