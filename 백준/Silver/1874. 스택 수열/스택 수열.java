import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        int i   = Integer.parseInt(br.readLine());
        int cnt = 1;
        Stack<Integer> stack = new Stack<>();

        for (int j = 0; j < i; j++) {
            int num = Integer.parseInt(br.readLine());
            while (cnt <= num) {
                stack.push(cnt);
                sb.append("+\n");
                cnt++;
            }
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
