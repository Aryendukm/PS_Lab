import java.util.Scanner;

public class IO_Prg {

	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		Double num1,num2, res;
		System.out.println("Enter the number : ");
		num1 = s.nextDouble();
		System.out.println("Enter second number :");
		num2 = s.nextDouble();
		res = num1 + num2 ;
		System.out.printf("sum is = %s ", res);

	}

}
