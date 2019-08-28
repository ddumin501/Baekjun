package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int[][] time = new int[n][2];
		for (int i = 0; i < n; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		
		//bubble sort ==> 시간초과
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				int tmp;
				if(time[j][1]>time[j+1][1]) {
					tmp = time[j][1];
					time[j][1]=time[j+1][1];
					time[j+1][1]=tmp;
					tmp = time[j][0];
					time[j][0]=time[j+1][0];
					time[j+1][0]=tmp;
				}
			}
		}*/
		
		//Comparator 함수 사용
		Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) //반드시 필요!
                	//Q.시간을 오래채우는것을 선택해야할까?
                    return o1[0] - o2[0]; 
                return o1[1] - o2[1];
            }
        });
		
		int e = -1;
		for (int i = 0; i < n; i++) {
			if (time[i][1] >= e) {
				cnt++;
				e = time[i][1];
			}

		}
		System.out.println(cnt);
	}

}
