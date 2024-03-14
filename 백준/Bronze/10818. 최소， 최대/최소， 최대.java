import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] str = br.readLine().split(" ");
        for(String num : str){
            int currentNum = Integer.parseInt(num);
            max = Math.max(max, currentNum);
            min = Math.min(min, currentNum);
        }

        bw.write(min+" "+max);

        bw.flush();
        bw.close();
    }
}