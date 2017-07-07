import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String date = month + "-" + day + "-" + year;
 
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date dt = new Date();
 
		try {
			dt = sdf.parse(date);
			date = dt.toString().substring(0,3);
 
			switch(date){
                case "Sun": 
                        System.out.println("SUNDAY"); 
                        break;
				case "Mon":
                        System.out.println("MONDAY"); 
                        break;
				case "Tue": 
                        System.out.println("TUESDAY"); 
                        break;
				case "Wed": 
                        System.out.println("WEDNESDAY"); 
                        break;
				case "Thu": 
                        System.out.println("THURSDAY");
                        break;
				case "Fri": 
                        System.out.println("FRIDAY");
                        break;
				case "Sat": 
                        System.out.println("SATURDAY"); 
                        break;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
    }
}
