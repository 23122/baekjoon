import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        String[] sp = str.split(" ");
        String str2 = in.readLine();
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int c = Integer.parseInt(str2);
        int h = 0;
        int m = 0;

        if(b+c>=60){
            m = (b+c)%60;
            if (a+((b+c)/60)<24) h = a + ((b+c)/60);
            else if (a+((b+c)/60)>24) h = (a + ((b+c)/60))-24;
        } else {
            m = b+c;
            h = a;
        }
        System.out.println(h+" "+m);

    }
}