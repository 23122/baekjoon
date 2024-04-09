import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        String[]   line = br.readLine().split(" ");
        BigInteger a    = BigInteger.valueOf(Long.parseLong(line[0]));
        BigInteger b    = BigInteger.valueOf(Long.parseLong(line[1]));

        bw.write(String.valueOf(a.pow(2).subtract(b.pow(2))));

        br.close();
        bw.flush();
        bw.close();
    }
}
