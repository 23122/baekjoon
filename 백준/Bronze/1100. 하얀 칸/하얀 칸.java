import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        for(int j = 0 ;j < 8 ; j++){
            String s = br.readLine();
            for(int l = 0 ; l < 8 ;  l++){
                if("F".equals(String.valueOf(s.charAt(l))) && (l + j) % 2 == 0){
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}