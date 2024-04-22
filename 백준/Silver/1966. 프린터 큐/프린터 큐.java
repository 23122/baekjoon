import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < cnt ; i++){
            st = new StringTokenizer(br.readLine());
            int page        = Integer.parseInt(st.nextToken());
            int targetIndex = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<Document> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < page; j++) {
                int importance = Integer.parseInt(st.nextToken());
                queue.offer(new Document(j, importance));
                priorityQueue.offer(importance);
            }

            int order = 0;

            while (!queue.isEmpty()) {
                Document doc = queue.poll();
                if (doc.importance == priorityQueue.peek()) {
                    order++;
                    priorityQueue.poll();
                    if (doc.index == targetIndex) {
                        bw.write(String.valueOf(order));
                        bw.newLine();
                        break;
                    }
                } else {
                    queue.offer(doc);
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

class Document {
    int index;
    int importance;

    public Document(int index, int importance) {
        this.index = index;
        this.importance = importance;
    }
}

