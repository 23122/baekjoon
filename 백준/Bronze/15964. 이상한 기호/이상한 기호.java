import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int      a    = Integer.parseInt(line[0]);
        int      b    = Integer.parseInt(line[1]);

        bw.write(String.valueOf((a + b) * (a - b)));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
