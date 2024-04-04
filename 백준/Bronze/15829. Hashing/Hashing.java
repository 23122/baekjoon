import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        int    cnt  = Integer.parseInt(br.readLine());
        char[] line = br.readLine().toCharArray();
        int    hash = 1234567891;

        BigInteger result = BigInteger.ZERO;

        for(int i = 0 ; i < cnt ; i++){
            int num = line[i] - 'a' + 1;
            BigInteger power = BigInteger.valueOf(31).pow(i).mod(BigInteger.valueOf(hash));
            BigInteger term  = BigInteger.valueOf(num).multiply(power);

            result = result.add(term);
        }

        bw.write(String.valueOf(result.mod(BigInteger.valueOf(hash))));


        br.close();
        bw.flush();
        bw.close();
    }
}

