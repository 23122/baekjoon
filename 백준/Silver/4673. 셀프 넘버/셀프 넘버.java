import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] i      = new int[10001];
        int[] number = new int[10001];

        for(int j = 0 ; j <= i.length-1 ; j++){
            number[j] = j;
            char[] list = String.valueOf(j).toCharArray();
            i[j] = j;
            for(char c : list){
                i[j] += Character.getNumericValue(c);
            }
        }

        for(int target : number){
            if(IntStream.of(i).noneMatch(result -> result == target)){
                bw.write(String.valueOf(target));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}