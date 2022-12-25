
public class arrayintersection
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {4,5,6,7,8,9};
		
		int arr3[] = new int[arr1.length];
		int flag=0;
		
		for(int i=0;i<arr1.length;i++){
		    for(int j=0;j<arr2.length;j++){
		        if(arr1[i]==arr2[j]){
		            arr3[flag]=arr1[i];
		            flag++;
		        }
		    }
		}
		for(int i=0;i<=flag;i++){
		    System.out.println(arr3[i]);
		}
	}
}
