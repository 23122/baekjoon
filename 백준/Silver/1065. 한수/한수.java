import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        if(i < 100){
            bw.write(String.valueOf(i));
        }else {
            int result = 99;
            for (int j = 111 ; j <= i ; j++){
                if(((j % 100 / 10 )* 2) == (j / 100) + (j % 10)){
                    result++;
                }
            }
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
    }
}