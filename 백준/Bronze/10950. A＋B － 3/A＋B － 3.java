import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str1 = in.readLine();
        int a = Integer.parseInt(str1);
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < a ; i++){
            String str2 = in.readLine();
            String[] sp = str2.split(" ");
            int b = Integer.parseInt(sp[0]);
            int c = Integer.parseInt(sp[1]);
            l.add(b+c);
        }
        for(int j : l){
            System.out.println(j);
        }
    }
}