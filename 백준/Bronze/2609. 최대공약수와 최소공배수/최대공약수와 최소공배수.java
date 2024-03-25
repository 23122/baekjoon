import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int      n    = Integer.parseInt(line[0]);
        int      m    = Integer.parseInt(line[1]);
        int      max  = 0;
        int      min  = Math.max(n,m);

        for(int i = Math.min(n,m) ; i > 0  ; i--){
            if(n % i == 0 && m % i == 0){
                max = i;
                break;
            }
        }

        while (true){
            if(min % n == 0 && min % m == 0){
                break;
            }
            min++;
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
    }
}
