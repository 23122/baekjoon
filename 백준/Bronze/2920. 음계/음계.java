import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] list = br.readLine().split(" ");
        int      flg  = Integer.parseInt(list[0]) - Integer.parseInt(list[1]);
        String   result;
        switch (flg){
            case  1 : result = "descending"; break;
            case -1 : result = "ascending";  break;
            default : result = "mixed";      break;
        }

        for(int i = 2 ; i < list.length ; i++){
            if(flg != Integer.parseInt(list[i-1]) - Integer.parseInt(list[i])){
                result = "mixed";
                break;
            }
        }

        bw.write(result);

        bw.flush();
        bw.close();
    }
}
