import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] i = new int[cnt];

        for(int j = 0 ; j < cnt ; j++){
            i[j] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(i);

        StringBuilder result = new StringBuilder();
        for (int num : i) {
            result.append(num).append('\n');
        }
        bw.write(result.toString());

        bw.flush();
        bw.close();
    }

}