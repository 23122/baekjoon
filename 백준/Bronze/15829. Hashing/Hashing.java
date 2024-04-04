import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        int    cnt  = Integer.parseInt(br.readLine());
        char[] line = br.readLine().toCharArray();

        int result = 0;

        for(int i = 0 ; i < cnt ; i++){
            int num = line[i] - 'a' + 1;
            result += num * Math.pow(31,i);
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}

