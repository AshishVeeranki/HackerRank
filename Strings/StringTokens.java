import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext())
            System.out.println(0);
        else
            {
             String s=scan.nextLine();
            String[]a = s.trim().split("[ !,?._'@]+");
            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());
      
          for(String str:listOfStrings){
            System.out.println(str);
        }
        }
        
        scan.close();
    }
}
