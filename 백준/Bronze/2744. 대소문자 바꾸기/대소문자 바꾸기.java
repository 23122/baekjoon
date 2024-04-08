import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chr = br.readLine().toCharArray();

        for(char c : chr){
            if(c - 'a' < 0){
                bw.write(c + ' ');
            }else{
                bw.write(c - ' ');
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
