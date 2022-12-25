import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		pattern(a);
		
	}
	static void pattern(int n){
	    if(n>0){
	        System.out.print(n+" ");
	        pattern(n-5);
	    }
	    System.out.print(n+" ");
	}
}
