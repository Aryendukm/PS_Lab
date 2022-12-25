
public class Main
{
	public static void main(String[] args) {
		System.out.println("Bubble Short");
		
		int[] arr ={4,6,3,7,5,11,12,13,14,15};
		
		for(int i=0;i<arr.length;i++){
		    boolean flag = false;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]>arr[j]){
		            flag = true;
		            int c = arr[i];
		            arr[i]=arr[j];
		            arr[j]=c;
		            System.out.print(arr[j]+" ");
		        }
		    }
		    if(flag==false)
		        break;
		}
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
