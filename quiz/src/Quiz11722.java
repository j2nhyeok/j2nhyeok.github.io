import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz11722 {
	public static int numbers[];
	public static int dp[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		numbers = new int[N + 1];
		dp = new int[N + 1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		for(int i = 1; i <= N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}
		
		System.out.println(Descending_Longest_Cnt(N));

	}
	
	public static int Descending_Longest_Cnt(int N) {
		
		if(N >= 2) {
			for(int i = 2; i <= N; i++) {
				int temp = 0;
				for(int j = 1; j < i ; j++) {
					if(numbers[j] > numbers[i])
					temp = Math.max(temp, dp[j]);
					
					dp[i] = temp + 1;
				}
			}
		}
		
	for(int i = 1; i <= N; i++) {
		System.out.print(dp[i] + " ");
	}
	System.out.println();
		Arrays.sort(dp);
		
		
		return dp[N];
		
	}
}

