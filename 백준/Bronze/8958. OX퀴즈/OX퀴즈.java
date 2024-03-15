import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cycle = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cycle ; i++){
            char[] chr   = br.readLine().toCharArray();
            int    score = 0;
            int    combo = 0;

            for(char c : chr){
                if(c == 'O'){
                    combo++;
                    score += combo;
                }else{
                    combo = 0;
                }
            }
            bw.write(String.valueOf(score));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
