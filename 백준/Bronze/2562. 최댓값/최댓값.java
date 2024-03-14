import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max    = 0;
        int target = 0;
        for(int i = 0; i < 9  ; i++) {
            int num = Integer.parseInt(br.readLine());
            max = Math.max(max,num);
            if(max == num){
                target = i + 1;
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(target));

        bw.flush();
        bw.close();
    }
}