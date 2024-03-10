import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());
        LinkedList<String> list = new LinkedList<>();

        for(int j = 0 ; j < i ; j++){
            String[] line  = br.readLine().split(" ");

            switch (line[0]){
                case "push"  :
                    list.addFirst(line[1]);
                    break;
                case "pop"   :
                    if(list.size() > 0){
                        bw.write(list.getFirst());
                        list.pop();
                    }else {
                        bw.write("-1");
                    }
                    break;
                case "size"  :
                    bw.write(String.valueOf(list.size()));
                    break;
                case "empty" :
                    if(list.isEmpty()){
                        bw.write("1");
                    }else{
                        bw.write("0");
                    }
                    break;
                case "top"   :
                    if(list.size() > 0){
                        bw.write(list.getFirst());
                    }else{
                        bw.write("-1");
                    }
                    break;
                default: break;
            }

            if(!"push".equals(line[0])){
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}