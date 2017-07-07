import java.io.*;
import java.util.*;

public class Solution {
 static boolean isAnagram(String a, String b) {
       a=a.toLowerCase();
	   b=b.toLowerCase();
	   boolean flag = false;
	  char[] c = a.toCharArray();
	  Arrays.sort(c);
	  char[] d = b.toCharArray();
	  Arrays.sort(d);
	  String str1 = new String (c);
      String str2 = new String (d);
      if (str1.equals(str2)) {
    	  flag=true;
      }
      return flag;
        
    }
 public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
