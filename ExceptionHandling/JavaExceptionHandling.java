import java.util.*;
import java.util.Scanner;
class MyCalculator{
   public String power (int n, int p) throws NegativeException {
		int temp = 0;
		try {
		if (n<0|p<0) {
			throw new NegativeException();
		}
		else {
			temp = (int) Math.pow(n, p);
			return temp +"";
		}
		}
		catch (NegativeException e) {
			return "java.lang.Exception: n and p should be non-negative";
		}
	}
}

class NegativeException extends Exception
{
	private static final long serialVersionUID = 1L;

public NegativeException()
  {
    super();
  }
}

class Solution {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  while ( in .hasNextInt()) {
   int n = in .nextInt();
   int p = in .nextInt();
   MyCalculator my_calculator = new MyCalculator();
   try {
    System.out.println(my_calculator.power(n, p));
   } catch (Exception e) {
    System.out.println(e);
   }
  }
 }
}
