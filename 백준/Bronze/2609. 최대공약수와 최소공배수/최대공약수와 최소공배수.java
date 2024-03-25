import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int      n    = Integer.parseInt(line[0]);
        int      m    = Integer.parseInt(line[1]);
        int      max  = 0;

        for(int i = Math.min(n,m) ; i > 0  ; i--){
            if(n % i == 0 && m % i == 0){
                max = i;
                break;
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(n * m / max));

        bw.flush();
        bw.close();
    }
}
