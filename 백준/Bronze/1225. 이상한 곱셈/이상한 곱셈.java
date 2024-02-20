import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[]   i     = st.nextToken().toCharArray();
        char[]   j     = st.nextToken().toCharArray();
        long     value = 0L;

        for(char c : i){
            for(char r : j){
                value += Character.getNumericValue(c) * Character.getNumericValue(r);
            }
        }
        System.out.println(value);
    }
}