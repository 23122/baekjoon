import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] line  = br.readLine().toCharArray();
        int [] point = new int[26];
        Arrays.fill(point, -1);

        for(int i = 0 ; i < line.length ; i++) {
            if(point[line[i]-'a'] == -1){
                point[line[i]-'a'] = i;
            }
        }

        for(int j : point){
            bw.write(j+" ");
        }

        bw.flush();
        bw.close();
    }
}
