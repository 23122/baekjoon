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
        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }

}