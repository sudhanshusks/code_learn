import java.util.Scanner;
class second{
	public static void main(String args[]){
		int test,i,j,k,row,col,p;
		Scanner ff=new Scanner(System.in);
		test=ff.nextInt();
		String out[]=new String[test];
		for(i=0;i<test;i++){
			int count=0;
			row=ff.nextInt();
			col=ff.nextInt();
			String a[]=new String[row];
			for(j=0;j<row;j++){
				a[j]=ff.next();
				a[j]=a[j].toLowerCase();
			}
			String rowstr="";
			if(col >=5){
				for(j=0;j<row;j++){
				for(k=0;k<col-4;k++){
					rowstr=a[j].substring(k,k+5);
					if(rowstr.equals("spoon"))
						count=1;
				}
			}
			}
			if(row>=5){
				for(j=0;j<col;j++){
				for(k=0;k<row-4;k++){
					String colstr="";
					for(p=k;p<k+5;p++){
						colstr+=a[p].charAt(j);
					}
					if(colstr.equals("spoon"))
						count=1;
				}
			}
			}
			if(count==1)
				out[i]="There is a spoon!";
			else
				out[i]="There is indeed no spoon!";
		}
		for(i=0;i<test;i++)
			System.out.println(out[i]);
	}
}




/*if(Arrays.asList(b).indexOf(pop[tel2[k]-1])<n[i]-1)
					out[i]=n[i];
					e

					
					
					
2
6
5 10 15 20 25 30
1 3
2 3
3 4
4 5
5 6 
5
10 5 15 20 25
1 3
2 3
3 4
4 5