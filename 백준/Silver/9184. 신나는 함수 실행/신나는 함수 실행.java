import java.util.*;
import java.io.*;

public class Main {
	
	// if조건 중 a,b,c가 20보다 크면 w(20,20,20)을 호출한다.
	// 이 말인 즉 a,b,c가 20보다 큰 어떤 수든 w(20,20,20)을 호출한다는 말이다. 따라서 dp 크기는 21로 지정하면 된다. 
	static int[][][] dp = new int[21][21][21];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			// a, b, c가 음수인 경우 에러
//			dp = new int[a+1][b+1][c+1];
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static int w(int a, int b, int c) {
		if(inRange(a, b, c) && dp[a][b][c] > 0) {
			return dp[a][b][c];
		}
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if(a > 20 || b > 20 || c > 20) {
			// a 혹은 b 혹은 c가 20보다 크다면 dp[20][20][20]에 w(20,20,20)을 저장하면 된다.
			// 만약 a=20, b=21, c=22 일때 dp[20][20][20]에 저장하지 않고 dp[a][b][c]에 저장하면 
			// IndexOutOfBoundException이 발생한다. (dp의 크기는 [21][21][21]이기 때문에!)
			// return dp[a][b][c] = w(20, 20, 20);
			
			return dp[20][20][20] = w(20, 20, 20);
		}
		if(a < b && b < c) {
			return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	
	public static boolean inRange(int a, int b, int c) {
		return (0 <= a && a <= 20) && (0 <= b && b <= 20) && (0 <= c && c <= 20);
	}
	
}