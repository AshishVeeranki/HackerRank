import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        BitSet[] B = new BitSet[n];
        for(int i=0;i<n;i++)
        {
            B[i]= new BitSet();
        }
        for(int  i=0;i<m;i++)
        {
            String str = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(str.equals("AND"))
                B[a].and(B[b]);
            else if(str.equals("OR"))
                B[a].or(B[b]);
            else if(str.equals("SET"))
                B[a].set(b);
            else if(str.equals("XOR"))
                B[a].xor(B[b]);
            else if(str.equals("FLIP"))
                B[a].flip(b);
            
            System.out.println(B[1].cardinality() + " " + B[2].cardinality());
       }
        sc.close();
    }
}