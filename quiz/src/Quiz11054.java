import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Quiz11054 {
	public static int numbers[];
	public static int R_dp[];
	public static int L_dp[];

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(bf.readLine()); 
		
		
		numbers = new int[N+1]; 
		R_dp = new int[N + 1];
		L_dp = new int[N + 1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); 

		for(int i = 1; i <= N ; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			R_dp[i] = 1;
			L_dp[i] = 1;
		}
		
		right_dp(N);
	
		left_dp(N);
	
		


			
		int max = 0;
		
		for(int i = 1; i <= N; i++) {
			if( max < R_dp[i] + L_dp[i]) {
				max = R_dp[i] + L_dp[i];
			}
		}
	
		System.out.println(max -1);
	

        
	}
	
	public static void right_dp(int N) {
		
		for(int j = 2; j <= N; j++) { 
			
				for(int i = 1 ; i < j ; i++) {
	           // i번째 원소가 j번째 원소보다 작으면서 j번째 dp가 i번째 dp + 1 값보다 작은경우
					if(numbers[i] < numbers[j] && R_dp[j] < R_dp[i] + 1) {
							R_dp[j] = R_dp[i] + 1; // i번째 원소의 +1 값이 j번째 dp가 된다.
			
					}	
				}
		}
	}
		
	
	public static void left_dp(int N) {	
		for(int j = N - 1 ; 1 <= j ; j--) {
			
			for(int i = N ; i> j; i--) {
				if(numbers[i] < numbers[j]  && L_dp[j] < L_dp[i] + 1 ) {
					L_dp[j] = L_dp[i] + 1;
				
			}
		}
	}
	
	
	}
}
