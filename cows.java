/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int fun(int x,int[] pos,int cow){
        int cowscount=1,lastpos=pos[0];
        for(int i=1;i<pos.length;i++){
           //System.out.println("pos[i]  "+pos[i]);
            if(pos[i]-lastpos >=x){
                if(++cowscount==cow)return 1;
                lastpos=pos[i];
               // System.out.println("lastpos  "+lastpos);
                //System.out.println(cowscount);
            }
        }
        return 0;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int test,i,j,n,cow;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(i=0;i<test;i++){
		    n=sc.nextInt();
		    cow=sc.nextInt();
		    int[] pos=new int[n];
		    for(j=0;j<n;j++)
		    pos[j]=sc.nextInt();
		    Arrays.sort(pos);
		    int start=0,end=pos[n-1]-pos[0]+1,mid;
		    while(end-start >1){
		        mid=(start+end)-1;
		        if(fun(mid,pos,cow)==1){
		            start=mid;
		            break;
		        }else
		        end=mid;
		    }
		    System.out.println(start);
		}
	}
}
