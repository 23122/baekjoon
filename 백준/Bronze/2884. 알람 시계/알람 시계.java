import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        String[] sp = str.split(" ");
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int h = 0;
        int m = 0;

        if(b<45) {
            m = b + 15;
            if(a==0) h = 23;
            else h = a - 1;
        } else if (b == 45) {
            h = a;
            m = 0;
        } else {
            h = a;
            m = b - 45;
        }
        System.out.println(h+" "+m);
    }
}