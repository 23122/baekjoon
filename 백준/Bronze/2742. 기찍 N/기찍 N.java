import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        for(int j = i ; j > 0 ; j--){
            bw.write(String.valueOf(j));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}