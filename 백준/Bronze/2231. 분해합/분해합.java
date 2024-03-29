import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num    = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0 ; i <= num ; i++){
            int sum  = i;
            int temp = i;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(num == sum){
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
