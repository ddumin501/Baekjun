package greedy;

import java.util.Scanner;

public class p9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int testcase[] = new int[n];
		for(int i=0;i<n;i++) {
			testcase[i] = sc.nextInt();
		}
		int f[] = new int[12];
		f[1]=1;
		f[2]=2;
		f[3]=4;
		
		
		for(int i=4;i<12;i++) {
			f[i]=f[i-1]+f[i-2]+f[i-3];
		}
		for(int i=0;i<n;i++)
		System.out.println(f[testcase[i]]);
	}
}
