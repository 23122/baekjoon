import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= cnt ; i++){
            q.add(i);
        }

        for(int j = cnt ; j > 1 ; j--){
            q.poll();
            q.add(q.peek());
            q.poll();
        }

        bw.write(String.valueOf(q.poll()));

        bw.flush();
        bw.close();
    }
}
