import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");

        int[] min = new int[list.length / 2];

        for(int i = 0 ; i < list.length / 2 ; i++){
            int n = Integer.parseInt(list[i]);
            int m = Integer.parseInt(list[i+2]);

            min[i % 2] = Math.min(n,m-n);
        }

        int result = Math.min(min[0],min[1]);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}