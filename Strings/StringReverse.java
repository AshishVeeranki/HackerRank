import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        Solution s = new Solution();
        if(s.palindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
    
    public boolean palindrome(String str)
        {
        boolean flag=false;
        String str2="";
        for(int i= str.length()-1; i>=0; i--)
            str2 = str2.concat(""+str.charAt(i));
        if(str.equals(str2))
            flag=true;
        return flag;
    }
    
    
}