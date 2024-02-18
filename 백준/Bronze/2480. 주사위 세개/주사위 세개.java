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
        int c = Integer.parseInt(sp[2]);

        if(a==b&&b==c){
            System.out.println(10000+a*1000);
        }else if(a==b&&b!=c){
            System.out.println(1000+a*100);
        } else if (a!=b&&b==c) {
            System.out.println(1000+b*100);
        } else if (a==c&&b!=c) {
            System.out.println(1000+c*100);
        }else {
            int d = 0;
            if(a>=b && a>=c) d = a;
            if(b>=a && b>=c) d = b;
            if(c>=a && c>=b) d = c;
            System.out.println(d*100);
        }

    }
}