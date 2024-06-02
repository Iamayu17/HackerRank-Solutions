import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int n=scanner.nextInt();
            for(int j=0;j<n;j++){
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
        }
        scanner.close();
    }
}