import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cycle = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cycle ; i++){
            String[] line = br.readLine().split(" ");
            int h = Integer.parseInt(line[0]);
            int w = Integer.parseInt(line[1]);
            int n = Integer.parseInt(line[2]);

            int floor      = (n % h == 0) ? h : n % h;
            int roomNumber = (n % h == 0) ? n / h : n / h + 1;
            bw.write(String.valueOf(floor));
            bw.write(String.format("%02d",roomNumber));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
