import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int    cycle  = Integer.parseInt(br.readLine());
        String result = br.readLine();

        if(cycle != 1){
            for(int i = 1 ; i < cycle ; i++){
                StringBuilder sb     = new StringBuilder();
                String        target = br.readLine();

                for(int j = 0; j < target.length() ; j++){
                    if(result.charAt(j) == target.charAt(j)){
                        sb.append(target.charAt(j));
                    }else{
                        sb.append("?");
                    }
                }

                result = sb.toString();
            }
        }
        br.close();

        bw.write(result);
        bw.flush();
        bw.close();
    }
}