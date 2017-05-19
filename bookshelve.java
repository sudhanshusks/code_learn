import java.util.*;
import java.io.*;

class bookshelve
{

	static void quicksort(int[] a,int low, int high)
	{
		if(low < high)
		{
			int p=partition(a, low ,high);
			quicksort(a,low, p-1);
			quicksort(a, p+1, high);
		}
		
	}

	static int partition(int[] x, int lo, int hi)
	{
		int pivot=x[hi];
		int i=lo-1;
		for(int j=lo;j<=hi-1;j++)
		{
			if(x[j] <= pivot)
			{
				i++;
				swap(x,i, x,j);
			}
		}
		swap(x,i+1, x,hi);
		return (i+1);
	}

	static void swap(int[] a, int i, int[] b, int j)
	{
		int temp=a[i];
		a[i]=b[j];
		b[j]=temp;
	}

	public static void main(String[] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String[] str=input.split("\\s+");
		int n=Integer.parseInt(str[0]);
		int k=Integer.parseInt(str[1]);
		int[] first=new int[n];
		int[] second=new int[n];
		for(int i=0;i<n;i++)
		{
			first[i]=Integer.parseInt(str[i+2]);
			//System.out.println(first[i]);
		}
		for(int i=0;i<n;i++)
		{
			second[i]=Integer.parseInt(str[n+2+i]);
			//System.out.println(second[i]);
		}

		quicksort(first,0,n-1);
		quicksort(second , 0, n-1);
		int sum=first[n-1] + second[n-1];
		//int max=0;
		if(first[n-1] >= second[n-1])
		{
			//max=first[n-1];
			for(int i=0;i<k;i++)
			{
				int val1=Math.max(first[i],second[n-2-i]) + first[n-1];
				int val2=Math.max(first[n-2-i],second[i]) +first[n-1];
				sum=Math.min(sum, Math.min(val1,val2));
			}
		}
		else
		{
			//max=second[n-1];
			for(int i=0;i<k;i++)
			{
				int val1=Math.max(first[i],second[n-2-i]) + second[n-1];
				int val2=Math.max(first[n-2-i],second[i]) +second[n-1];
				sum=Math.min(sum, Math.min(val1,val2));
			}
		}
		
		System.out.println(sum);
	}
}
