import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        int exclude = Math.round((float) N * 0.15f);

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        Collections.sort(list);

        list.subList(0, exclude).clear();
        list.subList(list.size() - exclude, list.size()).clear();

        int sum = 0;
        for (int point : list) {
            sum += point;
        }
        int average = Math.round((float) sum / list.size());

        bw.write(String.valueOf(average));

        bw.flush();
        br.close();
        bw.close();
    }
}
