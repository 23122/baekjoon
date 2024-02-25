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

        Arrays.sort(i);

        Arrays.stream(i).forEach(num -> {
            try {
                bw.write(String.valueOf(num));
                bw.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.flush();
        bw.close();
    }

}