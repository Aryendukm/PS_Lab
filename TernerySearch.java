import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		
		int ar[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int l =0;
		int e = ar.length;
		System.out.println("Enter the key to search");
		int key = in.nextInt();
		int p = terSerch(l,e,key,ar);
		System.out.println("Index of "+ key +" is "+p);
	}
	
	static int terSerch(int l,int e,int key, int arr[]){
	    if(e>=l){
	        int mid1 = l + (e-l)/3;
	        int mid2 = e - (e-l)/3;
	        
	        if(arr[mid1]==key){
	            return mid1;
	        }
	        if(arr[mid2]==key){
	            return mid2;
	        }
	        if(key<arr[mid1]){
	            return terSerch(l,mid1-1,key,arr);
	        }
	        else if(key>arr[mid1]&&key<arr[mid2]){
	            return terSerch(mid1+1,mid2-1,key,arr);
	        }
	        else if(key>arr[mid2]){
	            return terSerch(mid2+1,e,key,arr);
	        }
	    }
	    return -1;
	}
}
