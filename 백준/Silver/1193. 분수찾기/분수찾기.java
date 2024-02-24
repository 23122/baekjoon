import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        int arithmeticSequence = 0;

        while (i > 0){
            arithmeticSequence++;
            i -= arithmeticSequence;
        }

        if(arithmeticSequence % 2 == 0){
            bw.write((arithmeticSequence+(i)) + "/" + -1*(i-1));
        }else {
            bw.write(-1*(i-1) + "/" + (arithmeticSequence+(i)));
        }

        bw.flush();
        bw.close();
    }

}