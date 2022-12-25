import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++){
		    arr[i] = input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
		    int count = 0;
		    for(int j=0;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            count++;
		        }
		    }
		    if(count>1){
		        System.out.println("The number "+ arr[i] + "has repeted "+count+" Times");
		    }
		}
		
		for(int x=0;x<arr.length;x++){
		    System.out.print(arr[x]+" ");
		}
		
	}
}
