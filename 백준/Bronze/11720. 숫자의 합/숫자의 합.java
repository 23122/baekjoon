import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int    cnt    = Integer.parseInt(br.readLine());
        char[] list   = br.readLine().toCharArray();
        int    result = 0;

        for(int i = 0; i < cnt ; i++){
            result += Character.getNumericValue(list[i]);
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}