import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        for(int j = 0 ; j < i ; j++){
            for(int n = 0 ; n < i - j - 1 ; n++){
                bw.write(" ");
            }
            for(int m = 0 ; m <= 2 * j ; m++){
                bw.write("*");
            }
            bw.newLine();
        }
        for(int j = i - 2 ; j >= 0 ; j--){
            for(int n = 0 ; n < i - j - 1 ; n++){
                bw.write(" ");
            }
            for(int m = 0 ; m <= 2 * j ; m++){
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}