import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        br.readLine();
        String[]        nString = br.readLine().split(" ");
        HashSet<String> nSet    = new HashSet<>(Arrays.asList(nString));
        
        br.readLine();
        String[] mString = br.readLine().split(" ");

        for (String str : mString) {
            if (nSet.contains(str)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
