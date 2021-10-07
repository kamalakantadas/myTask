import java.util.*;
import java.io.*;
import java.lang.Math;

class JavaLoop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();//number of line q
        int storeVal1=0;
        int storeVal2=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();//0//5
            int b = in.nextInt();//2//3
            int n = in.nextInt();//10//5
            for(int loopGoingThrow =0;loopGoingThrow<n;loopGoingThrow++){
                storeVal1 += (int)(a+(Math.pow(2,loopGoingThrow)*b));
                a=0;
                System.out.print(storeVal1+" ");
            }
            System.out.println();
            storeVal1 =0;

        }
        in.close();
    }
}