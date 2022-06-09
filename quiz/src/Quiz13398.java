package first.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz13398 {
   public static int numbers[];
   public static int dp[][];


   
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
     
       int n = Integer.parseInt(bf.readLine());
      
      numbers = new int[n + 1];
      dp = new int[n + 1][2];

      
      StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
      
      
      for(int i = 1;i <= n ; i++) {
         numbers[i] = Integer.parseInt(st.nextToken());
      }
      
      if(n == 1) {
      System.out.println(numbers[1]);
      }
      
      else if(2 <= n) {
      dp[1][0] = dp[1][1] = numbers[1];
      int max = Integer.MIN_VALUE;
      
     for(int i = 2; i <= n ; i++) {
    	 dp[i][0] = Math.max(dp[i - 1][0] + numbers[i], numbers[i]);
    	 dp[i][1] = Math.max(dp[i-1][0], dp[i - 1][1] + numbers[i]);
    	 
    	 max = Math.max(Math.max(max, dp[i][0]), dp[i][1]);
    	 
     }
     
      System.out.println(max);
      
      }
      }
      
      
   }
