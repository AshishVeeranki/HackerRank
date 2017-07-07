import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hashset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
int sum = s.nextInt();
        s.nextLine();
HashSet hs = new HashSet();
for (int i=0;i <sum;i++) {
 hs.add(s.nextLine());
System.out.println(hs.size ());
}
    }
}