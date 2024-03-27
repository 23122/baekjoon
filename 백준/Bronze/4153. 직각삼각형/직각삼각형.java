import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true){
            String   result = null;
            String[] line   = br.readLine().split(" ");
            int      a      = Integer.parseInt(line[0]);
            int      b      = Integer.parseInt(line[1]);
            int      c      = Integer.parseInt(line[2]);
            
            if(a + b + c == 0){
                break;
            } else if ((a * a) + (b * b) == (c * c)) {
                result = "right";
            }  else if ((a * a) + (c * c) == (b * b)) {
                result = "right";
            }  else if ((b * b) + (c * c) == (a * a)) {
                result = "right";
            } else{
                result = "wrong";
            }
            bw.write(result);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
