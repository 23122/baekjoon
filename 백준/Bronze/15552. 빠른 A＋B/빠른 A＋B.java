import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < cnt ; i++){
            String[] line = br.readLine().split(" ");
            int num =Integer.parseInt(line[0]) + Integer.parseInt(line[1]);
            bw.write(String.valueOf(num));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

