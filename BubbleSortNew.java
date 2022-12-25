
public class BubbleSortNew
{
	public static void main(String[] args) {
		System.out.println("Bubble Short");
		
		int[] arr ={20,5,3,19,7,2,8,4,9,10,17,18};
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]>arr[j]){
		            int c = arr[i];
		            arr[i]=arr[j];
		            arr[j]=c;
		        }
		    }
		}
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
