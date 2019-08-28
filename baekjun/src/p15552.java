import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p15552 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int casenum = Integer.parseInt(br.readLine().trim());
		
		int a, b, i;
		for (i = 0; i < casenum; i++) {
			String[] str = br.readLine().split(" ");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			bw.write(a + b + "\n");
		}
		bw.flush();
		bw.close();
	}
}
