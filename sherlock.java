import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//import org.apache.commons.lang.StringUtils;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            //int out=0;
            int n = in.nextInt();
            String str="";
            str = new String(new char[5]).replace("\0",str);
            //if((n%3==0 && n>0)||(n%3==2 && n>=5)||(n%3==1 && n>=10)){
                int x,y;
            //System.out.println(check);
                if(n%3==0 && n>0){
                    //x=0;
                    y=n;
                    for(int j=0;j<n;j++)
                        str+="5";
                }
                else if(n%3==1 && n>=10){
                    x=10;
                    y=n-10;
                    str = new String(new char[n-10]).replace("\0","5");
                    for(int j=0;j<10;j++)
                        str+="3";
                }
                else if(n%3==2 && n>=5){
                    x=5;
                    y=n-5;
                    str = new String(new char[n-5]).replace("\0","5");
                    for(int j=0;j<5;j++)
                        str+="3";
                }
                //out=Integer.parseInt(str);
            //}
            else 
                str+="-1";
                //out=-1;
            
            System.out.println(str);
        }
    }
}
