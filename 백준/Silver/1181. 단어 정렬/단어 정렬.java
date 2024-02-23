import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt  = Integer.parseInt(br.readLine());
        String[] list = new String[cnt];

        for(int i = 0; i < cnt ; i++){
            list[i] = br.readLine();
        }
        br.close();
        String[] result = Arrays.stream(list)
                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .distinct()
                .toArray(String[]::new);

        Arrays.stream(result).forEach(str -> {
            try {
                bw.write(str+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.flush();
        bw.close();
    }
}