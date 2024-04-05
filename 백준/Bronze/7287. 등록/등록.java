import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("106");
        bw.newLine();
        bw.write("biboxkl");
        bw.flush();
        bw.close();
    }
}