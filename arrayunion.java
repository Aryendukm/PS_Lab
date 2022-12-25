import java.util.Scanner;

public class arrayunion {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements in Set 1 : ");
		int n = input.nextInt();
		
		int[] arr1  = new int[n];
		System.out.println("Enter the elements -->");
		for(int i=0;i<n;i++) {
			arr1[i]=input.nextInt();
		}
		System.out.println("Enter the no. of elements in Set 2 : ");
		int m = input.nextInt();
		int[] arr2 = new int[m];
		System.out.println("Enter the elements -->");
		for(int i=0;i<m;i++) {
			arr2[i]=input.nextInt();
		}
		
		int arr3[] = new int[m+n];
		int c=0;
		
		for(int i=0;i<arr1.length;i++){
		    arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
		    int flag=0;
		    for(int j=0;j<arr1.length;j++){
		        if(arr2[i]==arr1[j]){
		            flag++;
		        }
		    }
		    if(flag==0){
		        arr3[arr1.length+c]=arr2[i];
		        c++;
		    }
		}
		int z=0;
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]!=0) {
				z=z+1;
			}
		}
		for(int i=0;i<z;i++){
		    System.out.print(arr3[i]);
	}
	}
}