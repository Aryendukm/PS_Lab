/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		
		for(int i=0;i<c;i++)
		{
		    int  N  = in.nextInt();
		    int arr[] = new int[N];
		    for(int j=0;j<N;j++)
		    {
		        arr[j]=in.nextInt();
		    }
		    int max = 0;
		    for(int z=0;z<N;z++)
		    {
		        int freq = 1;
		        for(int y=z+1;y<N;y++)
		        {
		            if(arr[z]==arr[y])
		                freq++;
		        }
		        if(max<freq){
		            max=freq;
		        }
		    }
		   
		    System.out.println(N-max);
		}
		
	}
}
