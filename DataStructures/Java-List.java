import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		List<Integer> L = new ArrayList<Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int element = sc.nextInt();
			L.add(element);
		}

		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String query = sc.next();
			if (query.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				L.add(x, y);
			} else if (query.equals("Delete")) {
				int x = sc.nextInt();
				L.remove(x);
			}
		}

		for(int s:L){  
            System.out.print(s +" "); 
        }
        sc.close();
    }
}