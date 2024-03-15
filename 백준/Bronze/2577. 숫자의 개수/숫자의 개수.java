import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String multiply = String.valueOf(a * b * c);

        for(int i = 0 ; i < multiply.length() ; i++){
            int target = Integer.parseInt(multiply.substring(i,i+1));
            num[target]++;
        }

        for (int result:num){
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
