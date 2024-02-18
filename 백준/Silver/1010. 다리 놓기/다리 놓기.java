import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int arr[][] = new int[31][31];
		arr[0][0] = 1;
		arr[0][1] = 1;
		
		for (int i = 1; i <= 30; i++) {
			for (int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					arr[i][j] = 1;
				}else {
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]);
				}
			}
		}
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int K= sc.nextInt();
			if(N < K) {
				int tmp = N;
				N = K;
				K = tmp;
			}
			System.out.println(arr[N][K]);
		}
	}
}