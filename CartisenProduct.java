import java.util.Scanner;

public class CartisenProduct {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of set A: ");
        int a;
        a = input.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<a;i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.println("Enter the size of set B: ");
        int b;
        b = input.nextInt();
        int arr1[] = new int[b];
        System.out.println("Enter the Elements: ");
        for(int i=0;i<b;i++)
            arr1[i] = input.nextInt();
        
        System.out.println("Cartisen Product of A and B are: -> ");
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr1.length;j++) {
                System.out.print("("+arr[i] + "," + arr1[j]+")  ");
            }
            System.out.println();
        }
        

    }

}
