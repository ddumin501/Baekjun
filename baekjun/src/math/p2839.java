package math;
import java.util.Scanner;

public class p2839 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int five = N / 5;
		for (int i = five; i >= 0; i--) { //i�� 5kg ���� ����, �ϳ��� ����
			if ((N - (5 * i)) % 3 == 0) { //����� ��������
				System.out.println((N - (i * 5)) / 3 + i);
				break;
			} else if (i == 0)// ���� �� ������
				System.out.println(-1);
		}
	}
}
