package greedy;

import java.util.Scanner;

public class p11047 {
	public static void main(String[] args) {
		// 11047 동전0 문제

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int A[] = new int[N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}

		for (int i = N - 1; i >= 0; i--) {
			cnt += K/A[i];
			K %= A[i];
		}
		
		System.out.println(cnt);
	}


}
