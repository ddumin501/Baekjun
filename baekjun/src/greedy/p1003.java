package greedy;

import java.util.Scanner;

public class p1003 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n[] = new int[t];
		
		for(int i=0;i<t;i++) {
		n[i] = sc.nextInt();
		}
		
		int f[][]=new int[41][2];
		
		f[0][0]=1;
		f[1][1]=1;
		
		for(int i=2;i<41;i++) {
			f[i][0]=f[i-1][0]+f[i-2][0];
			f[i][1]=f[i-1][1]+f[i-2][1];
		}
		
		for(int i=0;i<t;i++)
		System.out.println(f[n[i]][0] + " " +f[n[i]][1]);
		
		
	}


}
