package method;
public class p4673 {

	public static void main(String[] args) throws Exception {
		boolean[] chk = new boolean[10001];
		for (int i = 1; i <= 10000; i++) {
			int num = SelfNumber(i);
			if (num <= 10000) {
				chk[num] = true;
			}
		}
		for (int i = 1; i <= 10000; i++) {
			if (!chk[i]) {
				System.out.println(i);
			}
		}
	}

	private static int SelfNumber(int i) {
		int sum = i;
		while (i > 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}

}
