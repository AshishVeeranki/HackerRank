import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        String smallest="";
        String largest="";
        int temp=str.length()-n;
        for(int i = 0;i<=temp;i++){
            String str2 = str.substring(i,i+n);
            if(i == 0){
                smallest = str2;
            }
            if(str2.compareTo(largest)>0){
                largest = str2;
            }else if(str2.compareTo(smallest)<0)
                smallest = str2;
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}