import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] ground = new int[y][x];
        int minHeight = 256, maxHeight = 0;

        for (int i = 0 ; i < y ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < x ; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, ground[i][j]);
                maxHeight = Math.max(maxHeight, ground[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = -1;
        for (int h = minHeight ; h <= maxHeight ; h++) {
            int usedTime = 0;
            int havingBlock = b;
            for (int i = 0 ; i < y ; i++) {
                for (int j = 0 ; j < x ; j++) {
                    int diff = ground[i][j] - h;
                    if (diff > 0) {
                        usedTime += diff * 2;
                        havingBlock += diff;
                    } else if (diff < 0) {
                        usedTime -= diff;
                        havingBlock += diff;
                    }
                }
            }

            if (havingBlock >= 0 && usedTime <= minTime) {
                minTime = usedTime;
                height = h;
            }
        }
        bw.write(minTime + " " + height);
        bw.flush();
        br.close();
        bw.close();
    }

}
