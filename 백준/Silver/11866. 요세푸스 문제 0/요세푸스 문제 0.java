import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st    = new StringTokenizer(br.readLine());
        StringBuilder   sb    = new StringBuilder();
        List<Integer>   list  = new ArrayList<>();

        int N     = Integer.parseInt(st.nextToken());
        int K     = Integer.parseInt(st.nextToken());
        int index = 0;

        for(int i = 1 ; i <= N ; i++){
            list.add(i);
        }

        sb.append("<");


        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            sb.append(list.remove(index));

            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
