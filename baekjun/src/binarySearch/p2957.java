package binarySearch;
import java.util.Scanner;

public class p2957 {
	static int c = 0;
	static int[] tree = new int[300000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int x = sc.nextInt();
			if (i == 1)
				tree[1] = x;
			else
				insert(x, 1);
			System.out.println(c);
		}

	}

	static void insert(int X, int N) {
		c++;
		if (X < tree[N]) {
			if (tree[2 * N] == 0) {
				tree[2 * N] = X;
			} else {
				insert(X, 2 * N);
			}
		} else {
			if (tree[2 * N + 1] == 0) {
				tree[2 * N + 1] = X;
			} else {
				insert(X, 2 * N + 1);
			}
		}
	}

}
