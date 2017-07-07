import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        boolean[] visited = new boolean[game.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(0);
		while (!queue.isEmpty()) {
			int head = queue.poll();
			if (head >= game.length) {
				return true;
			}
			if (head >= 0 && !visited[head] && game[head] == 0) {
				visited[head] = true;
				queue.offer(head - 1);
				queue.offer(head + 1);
				queue.offer(head + leap);
			}
		}
		return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
