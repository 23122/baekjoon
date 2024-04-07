import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String[] line   = br.readLine().split(" ");
        int      target = Integer.parseInt(br.readLine());
        int      result = 0;

        for(String str : line){
            if(Integer.parseInt(str) == target){
                result++;
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }
}
