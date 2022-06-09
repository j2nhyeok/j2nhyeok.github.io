import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz11055 {
	public static int dp[ ];
	public static int numbers[ ];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		dp = new int[N + 1];
		numbers = new int[N + 1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		for(int i = 1; i <= N; i++) {
		 dp[i] = numbers[i] = Integer.parseInt(st.nextToken());
			
		}
		
		System.out.println(max_sum(N));

	}
	
	public static int max_sum(int N) {
	
	
	
		if(dp[N] == numbers[N]) {
			
			for(int i = 2; i <= N; i++) {
				
				int temp = 0;
				for(int j = 1; j < i ; j++) {
					if(numbers[j] < numbers[i]) {
						temp = Math.max(temp, dp[j]);
						
						dp[i] = temp + numbers[i];
					}
				}
			}
			Arrays.sort(dp);
		}

	
	

		return dp[N];
	}

}
