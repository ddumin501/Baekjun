import java.util.Arrays;
import java.util.Scanner;

public class p1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = sc.nextInt();
		}

		int M = sc.nextInt();
		int B[] = new int[M];
		for (int j = 0; j < M; j++) {
			B[j] = sc.nextInt();
		}
		int result[] = new int[M];

		Arrays.sort(A);

		for (int j = 0; j < M; j++) {
			int start = 0;
			int end = N - 1;
			int mid=end/2;

			while (start <= end) {
				mid = (start+end)/2;

				if (A[mid] == B[j]) {
					result[j] = 1;
					break;
				}else if (A[mid] > B[j]) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			System.out.println(result[i]);
		}

	}
}