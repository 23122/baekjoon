import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] flg  = new boolean[31];
        String    line;

        while ((line = br.readLine()) != null && line.length() > 0) {
            flg[Integer.parseInt(line)] = true;
        }

        for (int i = 1 ; i < flg.length ; i++){
            if(!flg[i]){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}