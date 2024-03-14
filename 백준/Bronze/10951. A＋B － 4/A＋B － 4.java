import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();

            if (line == null || line.isEmpty()) break;

            String[] str = line.split(" ");
            int sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);

            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
