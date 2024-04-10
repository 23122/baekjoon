import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && line.length() > 0) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}