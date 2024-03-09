import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] check = new boolean[10001];

        for(int i = 0 ; i < check.length ; i++){
            char[] list = String.valueOf(i).toCharArray();
            int num = i;

            for(char c : list){
                num += Character.getNumericValue(c);
            }

            if(num < check.length){
                check[num] = true;
            }
        }

        for(int j = 0 ; j < check.length ; j++){
            if(!check[j]){
                bw.write(String.valueOf(j));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}