import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());

        if(i == 0){
            bw.write("666");
        }else{
            int cnt   = 1;
            int first = 0;
            int last  = 0;

            while (true){
                if(((first % 10000)/ 10) == 666 && first % 10 != 6 ){
                    for(int j = 0; j < 1000; j++){
                        if(cnt == i){
                            bw.write(String.valueOf(first * 1000 + last));
                            bw.flush();
                            bw.close();
                            return;
                        }
                        last++;
                        cnt++;
                    }
                    first++;
                } else if (first % 1000 == 666) {
                    last = 0;
                    for(int j = 0; j < 1000; j++){
                        if(cnt == i){
                            bw.write(String.valueOf(first * 1000 + last));
                            bw.flush();
                            bw.close();
                            return;
                        }
                        last++;
                        cnt++;
                    }
                    first++;
                } else if (first % 100 == 66) {
                    last = 600;
                    for(int j = 0; j < 100; j++){
                        if(cnt == i){
                            bw.write(String.valueOf(first * 1000 + last));
                            bw.flush();
                            bw.close();
                            return;
                        }
                        last++;
                        cnt++;
                    }
                    first++;
                } else if (first % 10 == 6) {
                    last = 660;
                    for(int j = 0; j < 10; j++){
                        if(cnt == i){
                            bw.write(String.valueOf(first * 1000 + last));
                            bw.flush();
                            bw.close();
                            return;
                        }
                        last++;
                        cnt++;
                    }
                    first++;
                } else {
                    last = 666;
                    if(cnt == i){
                        bw.write(String.valueOf(first * 1000 + last));
                        bw.flush();
                        bw.close();
                        return;
                    }
                    cnt++;
                    first++;
                }
            }
        }
    }
}
