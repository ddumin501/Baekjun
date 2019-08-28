
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase, N, M, max;
		testcase = sc.nextInt();
		int[] result = new int[testcase];

		for (int i = 0; i < testcase; i++) {
			N = sc.nextInt();
			M = sc.nextInt();
			max = 0;
			Queue<Integer> queue = new LinkedList<Integer>();
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				if (num > max)
					max = num;
				if (j == M)
					num = 0;
				queue.offer(num);
			}
			System.out.println("max´Â" + max);
			result[i] = Find(queue, N, M, max);
		}

		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	static int Find(Queue<Integer> queue, int N, int M, int max) {
		int cnt = 1;
		while (queue.size()>1) {	
		if (queue.peek() == max) {
			if(queue.peek()== 0) break;
			queue.poll();
			cnt++;
		}
		else {
			queue.add(queue.poll());
			Max(queue);
		}
		}
		return cnt;
	}

	static int Max(Queue<Integer> queue) {
		int max = 0;
		for (int j = 0; j < queue.size(); j++) {
			int num = queue.poll();
			if (num > max)
				max = num;
			queue.offer(num);
		}
		return max;
	}

}
