
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		for(int i=1;i<4;i++){
		    for(int j=0;j<4-i;j++){
		        System.out.print("  ");
		    }
		    for(int k=0;k<(2*i)-1;k++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=1;i<3;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print("  ");
		    }
		    for(int k=0;k<5-(i*2);k++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
