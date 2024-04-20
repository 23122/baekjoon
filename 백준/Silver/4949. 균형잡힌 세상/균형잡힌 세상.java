import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br     = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw     = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.equals(".")) {
                break;
            }

            if (isBalanced(line)) {
                bw.write("yes");
                bw.newLine();
            } else {
                bw.write("no");
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        String openingBrackets = "([";
        String closingBrackets = ")]";

        for (char c : expression.toCharArray()) {
            if (openingBrackets.indexOf(c) != -1) {
                stack.push(c);
            } else if (closingBrackets.indexOf(c) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (openingBrackets.indexOf(top) != closingBrackets.indexOf(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

