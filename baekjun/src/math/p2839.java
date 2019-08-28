package math;
import java.util.Scanner;

public class p2839 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int five = N / 5;
		for (int i = five; i >= 0; i--) { //i는 5kg 포대 개수, 하나씩 줄임
			if ((N - (5 * i)) % 3 == 0) { //제대로 나눠질때
				System.out.println((N - (i * 5)) / 3 + i);
				break;
			} else if (i == 0)// 나눌 수 없을때
				System.out.println(-1);
		}
	}
}
