    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
		    int unique = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               
                if (deque.size() == m - 1) {
				unique = computeUniqueNum(deque);
			}
			if (deque.size() >= m - 1) {
				if (!deque.contains(num)) {
					unique++;
				}
			}
			deque.offerLast(num);

			if (deque.size() > m) {
				int temp = deque.pollFirst();
				if (!deque.contains(temp)) {
					unique--;
				}
			}

			max = Math.max(max, unique);

            }
            System.out.println(max);

		in.close();
            
        }
        
        static int computeUniqueNum(Deque<Integer> deque) {
		return new HashSet<Integer>(deque).size();
	}
    }
