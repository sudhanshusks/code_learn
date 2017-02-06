/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        long r,g,b,res=0;
        r=s.nextLong();
        g=s.nextLong();
        b=s.nextLong();
        //avg=(long)Math.ceil((r+g+b)/3);
        //res=0;
        
        long min=Math.min(r,Math.min(g,b));
        double rd=r,gd=g,bd=b,mind=min;
        res=min;
        if(min==r){
            double x=(bd+gd-2*mind)/2;
            res+=Math.ceil(x);
            //System.out.println(x+" "+g+" "+b+" "+min+" "+(g+b-2*min)/2);
        }
        else if(min==g){
            double x=(rd+bd*2*mind)/2;
            res+=Math.ceil(x);
        }
        else{
            double x=(gd+rd-2*mind)/2;
            res+=Math.ceil(x);
        }
        
        System.out.println(res);
    }
}
