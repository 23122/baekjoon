import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        String[] list = br.readLine().split(" ");
        int      num  = Integer.parseInt(line[1]);

        for(int i = 0 ; i < list.length ; i++){
            int target = Integer.parseInt(list[i]);
            if(target < num){
                bw.write(target+" ");
            }
        }

        bw.flush();
        bw.close();
    }
}
