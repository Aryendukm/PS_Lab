import java.util.Scanner;

public class age_cmp {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		double age1, age2, age3;
		System.out.println("Enter the age of first persion :");
		age1 = s.nextDouble();
		System.out.println("Enter the age of Second persion :");
		age2 = s.nextDouble();
		System.out.println("Enter the age of Third persion :");
		age3 = s.nextDouble();
		
		if (age1 > age2)
		{
			if (age1 > age3)
			{
				System.out.printf("First persion is oldest %s ", age1);
			}
			else
				System.out.printf("third persion is oldest %s", age3);
		}
		else if (age2 > age3)
		{
			System.out.printf("second persion is oldest %s ", age2);
		}
		else
			System.out.printf("Third persion is oldest %s ", age3);
		

	}

}
