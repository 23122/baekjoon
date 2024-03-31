import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    int numFront = Integer.parseInt(st.nextToken());
                    deque.offerFirst(numFront);
                    break;
                case "push_back":
                    int numBack = Integer.parseInt(st.nextToken());
                    deque.offerLast(numBack);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollLast() + "\n");
                    }
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                    break;
                default: break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
