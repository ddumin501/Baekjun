package method;
import java.util.Scanner;

public class p1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i<=N;i++) {
			if(i<100) cnt++;
			else if(i==1000) break;
			else cnt += han(i);
		}
		System.out.println(cnt);
	}
	
	public static int han(int i) {	
		
		int num1 = i%10-(i/10)%10;
		int num2 = (i/10)%10-(i/100)%10;
		if(num1==num2) return 1;
		else return 0;
	}

}
