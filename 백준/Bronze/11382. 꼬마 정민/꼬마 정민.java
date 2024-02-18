import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        String[] sp = str.split(" ");
        Long a = Long.parseLong(sp[0]);
        Long b = Long.parseLong(sp[1]);
        Long c = Long.parseLong(sp[2]);

        System.out.println(a+b+c);
    }

}