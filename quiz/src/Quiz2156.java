import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2156 {

   public static int amount[];
   public static int dp[];
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(bf.readLine());
      
      amount = new int[n + 1];
      dp = new int[n + 1];
      
      for(int i = 1; i <= n; i++) {
         amount[i] =Integer.parseInt(bf.readLine());
         
      }
      
      System.out.println(max_cnt(n));
   }
   
   public static int max_cnt(int n) {
	   
	   dp[1] = amount[1];
	   
	   if(2 <= n)
	   dp[2] = amount[1] + amount[2];
	   
	
	   if(dp[n] == 0) {
		   for(int i = 3 ; i <= n; i++) {
			   dp[i] = Math.max(Math.max(dp[i -  3] + amount[i-1] + amount[i], dp[i -2] + amount[i]), dp[i-1]);
  
		   }
	   }
	   
	   return dp[n];
   }
   
   

}