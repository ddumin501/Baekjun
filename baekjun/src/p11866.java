import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//틀렸습니다!
public class p11866 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();

		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		System.out.print("<");
		while (!queue.isEmpty()) {
			cnt++;
			if(queue.size()==1) {
				System.out.print(queue.poll() + ">");
				break;
			}
			if(cnt%3==0){
				System.out.print(queue.poll() + ", ");
			}
			else queue.add(queue.poll());
		}
	}
}
/* -----------------------정답---------------------------
public class Main {
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
*/

