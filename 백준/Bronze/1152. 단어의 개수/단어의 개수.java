import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String   line = br.readLine();
        String[] str  = line.split(" ");
        int      i    = str.length;

        for(String s : str){
            if("".equals(s)){
                i--;
            }
        }

        bw.write(String.valueOf(i));

        bw.flush();
        bw.close();
    }
}
