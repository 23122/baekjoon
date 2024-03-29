import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cardCount = new int[20000001];

        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            cardCount[num + 10000000]++;
        }

        br.readLine();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(cardCount[num + 10000000] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}