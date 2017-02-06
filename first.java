import java.util.*;
class first{
public static void main(String args[]){
	int test,n,m,i,j,k,num;
        Scanner fg=new Scanner(System.in);
        test=fg.nextInt();
        for(i=0;i<test;i++){
            num=0;
            n=fg.nextInt();
            m=fg.nextInt();
            String str[]=new String[n];
            for(j=0;j<n;j++){
                str[j]=fg.next();
            }
            for(j=0;j<n;j++){
                if(j==n-1){
                    for(k=0;k<m;k++){
                        if(str[j].charAt(k) !='B'){
                            num=1;
                            break;
                        }
                    }
                }
                else if(str[j].charAt(0)== 'B' && str[j].charAt(m-1)=='B'){
                    for(k=1;k<m-1;k++){
                        if(str[j].charAt(k)=='B'){
                            if(str[j+1].charAt(k) != 'B'){
                                num=1;
                            }
                            
                            //else
                              //  out="yes";
                        }
                        
                      //  else if(str[j].charAt(k)=='W'){
                       // if(str[j+1].charAt(k)=='A' ||str[j].charAt(k-1)=='A'|| str[j].charAt(k+1)=='A'){
                       //     num=1;
                        //}
                        //else
                          //  out="yes";
                        //}
                        //else if(str[j].charAt(k)=='A'){
                          //  if(str[j].charAt(k-1)=='W'||str[j].charAt(k+1)=='W'){
                            //    num=1;
                            //}
                            //else
                              //  out="yes";
                        //}
                        
                        //else
                          //  out="yes";
                    } 
                                       
                    //break;
                }
                else
                   num=1;
            }
            if(num==1)
                System.out.println("no");
            else
                System.out.println("yes");
        }
}
}

