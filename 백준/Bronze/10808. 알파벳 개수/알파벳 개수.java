import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] c = br.readLine().toCharArray();
        int[] list = new int[26];
        for(int i = 0 ; i < c.length ; i++){
            list[c[i]-97] += 1;
        }

        for(int result: list){
            bw.write(String.valueOf(result));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}