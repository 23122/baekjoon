import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = Integer.parseInt(br.readLine());
        int copy   = target;
        int cycle  = 0;

        br.close();

        while (true) {
            target = target % 10 * 10 + (target / 10 + target % 10) % 10;
            cycle++;
            if(copy == target){
                break;
            }
        }

        bw.write(String.valueOf(cycle));
        bw.flush();
        bw.close();
    }
}