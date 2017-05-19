import java.util.*;
import java.io.*;

class pyramid
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[i]=Math.min(a,b);
		}
		Arrays.sort(arr);
		int counter=0;
		for(int i=0;i<m;i++)
		{
			if(arr[i] > counter)
				counter++;
		}
		System.out.println(counter);
	}
}