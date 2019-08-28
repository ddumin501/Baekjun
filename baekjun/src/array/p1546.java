package array;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine().trim());
		String[] str = br.readLine().split(" ");
		double[] score = new double[n];
		double m = 0;
		double sum = 0;
		for (int i = 0; i < str.length; i++) {
			score[i] = Integer.parseInt(str[i]);
			if (score[i] > m) {
				m = score[i];
			}
		}

		for (int i = 0; i < score.length; i++) {
			score[i] = (score[i] / m) * 100;
			sum += score[i];
		}
		bw.write(sum / score.length + "\n");
		bw.flush();
	}

}
