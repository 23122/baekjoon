import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cycle = Integer.parseInt(br.readLine());
        int[] first = new int[26];

        for(int i = 0 ; i < cycle ; i++){
            String str =  br.readLine();
            char c = str.charAt(0);
            first[c-97]++;
        }
        boolean flg = false;

        for(int j = 0 ; j < first.length ; j++){
            if(first[j] >= 5){
                flg = true;
                bw.write(Character.toChars(j+97));
            }
        }

        if(!flg){
            bw.write("PREDAJA");
        }

        bw.flush();
        bw.close();
    }
}