import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> elements = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
        	int x = s.nextInt();
        	input.add(x);
        	for (int j = 0; j < x; j++) {
        		elements.add(s.nextInt());
        	}
        }
        
        int q = s.nextInt();
        ArrayList<Integer> query = new ArrayList<Integer>();
        for (int i = 0; i < q; i++) {
        	query.add(s.nextInt());
        	query.add(s.nextInt());
        }
        s.close();
        for (int y = 0; y < q+q; y=y+2) {
        	int pos = query.get(y+1);
        	int line = query.get(y);
        	int len = input.get(line-1);
        	int sum2 = 0;
        	if (line - 1 > 0) {
        		for (int u = 0; u < line-1; u++) {
        			sum2 += input.get(u);
        		}
        	}
        	if (len < pos) {
        		System.out.println("ERROR!");
        	}
        	else {
        		System.out.println (elements.get(sum2 + (pos-1)));
        	}
        }
        
        
    }
}