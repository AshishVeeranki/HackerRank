import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
     //   int x=A.length();
      //  int y=B.length();
        System.out.println(A.length()+B.length());
        if(B.compareTo(A)<0)
            System.out.println("Yes");
        else
            System.out.println("No");
        String a="" +A.charAt(0);
        String b="" +B.charAt(0);
        System.out.println(a.toUpperCase()+A.substring(1)+" "+b.toUpperCase()+B.substring(1));
    }
}
