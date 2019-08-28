package queue;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1158 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();

		int n = sc.nextInt();
		int m = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		System.out.print("<");
		while (queue.size()>1) {
			for (int i = 0; i < m - 1; i++) {
				if (queue.size() == 1) {
					System.out.print(queue.poll());
					break;
				}
				queue.add(queue.peek());
				queue.poll();
			}			
			System.out.print(queue.poll() + ", ");
		}
		if (queue.size() == 1) 
			System.out.print(queue.poll());
		System.out.println(">");
	}
}
