import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());

        for(int j = 0 ; j < i ; j++){
            int    left  = 0;
            int    right = 0;
            char[] line  = br.readLine().toCharArray();

            for(char c : line){
                switch (c){
                    case '(' : left++;break;
                    case ')' : right++;break;
                    default: break;
                }
                if(right > left) {
                    break;
                }
            }

            if(left == right){
                bw.write("YES");
                bw.newLine();
            }else{
                bw.write("NO");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}