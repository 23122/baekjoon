import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        int      cnt  = 0;
        String[] line = br.readLine().split(" ");

        for(String str : line){
            int num = Integer.parseInt(str);
            if(num > 1){
                boolean flg = true;
                for(int i = 2; i <= Math.sqrt(num) ; i++){
                    if(num % i == 0){
                        flg = false;
                        break;
                    }
                }

                if(flg){
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}
