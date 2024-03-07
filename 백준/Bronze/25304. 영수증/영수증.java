import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total = Integer.parseInt(br.readLine());
        int kind  = Integer.parseInt(br.readLine());
        int sum   = 0;

        for(int i = 0 ; i < kind ; i++) {
            String[] goods = br.readLine().split(" ");
            sum += Integer.parseInt(goods[0]) * Integer.parseInt(goods[1]);
        }

        if(total == sum){
            bw.write("Yes");
        }else {
            bw.write("No");
        }
        
        bw.flush();
        bw.close();
    }
}