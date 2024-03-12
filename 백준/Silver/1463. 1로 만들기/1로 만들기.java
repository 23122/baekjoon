import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i   = Integer.parseInt(br.readLine());
        int[] cnt = new int[i+1];

        for(int j = 2 ; j < i + 1 ; j++) {
            cnt[j] = cnt[j-1]+1;
            if(j % 2 == 0){
                cnt[j] = Math.min(cnt[j], cnt[j/2]+1);
            }
            if(j % 3 == 0){
                cnt[j] = Math.min(cnt[j], cnt[j/3]+1);
            }
        }
        
        bw.write(String.valueOf(cnt[i]));

        bw.flush();
        bw.close();
    }
}