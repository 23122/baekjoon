import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (i > 0){
            if(i % 5 == 0){
                cnt += i / 5;
                i = 0;
            }else{
                i -= 3;
                cnt++;
            }
        }

        if(i == 0){
            bw.write(String.valueOf(cnt));
        }else{
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        bw.close();
    }
}