import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt ; i++){
            char[] line = br.readLine().toCharArray();

            bw.write(String.valueOf(line[0]));
            bw.write(String.valueOf(line[line.length-1]));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
