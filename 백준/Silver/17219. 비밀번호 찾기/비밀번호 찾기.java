import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());
        HashMap<String,String> hashMap = new HashMap<>();

        for(int i = 0 ; i < cnt + question; i++){
            st = new StringTokenizer(br.readLine());
            if(i < cnt){
                String domain = st.nextToken();
                String password = st.nextToken();
                hashMap.put(domain,password);
            }else {
                bw.write(hashMap.get(st.nextToken()));
                bw.newLine();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
