import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br     = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw     = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st     = new StringTokenizer(br.readLine());
        List<Point>     points = new ArrayList<>();

        int cnt = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }

        Collections.sort(points);

        for(Point point : points){
            bw.write(point.x + " " + point.y);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
    static class Point implements Comparable<Point>{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.y == o.y){
                return Integer.compare(this.x, o.x);
            } else {
                return Integer.compare(this.y, o.y);
            }
        }
    }
}