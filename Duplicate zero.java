
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
			int[] arr = {1,0,4,6,0,2,5};
		
		for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                i++;
            }
            else
                continue;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
	}
}
