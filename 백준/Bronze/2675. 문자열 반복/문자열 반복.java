import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt ; i++){
            String[] list = br.readLine().split(" ");
            char[] c = list[1].toCharArray();
            for(int n = 0 ; n < c.length ; n++){
                for(int j = 0 ; j < Integer.parseInt(list[0]) ; j++){
                    bw.write(c[n]);
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}