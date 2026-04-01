import java.util.*;
public class PositiveIntegers {
    public static void main(String[] args) {
        int A = 10;

        Queue<String> q = new LinkedList<>();

        q.add("1");
        q.add("2");
        q.add("3");

        for(int i = 0; i < A; i++) {
            String curr = q.poll();

            System.out.print(curr + " ");

            q.add(curr + "1");
            q.add(curr + "2");
            q.add(curr + "3");
        }
    }
}
