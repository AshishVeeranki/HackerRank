import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = x/y;
            System.out.print(z);
        }
        catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        }
        catch (Exception e) {
            System.out.print(e);
        }
       
    }
}