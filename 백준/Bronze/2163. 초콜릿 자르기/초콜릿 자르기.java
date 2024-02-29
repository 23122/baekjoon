import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list   = br.readLine().split(" ");

        int n = Integer.parseInt(list[0]);
        int m = Integer.parseInt(list[1]);


        bw.write(String.valueOf(n * m - 1));

        bw.flush();
        bw.close();
    }
}