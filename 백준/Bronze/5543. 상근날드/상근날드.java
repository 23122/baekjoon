import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int list[] = new int[5];

        for(int i = 0; i < 5 ; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        int bugger = Math.min(list[0],Math.min(list[1],list[2]));
        int drink  = Math.min(list[3],list[4]);

        bw.write(String.valueOf(bugger + drink - 50));

        bw.flush();
        bw.close();
    }
}