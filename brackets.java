import java.util.*;
import java.io.*;

class brackets
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String[] str=input.split(" ");
		int n=Integer.parseInt(str[0]);
		input = br.readLine();
		str=input.split(" ");

		int depth=0, firstdepth=0,maxstring=0, firstmax=0, counter=0, length=0,s=1;

		for(int i=0;i<n;i++)
		{
			int num=Integer.parseInt(str[i]);
			if(num==1)
			{
				counter++;
				length++;
				if(counter > depth)
				{
					firstdepth=i+1;
					depth=counter;
				}
				
			}
			if(num==2)
			{
				counter--;
				length++;
				if(counter == 0)
				{
					if(maxstring < length)
					{
						firstmax= s;
						maxstring=length;
					}
					length=0;
					s=i+2;
				}
			}
		}

		System.out.println(depth+" "+firstdepth+" "+maxstring+" "+firstmax);
	}
}
