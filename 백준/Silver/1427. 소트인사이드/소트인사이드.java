import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine();
        Integer[] result = new Integer[target.length()];

        for (int i = 0; i < target.length(); i++) {
            result[i] = Character.getNumericValue(target.charAt(i));
        }

        Arrays.sort(result, Collections.reverseOrder());

        Arrays.stream(result).forEach(num -> {
            try {
                bw.write(String.valueOf(num));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.flush();
        bw.close();
    }
}