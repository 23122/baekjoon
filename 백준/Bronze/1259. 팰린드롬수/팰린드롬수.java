import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result = "yes";

        while (true){
            char[] line = br.readLine().toCharArray();
            if(line[0] == '0'){
                break;
            }
            for(int i = 0 ; i <= line.length / 2 ; i++){
                if(line[i] != line[line.length - 1 - i]){
                    result = "no";
                    break;
                }
            }
            bw.write(result);
            bw.newLine();
            result = "yes";
        }

        bw.flush();
        bw.close();
    }
}
