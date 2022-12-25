
public class arrayUnion
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7,8};
		
		int arr3[] = new int[8];
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
		for(int i=0;i<arr3.length;i++){
		    System.out.print(arr3[i]);
		}
	}
}
