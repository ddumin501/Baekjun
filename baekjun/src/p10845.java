import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p10845 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String method = new String();
		int back=-1;
		for (int i = 0; i < num; i++) {
			method = sc.next();
			if (method.equals("push")) {
				Integer a = sc.nextInt();
				q.add(a);
				back=a;
			}
			else if (method.equals("pop")) {
				Integer a = q.poll();
				if (a == null) {
					System.out.println(-1);
				} else {
					System.out.println(a);
					if(q.size()==0) back=-1;
				}
			}
			else if (method.equals("size")) {
				Integer a = q.size();
				System.out.println(a);
			}
			else if (method.equals("empty")) {
				boolean a = q.isEmpty();
				if (a == true)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if (method.equals("front")) {
				Integer a = q.peek();
				if (a == null) {
					System.out.println(-1);
				} else
					System.out.println(a);
			}
			else if (method.equals("back")) {
				if (back == -1) {
					System.out.println(-1);
				} else
					System.out.println(back);
			}		
		}
	}

}
