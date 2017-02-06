/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*;

class TestClass {
    static boolean check(int n){
        //System.out.println(n);
        //System.out.println(Math.sqrt(n));
        for(int i=1;i<=Math.sqrt(n);i++){
            //System.out.println(i);
            aa:
            if(n%i==0){
                System.out.println(i);
                int len1,len2,x,y;
                len1=(int)Math.log10(i) +1;
                len2=(int)Math.log10(n/i) +1;
                if(len1==len2){
                    x=i;
                    y=n/i;
                        //System.out.println(len1+"  "+len2);
                        List<Integer> length=new ArrayList<Integer>();
                        List<Integer> vamp=new ArrayList<Integer>();
                        while(x>0){
                            length.add(x%10);
                            x=x/10;
                        }
                        while(y>0){
                            length.add(y%10);
                            y/=10;
                        }
                        System.out.println(length);
                        x=n;
                        while(x>0){
                            int rem=x%10;
                            if(!length.contains(rem)){
                                break aa;
                            }
                            vamp.add(rem);
                            x/=10;
                        }
                        for(x=0;x<length.size();x++){
                            for(y=0;y<vamp.size();y++){
                                if(length.get(x)==vamp.get(y))
                                length.remove(vamp.get(y));
                            }
                        }
                        //length.clear();
                        if(length.isEmpty())
                        return true;
                    }
                
                }
               // return true;
               length.clear();
        }
        return false;
    }
    
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            System.out.println(check(num));
        }
        s.close();
    }
}