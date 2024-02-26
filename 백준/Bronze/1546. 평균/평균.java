import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        float    cnt = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        float sum = 0;
        float max = 0;

        for(int i = 0 ; i < cnt ; i++){
            sum += Integer.parseInt(str[i]);
            max = Math.max(max,Integer.parseInt(str[i]));
        }

        bw.write(String.valueOf((sum/cnt)/max*100));

        bw.flush();
        bw.close();
    }
}