import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          System.out.println(verification(input));
      }
      
   }
    
    public static boolean verification(String braces) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < braces.length(); i++) {
			char ch = braces.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (stack.empty()) {
				return false;
			} else {
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
						|| (top == '{' && ch != '}')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}
