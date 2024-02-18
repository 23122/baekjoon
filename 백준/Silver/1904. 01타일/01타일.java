import java.util.*;
import java.io.*;

public class Main {
	
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		dp = new int[N+2];
		
		for(int i = 0; i < N+2; i++) {
			dp[i] = -1;
		}
		
		dp[0] = 0;
		dp[1] = 1;
		
		System.out.println(Fib(N+1));
		
	}
	
	public static int Fib(int N) {
		if(dp[N] == -1) {
			dp[N] = (Fib(N-2) + Fib(N-1)) % 15746;
		}
		return dp[N];
	}
	
}